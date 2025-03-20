package com.min.aiproject.controller.ai;

import com.min.aiproject.chat.ChatRequest;
import com.min.aiproject.chat.ChatResponse;
import com.min.aiproject.entity.TestEntity;
import com.min.aiproject.service.AiService;
import com.min.aiproject.service.TestService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Tag(name = "1. AI Chat", description = "채팅")
@RestController
@RequestMapping("/chat")
@RequiredArgsConstructor
public class AiController {
    private final AiService aiService;
    private final TestService testService;

    @PostMapping(value = "/message")
    public ResponseEntity<ChatResponse> chat(@RequestBody ChatRequest chatRequest) {
        return ResponseEntity.ok(ChatResponse.builder()
                .message(aiService.chat(chatRequest.getUserMessage()))
                .build());
    }

    @PostMapping(value = "/create")
    public String create(@RequestBody TestEntity testEntity) {
        try {
            testService.create(testEntity);
            return "success";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
