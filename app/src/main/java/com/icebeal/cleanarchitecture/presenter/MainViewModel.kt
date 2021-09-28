package com.icebeal.cleanarchitecture.presenter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.icebeal.cleanarchitecture.domain.IMessageUseCase
import com.icebeal.cleanarchitecture.domain.MessageEntity

class MainViewModel(private val messageUseCase: IMessageUseCase) : ViewModel() {

    private val _message = MutableLiveData<MessageEntity>()
    val message : LiveData<MessageEntity> get() = _message

    fun setName(name:String){

        _message.value = messageUseCase.getMessage(name)

    }

}