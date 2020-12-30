package com.github.lofi.client.ui.counter;

import com.axellience.vuegwt.core.client.Vue;
import com.axellience.vuegwt.core.client.VueGWT;
import com.dncomponents.UiField;
import com.dncomponents.client.components.core.HtmlBinder;
import com.dncomponents.client.views.IsElement;

import elemental2.dom.HTMLElement;

public class CounterViewImpl implements IsElement<HTMLElement> {

	private static CounterViewImpl instance;

	@UiField
	HTMLElement root;

	{
		HtmlBinder.get(CounterViewImpl.class, this).bind();
	}

	public CounterViewImpl() {
		init();
	}

	private void init() {

	}

	public void initVue() {
		VueGWT.init();
		Vue.attach("#simpleCounterComponentContainer2", CounterComponentFactory.get());
	}

	@Override
	public HTMLElement asElement() {
		return root;
	}

	public static CounterViewImpl getInstance() {
		if (instance == null) {
			instance = new CounterViewImpl();
		}

		return instance;
	}

}
