package co.com.silaba.entities;

public class TalentSrc {
  
  public enum TalentSrcType {
    NUMBERS,
    HISTORY,
    ART,
    SCIENCE,
    TECHNOLOGY,
    GENERAL
  }
  
  private String id;
  
  private Double timestamp;
  
  private TalentSrcType talentSource;
  
  private String url;
  
  public TalentSrc() {
  
    id = "";
    timestamp = 0d;
    talentSource = TalentSrcType.GENERAL;
    url ="";
        
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Double getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Double timestamp) {
    this.timestamp = timestamp;
  }

  public TalentSrcType getTalentSource() {
    return talentSource;
  }

  public void setTalentSource(TalentSrcType talentSource) {
    this.talentSource = talentSource;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
  
  //TODO: Falta implementar extension TalentSrc: SnapshotParser de TalentSource.swift
}
