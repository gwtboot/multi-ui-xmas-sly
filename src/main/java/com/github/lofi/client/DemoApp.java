package com.github.lofi.client;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.dncomponents.bootstrap.client.BootstrapUi;
import com.dncomponents.client.components.core.AppTemplates;
import com.dncomponents.client.views.Ui;

import elemental2.dom.DomGlobal;

@Singleton
public class DemoApp {

	@Inject
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
