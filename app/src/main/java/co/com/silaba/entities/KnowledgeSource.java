package co.com.silaba.entities;

public class KnowledgeSource {


    public enum knowledgeSourceType {
        VIDEOS,
        TRADUCTION,
        GENERAL,
        SILABERS,
        RECOMMEND,
        WIKIPEDIA,
        OPENDATA,
        REALITY_AUGMENTED
    }

    private String id;

    private Long timestamp;

    private knowledgeSourceType type;

    private String url;

    public KnowledgeSource() {
        this.id = "";
        this.timestamp = 0l;
        this.type = knowledgeSourceType.RECOMMEND;
        this.url = "";
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

    public knowledgeSourceType getType() {
        return type;
    }

    public void setType(knowledgeSourceType type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    //TODO: Falta implementar extension KnowledgeSrc: SnapshotParser de knowledgeSource.swift
}
