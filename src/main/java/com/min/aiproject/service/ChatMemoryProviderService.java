package com.min.aiproject.service;

import dev.langchain4j.memory.chat.ChatMemoryProvider;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ChatMemoryProviderService {
    public ChatMemoryProvider getChatMemoryProvider(Integer messageSize) {
        return memory -> MessageWindowChatMemory.builder()
                .id(memory)
                .maxMessages(messageSize)
                .build();
    }
}
