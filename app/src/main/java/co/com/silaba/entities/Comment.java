package co.com.silaba.entities;

public class Comment {

    private String id;

    private String message;

    private Long timestamp;

    private String userId;

    Comment() {
        id = "";
        message = "";
        timestamp = 0l;
        userId = "";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    //TODO: Falta implementar extension Comment: SnapshotParser de Comment.swift
}
