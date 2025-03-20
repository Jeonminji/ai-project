package com.min.aiproject.chat;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChatRequest {
    private String userMessage;
}
