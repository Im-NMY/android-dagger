package com.example.android.dagger.di

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [TestStorageModule::class,AppSubComponent::class])
interface TestAppComponent: AppComponent