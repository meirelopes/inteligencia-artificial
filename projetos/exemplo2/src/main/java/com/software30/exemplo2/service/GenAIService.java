package com.software30.exemplo2.service;

import com.software30.exemplo2.controller.dto.ChatRequest;

public interface GenAIService {
    String getResponse(ChatRequest chatRequest);

}
