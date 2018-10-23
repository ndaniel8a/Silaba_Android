package co.com.silaba.services.post;

import java.util.List;

import co.com.silaba.entities.User;

public class PostServiceShareResult {
  
  private List<User> shares;
  
  private String nextOffset;
  
  private List<Boolean> following;

  public List<User> getShares() {
    return shares;
  }

  public void setShares(List<User> shares) {
    this.shares = shares;
  }

  public String getNextOffset() {
    return nextOffset;
  }

  public void setNextOffset(String nextOffset) {
    this.nextOffset = nextOffset;
  }

  public List<Boolean> getFollowing() {
    return following;
  }

  public void setFollowing(List<Boolean> following) {
    this.following = following;
  }


}
