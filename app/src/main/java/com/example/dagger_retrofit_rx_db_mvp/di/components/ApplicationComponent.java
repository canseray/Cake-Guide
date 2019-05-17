package com.example.dagger_retrofit_rx_db_mvp.di.components;

import com.example.dagger_retrofit_rx_db_mvp.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

//singleton: 
//component:

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
}
