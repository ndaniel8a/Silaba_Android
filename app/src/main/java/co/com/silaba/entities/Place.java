package co.com.silaba.entities;

public class Place {

    private String id;

    private String userId;

    private String banner;

    private String name;

    private String url;

    private String servicesUrl;


    public Place() {
        this.id = "";
        this.userId = "";
        this.banner = "";
        this.name = "";
        this.url = "";
        this.servicesUrl = "";
    }


    public String getId() {
      return id;
    }


    public void setId(String id) {
      this.id = id;
    }


    public String getUserId() {
      return userId;
    }


    public void setUserId(String userId) {
      this.userId = userId;
    }


    public String getBanner() {
      return banner;
    }


    public void setBanner(String banner) {
      this.banner = banner;
    }


    public String getName() {
      return name;
    }


    public void setName(String name) {
      this.name = name;
    }


    public String getUrl() {
      return url;
    }


    public void setUrl(String url) {
      this.url = url;
    }


    public String getServicesUrl() {
      return servicesUrl;
    }


    public void setServicesUrl(String servicesUrl) {
      this.servicesUrl = servicesUrl;
    }

    //TODO: Falta implementar extension extension Place: SnapshotParser de Place.swift

}
