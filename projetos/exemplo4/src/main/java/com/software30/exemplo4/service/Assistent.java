package com.software30.exemplo4.service;

import com.software30.exemplo4.model.BookModel;
import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;

public interface Assistent {

    @SystemMessage(
            """
                    Você é um assistente de conversa. Responda de maneira amigável e
                    se não souber algo, apenas desculpe-se e diga que não pode ajudar pois não sabe do que se trata.
                    """
    )
    String chat(@MemoryId int  memoryId, @UserMessage String userMessage);

    @SystemMessage("Extrair informação  sobre um livro do {{text}}")

    BookModel extractBookFromText(@UserMessage @V("text") String text);
}