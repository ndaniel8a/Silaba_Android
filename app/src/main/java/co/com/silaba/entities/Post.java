package co.com.silaba.entities;

public class Post {

    public String id;
    public String userId;
    public Double timestamp;
    public Integer likesCount;
    public Integer commentsCount;
    public Integer sharesCount;
    public Boolean isLiked;
    public Boolean isShared;
    public Boolean isVideo;
    public String message;
    public Photo photo;
    public String model;
    public MachineLearning visualIdentifier1;
    public MachineLearning visualIdentifier2;
    public Talent talent;


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
        talent = new Talent();

    }

}
