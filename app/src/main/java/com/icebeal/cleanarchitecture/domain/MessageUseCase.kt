package com.icebeal.cleanarchitecture.domain

class MessageUseCase(private val messageRepository: IMessageRepository) : IMessageUseCase {

    override fun getMessage(name: String): MessageEntity = messageRepository.getMessage(name)

}