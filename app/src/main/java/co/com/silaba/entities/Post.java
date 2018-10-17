package co.com.silaba.entities;

public class Post {

    private String id;
    
    private String userId;
    
    private Double timestamp;
    
    private Integer likesCount;
    
    private Integer commentsCount;
    
    private Integer sharesCount;
    
    private Boolean isLiked;
    
    private Boolean isShared;
    
    private Boolean isVideo;
    
    private String message;
    
    private Photo photo;
    
    private String model;
    
    private MachineLearning visualIdentifier1;
    
    private MachineLearning visualIdentifier2;
    
    private Talent talent;


    public Post() {
        this.id = "";
        this.userId = "";
        this.timestamp = 0d;
        this.message = "";
        this.commentsCount = 0;
        this.likesCount = 0;
        this.isLiked = false;
        this.sharesCount = 0;
        this.isShared =false;
        this.photo = new Photo();
        this.isVideo = false;
        this.model = "";
        this.visualIdentifier1 = new MachineLearning();
        this.visualIdentifier2 = new MachineLearning();
        this.talent = new Talent();
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


    public Double getTimestamp() {
      return timestamp;
    }


    public void setTimestamp(Double timestamp) {
      this.timestamp = timestamp;
    }


    public Integer getLikesCount() {
      return likesCount;
    }


    public void setLikesCount(Integer likesCount) {
      this.likesCount = likesCount;
    }


    public Integer getCommentsCount() {
      return commentsCount;
    }


    public void setCommentsCount(Integer commentsCount) {
      this.commentsCount = commentsCount;
    }


    public Integer getSharesCount() {
      return sharesCount;
    }


    public void setSharesCount(Integer sharesCount) {
      this.sharesCount = sharesCount;
    }


    public Boolean getIsLiked() {
      return isLiked;
    }


    public void setIsLiked(Boolean isLiked) {
      this.isLiked = isLiked;
    }


    public Boolean getIsShared() {
      return isShared;
    }


    public void setIsShared(Boolean isShared) {
      this.isShared = isShared;
    }


    public Boolean getIsVideo() {
      return isVideo;
    }


    public void setIsVideo(Boolean isVideo) {
      this.isVideo = isVideo;
    }


    public String getMessage() {
      return message;
    }


    public void setMessage(String message) {
      this.message = message;
    }


    public Photo getPhoto() {
      return photo;
    }


    public void setPhoto(Photo photo) {
      this.photo = photo;
    }


    public String getModel() {
      return model;
    }


    public void setModel(String model) {
      this.model = model;
    }


    public MachineLearning getVisualIdentifier1() {
      return visualIdentifier1;
    }


    public void setVisualIdentifier1(MachineLearning visualIdentifier1) {
      this.visualIdentifier1 = visualIdentifier1;
    }


    public MachineLearning getVisualIdentifier2() {
      return visualIdentifier2;
    }


    public void setVisualIdentifier2(MachineLearning visualIdentifier2) {
      this.visualIdentifier2 = visualIdentifier2;
    }


    public Talent getTalent() {
      return talent;
    }


    public void setTalent(Talent talent) {
      this.talent = talent;
    }

    //TODO: Falta implementar extension extension extension Post: SnapshotParser de Post.swift

}
