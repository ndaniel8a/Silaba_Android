package co.com.silaba.entities;

public class Photo {


    private String url;

    private Integer width;

    private Integer height;

    private Boolean isVideo;

    public Photo() {
        this.url = "";
        this.width = 0;
        this.height = 0;
        this.isVideo = false;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Boolean getVideo() {
        return isVideo;
    }

    public void setVideo(Boolean video) {
        isVideo = video;
    }

    //TODO: Falta implementar extension extension Photo: SnapshotParser de Photo.swift
}
