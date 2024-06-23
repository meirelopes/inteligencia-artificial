package com.software30.desafio1.service;

import com.software30.desafio1.controlller.dto.ChatRequest;

public interface GenAIService {
    String getResponse(ChatRequest chatRequest);

    String getResponseExtended(ChatRequest chatRequest);

}
