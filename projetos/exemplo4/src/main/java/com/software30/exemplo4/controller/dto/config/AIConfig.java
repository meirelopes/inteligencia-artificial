package com.software30.exemplo4.controller.dto.config;

import com.software30.exemplo4.service.Assistent;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.service.AiServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AIConfig {
    @Bean
    public Assistent assistent() {
        return AiServices.builder(Assistent.class)
                .chatLanguageModel(chatLanguageModel())
                .chatMemoryProvider(memoryId -> MessageWindowChatMemory.withMaxMessages(10))
                .build();
    }
    @Bean
    public ChatLanguageModel chatLanguageModel() {
        String apiKey = System.getenv("OPENAI_API_KEY");
        return new OpenAiChatModel.OpenAiChatModelBuilder()
                .apiKey(apiKey)
                .modelName("gpt-3.5-turbo")
                .responseFormat("json_object")
                .temperature(0.7)
                .build();
    }
}
