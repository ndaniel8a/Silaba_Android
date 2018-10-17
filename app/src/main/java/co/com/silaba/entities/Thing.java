package co.com.silaba.entities;

public class Thing {
  
  
  private String id;
  
  private Double timestamp;
  
  private Integer count;
  
  
  public Thing() {
    this.id = "";
    this.timestamp = 0d;
    this.count = 0;
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


  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }
  
  
  //TODO: Falta implementar extension Thing: SnapshotParser de Thing.swift
}
