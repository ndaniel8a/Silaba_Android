/**
 * 
 */
package co.com.silaba.services.post;

import co.com.silaba.entities.MachineLearningList;
import co.com.silaba.entities.Talent;
import co.com.silaba.entities.User;

/**
 * @author nochoa
 *
 */
public class PostServiceProvider implements PostService {

  /* (non-Javadoc)
   * @see co.com.silaba.services.post.PostService#fetcPostInfo(java.lang.String)
   */
  @Override
  public PostServiceResult fetcPostInfo(String id) throws PostServiceException {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see co.com.silaba.services.post.PostService#fetchPosts(java.lang.String, java.lang.String, java.lang.Integer)
   */
  @Override
  public PostServiceResult fetchPosts(String userId, String offset, Integer limit) throws PostServiceException {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see co.com.silaba.services.post.PostService#writePost(java.lang.String, java.lang.String, co.com.silaba.entities.MachineLearningList, co.com.silaba.entities.Talent)
   */
  @Override
  public PostServiceResult writePost(String photoId, String content, MachineLearningList imageReconized, Talent talent) throws PostServiceException {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see co.com.silaba.services.post.PostService#fetchLikes(java.lang.String, java.lang.String, java.lang.Integer)
   */
  @Override
  public PostServiceLikeResult fetchLikes(String id, String offset, Integer limit) throws PostServiceException {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see co.com.silaba.services.post.PostService#like(java.lang.String)
   */
  @Override
  public void like(String id) throws PostServiceException {
    // TODO Auto-generated method stub

  }

  /* (non-Javadoc)
   * @see co.com.silaba.services.post.PostService#unlike(java.lang.String)
   */
  @Override
  public void unlike(String id) throws PostServiceException {
    // TODO Auto-generated method stub

  }

  /* (non-Javadoc)
   * @see co.com.silaba.services.post.PostService#fetchShares(java.lang.String, java.lang.String, java.lang.Integer)
   */
  @Override
  public PostServiceShareResult fetchShares(String id, String offset, Integer limit) throws PostServiceException {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see co.com.silaba.services.post.PostService#share(java.lang.String)
   */
  @Override
  public void share(String id) throws PostServiceException {
    // TODO Auto-generated method stub

  }

  /* (non-Javadoc)
   * @see co.com.silaba.services.post.PostService#unshare(java.lang.String)
   */
  @Override
  public void unshare(String id) throws PostServiceException {
    // TODO Auto-generated method stub

  }

  /* (non-Javadoc)
   * @see co.com.silaba.services.post.PostService#getUserFromUsername(java.lang.String)
   */
  @Override
  public User getUserFromUsername(String usersname) throws PostServiceException {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see co.com.silaba.services.post.PostService#fetchDiscoveryPosts(java.lang.String, java.lang.Integer)
   */
  @Override
  public PostServiceResult fetchDiscoveryPosts(String offset, Integer limit) throws PostServiceException {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see co.com.silaba.services.post.PostService#fetchDiscoveryPosts(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer)
   */
  @Override
  public PostServiceResult fetchDiscoveryPosts(String recognized, String talentId, String offset, Integer limit) throws PostServiceException {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see co.com.silaba.services.post.PostService#fetchLikedPosts(java.lang.String, java.lang.String, java.lang.Integer)
   */
  @Override
  public PostServiceResult fetchLikedPosts(String userId, String offset, Integer limit) throws PostServiceException {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see co.com.silaba.services.post.PostService#fetchRecommendPosts(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer)
   */
  @Override
  public PostServiceResult fetchRecommendPosts(String recognized, String talentId, String offset, Integer limit) throws PostServiceException {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see co.com.silaba.services.post.PostService#fetchRecommendPosts(java.lang.String, java.lang.Integer)
   */
  @Override
  public PostServiceResult fetchRecommendPosts(String offset, Integer limit) throws PostServiceException {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see co.com.silaba.services.post.PostService#fetchTaggedPosts(java.lang.String, java.lang.String, java.lang.Integer)
   */
  @Override
  public PostServiceResult fetchTaggedPosts(String tag, String offset, Integer limit) throws PostServiceException {
    // TODO Auto-generated method stub
    return null;
  }

}
