package com.github.lofi.client;

import java.util.logging.Logger;

import javax.inject.Singleton;

import com.dncomponents.UiField;
import com.dncomponents.client.components.AbstractCellComponent;
import com.dncomponents.client.components.core.HtmlBinder;
import com.dncomponents.client.components.core.entities.ItemId;
import com.dncomponents.client.components.sidemenu.SideMenu;
import com.dncomponents.client.dom.History;
import com.dncomponents.client.views.IsElement;
import com.dncomponents.client.views.appview.AcceptsOneElement;
import com.dncomponents.client.views.appview.PlaceManager;
import com.github.lofi.client.ui.counter.CounterPlace;
import com.github.lofi.client.ui.counter.CounterViewImpl;
import com.github.lofi.client.ui.home.HomePlace;
import com.github.lofi.client.ui.todo.TodoPlace;

import elemental2.dom.DomGlobal;
import elemental2.dom.Element;
import elemental2.dom.HTMLElement;
import elemental2.dom.Node;

@Singleton
public class MainApp implements AcceptsOneElement {

	private static Logger logger = Logger.getLogger(MainApp.class.getName());

	@UiField
	HTMLElement contentWrapper;

	@UiField
	public SideMenu<ItemId> side;

	PlaceManager placeManager = new PlaceManager(this);

	HtmlBinder<?> binder = HtmlBinder.get(MainApp.class, this);

	public MainApp() {
		binder.bind();
		init();

		side.setPlaceManager(placeManager);
		side.expandAll(false);
	}

	public void init() {
		placeManager.register(HomePlace.HomePlaceRegister.instance);
		placeManager.register(CounterPlace.CounterPlaceRegister.instance);
		placeManager.register(TodoPlace.TodoPlaceRegister.instance);

		placeManager.setHomePlace(HomePlace.class);
		History.fireCurrentHistoryState();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void setElement(IsElement element) {
		// This happens if you click the left menu item
		contentWrapper.innerHTML = "";
		contentWrapper.appendChild(element.asElement());
		AbstractCellComponent.resetScrollOnPage(contentWrapper);
		// Init Vue component
		Element elementById = DomGlobal.document.getElementById("simpleCounterComponentContainer2");
		if (elementById != null) {
			logger.info("simpleCounterComponentContainer2 found!");
			CounterViewImpl.getInstance().initVue();
		}
	}

	public Node asElement() {
		return binder.getTemplate().getCloned();
	}
}
