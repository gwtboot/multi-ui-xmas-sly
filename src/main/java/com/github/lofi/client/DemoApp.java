package com.github.lofi.client;

import com.dncomponents.bootstrap.client.BootstrapUi;
import com.dncomponents.client.components.core.AppTemplates;
import com.dncomponents.client.views.Ui;

import elemental2.dom.DomGlobal;

public class DemoApp {

	public DemoApp() {
		// Domino
		// Layout.create("Hello Many Worlds!").show();

		// DnComponents
		Ui.set(new BootstrapUi());
		AppTemplates.register();
		MainApp mainApp = new MainApp();
		DomGlobal.document.getElementById("dncomponents").appendChild(mainApp.asElement());
	}
}
