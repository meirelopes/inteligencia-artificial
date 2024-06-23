package com.software30.desafio1.service;

import com.software30.desafio1.controlller.dto.ChatRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GenAIServiceImpl implements GenAIService{

    private final Assistent assistent;
    private final RAGAssistent ragAssistent;
    @Override
    public String getResponse(ChatRequest chatRequest) {
        return assistent.chat(chatRequest.userId(), chatRequest.question());
    }

    @Override
    public String getResponseExtended(ChatRequest chatRequest) {
        return ragAssistent.chat(chatRequest.userId(), chatRequest.question());
    }

}

