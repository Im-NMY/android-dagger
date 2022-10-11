package com.example.android.dagger.di

import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module
import javax.inject.Inject

@Module
abstract class TestStorageModule {
    @Binds
    abstract fun provideStorage(storage: FakeStorage):Storage
}
class FakeStorage @Inject constructor() : Storage {

    private val map = mutableMapOf<String, String>()

    override fun setString(key: String, value: String) {
        map[key] = value
    }

    override fun getString(key: String): String {
        return map[key].orEmpty()
    }
}