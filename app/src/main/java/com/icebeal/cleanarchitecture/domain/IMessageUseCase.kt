package com.icebeal.cleanarchitecture.domain

interface IMessageUseCase {

    fun getMessage(name:String) : MessageEntity

}