package com.software30.exemplo3.service;

import com.software30.exemplo3.controller.dto.ChatRequest;

public interface GenAIService {
    String getResponse(ChatRequest chatRequest);

}