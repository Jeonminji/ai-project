package com.min.aiproject.chat;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChatResponse {
    private String message;
}
