package com.chat.weAsk.models;

public class messageFormat {
    private String content;

    public messageFormat() {
    }
    public  messageFormat(String content)
    {
        this.content=content;
    }

    public String getContent()
    {
        return this.content;
    }
}
