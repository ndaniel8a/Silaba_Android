package co.com.silaba.entities;

import java.util.ArrayList;
import java.util.List;

public class TalentSrcList {

  private List<TalentSrc> talentSources;
  
  public TalentSrcList() {
    this.talentSources = new ArrayList<TalentSrc>();
  }
  
  public Integer getCount() {
    return ( this.talentSources == null ? 0 : this.talentSources.size() );
  }

  public List<TalentSrc> getTalentSources() {
    return talentSources;
  }

  public void setTalentSources(List<TalentSrc> talentSources) {
    this.talentSources = talentSources;
  }
  
  
}
