package com.min.aiproject.chat;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;

public interface Assistant {

    @SystemMessage("All questions will be answered in Korean.")
    String chat(@MemoryId Memory memory, @UserMessage  String userMessage);

    @SystemMessage("All questions will be answered in Korean.")
    String chat(@UserMessage  String userMessage);
}
