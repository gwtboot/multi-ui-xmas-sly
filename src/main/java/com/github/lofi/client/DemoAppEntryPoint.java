package com.github.lofi.client;

import java.util.logging.Logger;

import com.google.gwt.core.client.EntryPoint;

public class DemoAppEntryPoint implements EntryPoint {

	private static Logger logger = Logger.getLogger(DemoAppEntryPoint.class.getName());

	@Override
	public void onModuleLoad() {
		logger.info("Create component Dagger2");
		DaggerDemoAppComponent.builder().build().getDemoApp();
	}
}
