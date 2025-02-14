package com.min.aiproject.controller.ai;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Tag(name = "1. AI Chat", description = "채팅")
@RestController
@RequestMapping("/chat")
@RequiredArgsConstructor
public class AiController {
}
