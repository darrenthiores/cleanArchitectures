package com.icebeal.cleanarchitecture.data

import com.icebeal.cleanarchitecture.domain.IMessageRepository
import com.icebeal.cleanarchitecture.domain.MessageEntity

class MessageRepository(private val dataSource:IDataSource) : IMessageRepository {

    override fun getMessage(name: String): MessageEntity = dataSource.getMessage(name)

}