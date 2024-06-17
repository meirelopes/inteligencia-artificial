package com.software30.exemplo1.service;

import com.software30.exemplo1.controller.dto.ChatRequest;
import dev.langchain4j.model.openai.OpenAiChatModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GenAIServiceImpl implements GenAIService{
    @Override
    public String getResponse(ChatRequest chatRequest) {
        String apiKey = System.getenv("OPENAI_API_KEY");
        OpenAiChatModel model = new OpenAiChatModel.OpenAiChatModelBuilder()
                .apiKey(apiKey)
                .modelName("gpt-3.5-turbo")
                .temperature(0.7)
                .build();
        return model.generate(chatRequest.question());
    }
}
