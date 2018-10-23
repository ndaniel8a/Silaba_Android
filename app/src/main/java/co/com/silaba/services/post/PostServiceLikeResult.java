package co.com.silaba.services.post;

import java.util.List;

import co.com.silaba.entities.User;

public class PostServiceLikeResult {
  
  private List<User> likes;
  
  private List<Boolean> following;
  
  private String nextOffset;

  public List<User> getLikes() {
    return likes;
  }

  public void setLikes(List<User> likes) {
    this.likes = likes;
  }

  public List<Boolean> getFollowing() {
    return following;
  }

  public void setFollowing(List<Boolean> following) {
    this.following = following;
  }

  public String getNextOffset() {
    return nextOffset;
  }

  public void setNextOffset(String nextOffset) {
    this.nextOffset = nextOffset;
  }


}
