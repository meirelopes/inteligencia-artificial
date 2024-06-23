package com.software30.desafio1.service;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;

public interface Assistent {

    @SystemMessage(
            """
                    Você é um assistente de conversa. Responda de maneira amigável, em formato json e
                    se não souber algo, apenas desculpe-se e diga que não pode ajudar pois não sabe do que se trata. 
                    Se for ler algum documento 
                    responda a pergunta em forma de uma redação atraente para o leitor.
                    """
    )
    String chat(@MemoryId int  memoryId, @UserMessage String userMessage);


}
