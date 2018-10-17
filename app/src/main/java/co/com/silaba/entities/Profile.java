package co.com.silaba.entities;

public class Profile {
  
  private String userId;
  
  private String bio;
  
  private Integer postsCount;
  
  private Integer followersCount;
  
  private Integer followingCount;

  
  public Profile() {
    this.userId = "";
    this.bio = "";
    this.postsCount = 0;
    this.followersCount = 0;
    this.followingCount = 0; 
  }


  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public String getBio() {
    return bio;
  }


  public void setBio(String bio) {
    this.bio = bio;
  }


  public Integer getPostsCount() {
    return postsCount;
  }


  public void setPostsCount(Integer postsCount) {
    this.postsCount = postsCount;
  }


  public Integer getFollowersCount() {
    return followersCount;
  }


  public void setFollowersCount(Integer followersCount) {
    this.followersCount = followersCount;
  }


  public Integer getFollowingCount() {
    return followingCount;
  }


  public void setFollowingCount(Integer followingCount) {
    this.followingCount = followingCount;
  }
  
  //TODO: Falta implementar extension Profile: SnapshotParser de Profile.swift
  
}
