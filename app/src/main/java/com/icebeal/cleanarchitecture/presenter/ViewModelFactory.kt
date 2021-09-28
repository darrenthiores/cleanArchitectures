package com.icebeal.cleanarchitecture.presenter

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.icebeal.cleanarchitecture.di.Injection
import com.icebeal.cleanarchitecture.domain.IMessageUseCase

class ViewModelFactory(private val messageUseCase: IMessageUseCase) : ViewModelProvider.NewInstanceFactory() {

    companion object{

        @Volatile
        private var instance:ViewModelFactory? = null

        fun getInstance() : ViewModelFactory{

            return instance ?: synchronized(this){

                instance ?: ViewModelFactory(Injection.provideUseCase()).apply { instance = this }

            }

        }

    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        when{

            modelClass.isAssignableFrom(MainViewModel::class.java) -> {

                return MainViewModel(messageUseCase) as T

            }

            else -> throw Throwable("Error : ${modelClass.name}")

        }

    }

}