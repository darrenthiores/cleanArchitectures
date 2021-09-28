package com.icebeal.cleanarchitecture.di

import com.icebeal.cleanarchitecture.data.DataSource
import com.icebeal.cleanarchitecture.data.IDataSource
import com.icebeal.cleanarchitecture.data.MessageRepository
import com.icebeal.cleanarchitecture.domain.IMessageRepository
import com.icebeal.cleanarchitecture.domain.IMessageUseCase
import com.icebeal.cleanarchitecture.domain.MessageUseCase

object Injection {

    fun provideUseCase() : IMessageUseCase{

        val repository = provideRepository()
        return MessageUseCase(repository)

    }

    private fun provideRepository() : IMessageRepository {

        val dataSource = provideDataSource()
        return MessageRepository(dataSource)

    }

    private fun provideDataSource() : IDataSource = DataSource()

}