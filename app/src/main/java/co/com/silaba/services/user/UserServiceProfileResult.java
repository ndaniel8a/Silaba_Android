package co.com.silaba.services.user;

import co.com.silaba.entities.Profile;
import co.com.silaba.entities.User;

public class UserServiceProfileResult {
  
  private User user;

  private Profile profile;
  
  private Boolean isFollowed = false;

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Profile getProfile() {
    return profile;
  }

  public void setProfile(Profile profile) {
    this.profile = profile;
  }

  public Boolean getIsFollowed() {
    return isFollowed;
  }

  public void setIsFollowed(Boolean isFollowed) {
    this.isFollowed = isFollowed;
  }
  
}
