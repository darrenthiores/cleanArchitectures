package com.icebeal.cleanarchitecture.data

import com.icebeal.cleanarchitecture.domain.MessageEntity

interface IDataSource {

    fun getMessage(name:String) : MessageEntity

}