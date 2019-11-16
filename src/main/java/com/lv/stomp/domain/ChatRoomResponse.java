package com.lv.stomp.domain;

/**
 * @author 吕明亮
 * @Date : 2019/11/15 17:05
 * @Description:
 */
public class ChatRoomResponse {
    private String name;
    private String chatValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChatValue() {
        return chatValue;
    }

    public void setChatValue(String chatValue) {
        this.chatValue = chatValue;
    }

    @Override
    public String toString() {
        return "ChatRoomResponse{" +
                "name='" + name + '\'' +
                ", chatValue='" + chatValue + '\'' +
                '}';
    }
}
