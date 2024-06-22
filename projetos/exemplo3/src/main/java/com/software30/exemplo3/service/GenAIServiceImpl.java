package com.software30.exemplo3.service;

import com.software30.exemplo3.controller.dto.ChatRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class GenAIServiceImpl implements GenAIService{

    private final Assistent assistent;
    @Override
    public String getResponse(ChatRequest chatRequest) {
        return assistent.chat(chatRequest.userId(), chatRequest.question());
    }
}
