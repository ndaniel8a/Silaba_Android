package co.com.silaba.services.user;

import java.util.List;

import co.com.silaba.entities.User;

public class UserServiceFollowListResult {

  private List<User> users;
  
  private String nextOffset;
  
  private List<Boolean> following;

  public List<Boolean> getFollowing() {
    return following;
  }

  public List<User> getUsers() {
    return users;
  }

  public void setUsers(List<User> users) {
    this.users = users;
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
