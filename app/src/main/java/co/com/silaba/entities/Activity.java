package co.com.silaba.entities;

import java.util.Objects;

public class Activity {

    public enum ActivityType {

        UNKNOWN,
        LIKE,
        COMMENT,
        POST,
        FOLLOW;

    }

    private String id;

    private Long timestamp;

    private ActivityType type;

    private String userId;

    private String postId;

    private String commentId;

    public Activity () {
        type = ActivityType.UNKNOWN;
        timestamp = 0l;
        id = "";

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public ActivityType getType() {
        return type;
    }

    public void setType(ActivityType type) {
        this.type = type;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Activity activity = (Activity) o;
        return Objects.equals(id, activity.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    //TODO: En Activity.swift existe metodo init de extension Activity
}
