package com.software30.exemplo3.service;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;

public interface Assistent {

    @SystemMessage(
            """
                    Você é um assistente de conversa. Responda de maneira amigável e
                    se n~so souber algo, apenas desculpe-se e diga que não pode ajudar pois não sabe do que se trata.
                    """
    )
    String chat(@MemoryId int  memoryId, @UserMessage String userMessage);
}
