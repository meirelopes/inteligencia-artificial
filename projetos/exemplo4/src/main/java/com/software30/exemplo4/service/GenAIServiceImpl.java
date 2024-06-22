package com.software30.exemplo4.service;

import com.software30.exemplo4.controller.dto.ChatRequest;
import com.software30.exemplo4.model.BookModel;
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

    @Override
    public BookModel getBookModelFromText(String question) {
        return assistent.extractBookFromText(question);
    }
}
