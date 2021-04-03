package com.github.lofi.client.ui.todo;

import java.util.logging.Logger;

import org.dominokit.domino.ui.button.Button;
import org.dominokit.domino.ui.cards.Card;
import org.dominokit.domino.ui.forms.FieldsGrouping;
import org.dominokit.domino.ui.forms.Select;
import org.dominokit.domino.ui.forms.TextArea;
import org.dominokit.domino.ui.forms.TextBox;

import com.dncomponents.UiField;
import com.dncomponents.client.components.core.HtmlBinder;
import com.dncomponents.client.views.IsElement;

import elemental2.dom.HTMLElement;

public class TodoViewImpl implements IsElement<HTMLElement> {
	
	private static Logger logger = Logger.getLogger(TodoViewImpl.class.getName());
	
	private static TodoViewImpl instance;
	
	public enum Priority {
        High, Medium, Low;
    }
	
	@UiField
	HTMLElement root;
	
	@UiField
	HTMLElement textBoxContainer;

	{
		HtmlBinder.get(TodoViewImpl.class, this).bind();
	}
	
	public TodoViewImpl() {
		init();
	}

	private void init() {
		TextBox textBox = TextBox.create("Todo List").floating();
		
		FieldsGrouping fieldsGrouping = FieldsGrouping.create();

		TextBox titleTextBox = TextBox.create("Title")
                .groupBy(fieldsGrouping)
                .setRequired(true)
                .setAutoValidation(true);

		TextArea descriptionTextArea = TextArea.create("Text")
                .groupBy(fieldsGrouping)
                .setRequired(true)
                .setAutoValidation(true)
                .setRows(5);

		Select<Priority> prioritySelect = Select.ofEnum("Urgent", Priority.values())
                .groupBy(fieldsGrouping)
                .setRequired(true)
                .setAutoValidation(true);
		
		textBoxContainer.append(textBox.element());
		
		Button addButton = Button.createPrimary("Add")
                .styler(style -> style.add("min-width:120px!important;"))
                .addClickListener(evt -> handleAddButtonClick());
		
		textBoxContainer.appendChild(Card.create("Todo", "Add")
                .appendChild(titleTextBox)
                .appendChild(descriptionTextArea)
                .appendChild(prioritySelect)
                .appendChild(addButton)
                .element());
	}

	private void handleAddButtonClick() {
		logger.info("Button is clicked");
	}

	public static TodoViewImpl getInstance() {
		if (instance == null) {
			instance = new TodoViewImpl();
		}

		return instance;
	}

	@Override
	public HTMLElement asElement() {
		return root;
	}

}
