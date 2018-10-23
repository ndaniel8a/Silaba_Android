package co.com.silaba.services.post;

public class PostServiceException extends Exception {
  
  /**
   * 
   */
  private static final long serialVersionUID = 3275746352250600027L;

  public enum PostServiceExceptionType {
    AUTHENTICATION_NOT_FOUND,
    FAILED_TO_FETCH,
    FAILED_TO_WRITE,
    FAILED_TO_LIKE,
    FAILED_TO_UNLIKE,
    FAILED_TO_FETCH_LIKES,
    FAILED_TO_SHARE,
    FAILED_TO_UNSHARE,
    FAILED_TO_FETCH_SHARES
  }
  
  private PostServiceExceptionType type;

  public PostServiceException(PostServiceExceptionType type, String message) {
    super(message);
    this.type = type;
  }

  public PostServiceExceptionType getType() {
    return type;
  }

  public void setType(PostServiceExceptionType type) {
    this.type = type;
  }
  

}
