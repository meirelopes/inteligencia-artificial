package com.software30.exemplo4.controller;

import com.software30.exemplo4.controller.dto.ChatRequest;
import com.software30.exemplo4.controller.dto.ChatResponse;
import com.software30.exemplo4.model.BookModel;
import com.software30.exemplo4.service.GenAIService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/chat")
public class GenerativeController {
    private final GenAIService genAIService;

    @PostMapping
    public ChatResponse getChatResponse(@RequestBody ChatRequest request) {
        return new ChatResponse(genAIService.getResponse(request));
    }

    @PostMapping("/book")
    public BookModel getBookModelFromText(@RequestBody ChatRequest chatRequest) {
        return genAIService.getBookModelFromText(chatRequest.question());
    }
}