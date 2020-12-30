package com.github.lofi.client;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = { DemoAppModule.class })
public interface DemoAppComponent {

	DemoApp getDemoApp();

}
