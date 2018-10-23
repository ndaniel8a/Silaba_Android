package co.com.silaba.services.user;


public class UserServiceException extends Exception {

  /**
   * 
   */
  private static final long serialVersionUID = 4048697707713702279L;

  public enum UserServiceExceptionType {
    AUTHENTICATION_NOT_FOUND,
    FAILED_TO_FETCH_BASIC_INFO,
    FAILED_TO_FOLLOW,
    FAILED_TO_UNFOLLOW,
    FAILED_TO_FETCH_FOLLOWERS,
    FAILED_TO_FETCH_FOLLOWING,
    FAILED_TO_FETCH_PROFILE,
    FAILED_TO_FETCH_ACTIVITIES,
    FAILED_TO_EDIT_PROFILE,
    FAILED_TO_CHANGE_AVATAR,
  }
  

  private UserServiceExceptionType type;

  public UserServiceException(UserServiceExceptionType type, String message) {
    super(message);
    this.type = type;
  }

  public UserServiceExceptionType getType() {
    return type;
  }

  public void setType(UserServiceExceptionType type) {
    this.type = type;
  }
  
}
