package com.icebeal.cleanarchitecture.domain

import com.nhaarman.mockitokotlin2.verify
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MessageUseCaseTest{

    private lateinit var iMessageUseCase: IMessageUseCase

    @Mock
    private lateinit var iMessageRepository: IMessageRepository

    @Before
    fun setUp(){

        iMessageUseCase = MessageUseCase(iMessageRepository)
        val dummy = MessageEntity("Hello $NAME")
        `when`(iMessageRepository.getMessage(NAME)).thenReturn(dummy)

    }

    @Test
    fun `should get data from repository`(){

        val message = iMessageUseCase.getMessage(NAME)

        verify(iMessageRepository).getMessage(NAME)
        verifyNoMoreInteractions(iMessageRepository)

        assertEquals("Hello $NAME", message.message)

    }

    companion object{

        const val NAME = "Darren"

    }

}