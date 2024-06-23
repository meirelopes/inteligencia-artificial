package com.software30.desafio1.controlller;

import com.software30.desafio1.controlller.dto.ChatRequest;
import com.software30.desafio1.controlller.dto.ChatResponse;
import com.software30.desafio1.service.GenAIService;
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
    private final LoadController loadController;

    @PostMapping
    public ChatResponse getChatResponse(@RequestBody ChatRequest request) {
        return new ChatResponse(genAIService.getResponse(request));
    }
    @PostMapping("/extended")
    public ChatResponse getChatResponseExtend(@RequestBody ChatRequest request) {
        loadController.loadSingle();
        return new ChatResponse(genAIService.getResponseExtended(request));
    }

}
