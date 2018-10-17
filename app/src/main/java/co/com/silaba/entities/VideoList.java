package co.com.silaba.entities;

import java.util.ArrayList;
import java.util.List;

public class VideoList {

  public enum VideoListSource {
    GENERAL,
    SILABERS,
    RECOMMEND
  }
  
  private List<Video> videos;
  
  private VideoListSource source;
  
  public VideoList() {
    this.videos = new ArrayList<Video>();
    this.source = VideoListSource.GENERAL;
  }


  public Integer getCount() {
    return ( this.videos == null ? 0 : this.videos.size() );
  }


  public List<Video> getVideos() {
    return videos;
  }


  public void setVideos(List<Video> videos) {
    this.videos = videos;
  }


  public VideoListSource getSource() {
    return source;
  }


  public void setSource(VideoListSource source) {
    this.source = source;
  }
  
  public Video sucribe (int index) {
    if( index >= 0 && this.videos != null && ! this.videos.isEmpty()  ) {
      return this.videos.get(index);
    }

    return  null;
  }
  
}
