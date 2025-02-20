package com.min.aiproject.controller.ai;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChatRequest {
    private String userMessage;
}
