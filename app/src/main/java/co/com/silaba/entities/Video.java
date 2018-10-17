package co.com.silaba.entities;

public class Video {
  
  private String videoTitle;
  
  private String videoSubTitle;
  
  private String channelId;
  
  private String imageUrl;
  
  private String videoId;
  
  private String viewCount;
  
  private String publishedAt;
  
  public Video () {
    this.videoTitle = "";
    this.videoSubTitle = "";
    this.channelId = "";
    this.imageUrl = "";
    this.videoId = "";
    this.viewCount = "";
    this.publishedAt = "";
}
  
  public Video (String videoTitle, String videoSubTitle, String channelId, String imageUrl, String videoId, String viewCount, String publishedAt) {
    this.videoTitle = videoTitle;
    this.videoSubTitle = videoSubTitle;
    this.channelId = channelId;
    this.imageUrl = imageUrl;
    this.videoId = videoId;
    this.viewCount = viewCount;
    this.publishedAt = publishedAt;
  }

  public String getVideoTitle() {
    return videoTitle;
  }

  public void setVideoTitle(String videoTitle) {
    this.videoTitle = videoTitle;
  }

  public String getVideoSubTitle() {
    return videoSubTitle;
  }

  public void setVideoSubTitle(String videoSubTitle) {
    this.videoSubTitle = videoSubTitle;
  }

  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public String getVideoId() {
    return videoId;
  }

  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }

  public String getViewCount() {
    return viewCount;
  }

  public void setViewCount(String viewCount) {
    this.viewCount = viewCount;
  }

  public String getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(String publishedAt) {
    this.publishedAt = publishedAt;
  }
  
}
