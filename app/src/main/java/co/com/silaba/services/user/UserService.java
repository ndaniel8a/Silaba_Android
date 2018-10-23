package co.com.silaba.services.user;

public interface UserService {

  
  public abstract UserServiceBasicResult fetchBasicInfo(String id) throws UserServiceException;
  
  public abstract void follow(String id) throws UserServiceException;
  
  public abstract void unfollow(String id) throws UserServiceException;
  
  public abstract UserServiceFollowListResult fetchFollowers(String id, String offset, Integer limit) throws UserServiceException;
  
  public abstract UserServiceFollowListResult fetchFollowing(String id, String offset, Integer limit) throws UserServiceException;
  
  public abstract UserServiceProfileResult fetchProfile(String id) throws UserServiceException;
  
  public abstract UserServiceActivityListResult fetchActivities(String id, String offset, Integer limit) throws UserServiceException;
  
  public abstract UserServiceProfileEditResult editProfile(UserServiceProfileEditResult data) throws UserServiceException;
  
}
