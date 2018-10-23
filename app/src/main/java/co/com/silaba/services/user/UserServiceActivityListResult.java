package co.com.silaba.services.user;

import co.com.silaba.entities.ActivityList;

public class UserServiceActivityListResult {
  
  private ActivityList list;
  
  private String nextOffset;

  public ActivityList getList() {
    return list;
  }

  public void setList(ActivityList list) {
    this.list = list;
  }

  public String getNextOffset() {
    return nextOffset;
  }

  public void setNextOffset(String nextOffset) {
    this.nextOffset = nextOffset;
  }
  
}
