package com.icebeal.cleanarchitecture.data

import com.icebeal.cleanarchitecture.domain.MessageEntity

class DataSource : IDataSource {

    override fun getMessage(name: String): MessageEntity = MessageEntity("Hello $name")

}