package com.min.aiproject.chat;

import dev.langchain4j.service.SystemMessage;

public interface Assistant {

    @SystemMessage("All questions will be answered in Korean.")
    String chat(String userMessage);
}
