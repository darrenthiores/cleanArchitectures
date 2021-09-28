package com.icebeal.cleanarchitecture.domain

interface IMessageRepository {

    fun getMessage(name:String) : MessageEntity

}