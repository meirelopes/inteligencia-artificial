package com.software30.exemplo4.service;

import com.software30.exemplo4.controller.dto.ChatRequest;
import com.software30.exemplo4.model.BookModel;

public interface GenAIService {
    String getResponse(ChatRequest chatRequest);

    BookModel getBookModelFromText(String question);
}