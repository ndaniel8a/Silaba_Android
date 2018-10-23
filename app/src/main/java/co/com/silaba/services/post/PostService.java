package co.com.silaba.services.post;

import co.com.silaba.entities.MachineLearningList;
import co.com.silaba.entities.Talent;
import co.com.silaba.entities.User;

public interface PostService {
  
  //TODO: init(session: AuthSession)
  
  public abstract PostServiceResult fetcPostInfo(String id) throws PostServiceException; 
  
  public abstract PostServiceResult fetchPosts(String userId, String offset, Integer limit ) throws PostServiceException;
  
  public abstract PostServiceResult writePost(String photoId, String content, MachineLearningList imageReconized, Talent talent) throws PostServiceException;
  
  public abstract PostServiceLikeResult fetchLikes(String id, String offset, Integer limit) throws PostServiceException;
  
  public abstract void like(String id) throws PostServiceException;
  
  public abstract void unlike(String id) throws PostServiceException;
  
  public abstract PostServiceShareResult fetchShares(String id, String offset, Integer limit) throws PostServiceException;
  
  public abstract void share(String id) throws PostServiceException;
  
  public abstract void unshare(String id) throws PostServiceException;
  
  public abstract User getUserFromUsername(String usersname) throws PostServiceException;
  
  public abstract PostServiceResult fetchDiscoveryPosts(String offset, Integer limit) throws PostServiceException;
  
  public abstract PostServiceResult fetchDiscoveryPosts(String recognized, String talentId, String offset, Integer limit) throws PostServiceException;
  
  public abstract PostServiceResult fetchLikedPosts(String userId, String offset, Integer limit) throws PostServiceException;
  
  public abstract PostServiceResult fetchRecommendPosts(String recognized, String talentId, String offset, Integer limit) throws PostServiceException;
  
  public abstract PostServiceResult fetchRecommendPosts(String offset, Integer limit) throws PostServiceException;
  
  public abstract PostServiceResult fetchTaggedPosts(String tag,  String offset, Integer limit) throws PostServiceException;

}
