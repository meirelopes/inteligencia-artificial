package com.software30.exemplo2.service;

import com.software30.exemplo2.controller.dto.ChatRequest;
import dev.langchain4j.data.message.ChatMessage;
import dev.langchain4j.data.message.SystemMessage;
import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.model.openai.OpenAiChatModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GenAIServiceImpl implements GenAIService{
    @Override
    public String getResponse(ChatRequest chatRequest) {
        List<ChatMessage> messages = new ArrayList<>();
        messages.add(SystemMessage.systemMessage("Responda em espanhol"));
        messages.add(UserMessage.userMessage(chatRequest.question()));
        String apiKey = System.getenv("OPENAI_API_KEY");
        OpenAiChatModel model = new OpenAiChatModel.OpenAiChatModelBuilder()
                .apiKey(apiKey)
                .modelName("gpt-3.5-turbo")
                .temperature(0.7)
                .build();
        return model.generate(messages).content().text();
    }
}
