package com.software30.exemplo1.service;

import com.software30.exemplo1.controller.dto.ChatRequest;

public interface GenAIService {
    String getResponse(ChatRequest chatRequest);

}