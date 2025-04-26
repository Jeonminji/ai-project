package com.min.aiproject.service;

import com.min.aiproject.chat.Assistant;
import com.min.aiproject.chat.Memory;
import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.memory.chat.ChatMemoryProvider;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.service.AiServices;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AiService {

    private final ChatMemoryProviderService chatMemoryProviderService;
    private final ChatMemory chatMemory = MessageWindowChatMemory.withMaxMessages(10);

    public String chat(String message) {

//        ChatMemoryProvider chatMemoryProvider = chatMemoryProviderService.getChatMemoryProvider(5);

        ChatLanguageModel model = OpenAiChatModel.builder()
                .apiKey("demo")
                .modelName("gpt-4o-mini")
                .temperature(0.5)   // 0 ~ 2 사이, 값 높을 수록 무작위 답변 생성
                .logRequests(true)
                .logResponses(true)
                .build();

        Assistant assistant = AiServices.builder(Assistant.class)
                .chatLanguageModel(model)
                .chatMemory(chatMemory)
//                .chatMemoryProvider(chatMemoryProvider)
                .build();

//        log.info("[AiService] getChatMemoryProvider : {}", chatMemoryProvider);

//        return assistant.chat(Memory.builder()
//                    .build()
//                , message);

        return assistant.chat(message);
    }
}
