package co.com.silaba.entities;

public class Talent {
  
  private String id;
  
  private String competencia;
  
  public Talent() {
    id = "";
    competencia = "";
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getCompetencia() {
    return competencia;
  }

  public void setCompetencia(String competencia) {
    this.competencia = competencia;
  }
  
  //TODO: Falta implementar eextension Talent: SnapshotParser de Talent.swift
  
}
