package com.yui.b

import dev.kord.core.Kord
import dev.kord.core.event.message.MessageCreateEvent
import dev.kord.core.on
import dev.kord.gateway.Intent
import dev.kord.gateway.PrivilegedIntent

suspend fun main(){
    val token: String = System.getenv("BOT_TOKEN") ?: error("A variável de ambiente 'BOT_TOKEN' não foi encontrada na configuração")

    println("Bot Selene acordando...")

    val kord = Kord(token = token)

    kord.on<MessageCreateEvent>{
        if(message.author?.isBot != false) return@on

        if(message.content != "!ping") return@on

        message.channel.createMessage("pong")
    }

    kord.login{
        @OptIn(PrivilegedIntent::class)
        intents += Intent.MessageContent
        println("✅ Bot inicializado com sucesso!")
    }


}