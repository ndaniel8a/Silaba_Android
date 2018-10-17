package co.com.silaba.entities;

import java.util.ArrayList;
import java.util.List;

public class TalentList {
  
  private List<Talent> talents;
  
  public TalentList() {
    this.talents = new ArrayList<Talent>();
  }
  
  public Integer getCount() {
    return ( this.talents == null ? 0 : this.talents.size() );
  }

  public List<Talent> getTalents() {
    return talents;
  }

  public void setTalents(List<Talent> talents) {
    this.talents = talents;
  }
  

}
