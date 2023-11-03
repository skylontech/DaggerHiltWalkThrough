package com.example.daggerhiltwalkthrough.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject

@Module
@InstallIn(SingletonComponent::class)
object MainModule {
    @Provides
    fun providesCar() = Car()
}

class Car @Inject constructor()