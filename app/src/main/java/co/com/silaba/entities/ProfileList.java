package co.com.silaba.entities;

import java.util.ArrayList;
import java.util.List;

public class ProfileList {
  
  private List<Profile> profiles;
  
  
  public ProfileList () {
    this.profiles = new ArrayList<Profile>();
  }
  
  public Integer getCount() {
    return ( this.profiles == null ? 0 : this.profiles.size() );
  }

  public List<Profile> getProfiles() {
    return profiles;
  }

  public void setProfiles(List<Profile> profiles) {
    this.profiles = profiles;
  }

}
