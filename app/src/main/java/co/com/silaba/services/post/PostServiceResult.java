package co.com.silaba.services.post;

import java.util.List;

import co.com.silaba.entities.Post;
import co.com.silaba.entities.PostList;
import co.com.silaba.entities.User;


public class PostServiceResult {

  private PostList posts;

  private String nextOffset;
  
  public PostServiceResult() {
    posts = new PostList();
  }

  public PostList getPosts() {
    return posts;
  }

  public void setPosts(PostList posts) {
    this.posts = posts;
  }

  public String getNextOffset() {
    return nextOffset;
  }

  public void setNextOffset(String nextOffset) {
    this.nextOffset = nextOffset;
  }
  
  
  public void add(PostList postList) {
    final List<Post> posts = postList.getPosts();
    final List<User> users = postList.getUsers();
    
    for (Post post : posts) {
      this.posts.getPosts().add(post);
      if( this.posts.getUsers().contains(User.getUser(post.getUserId())) ) {
        this.posts.getUsers().set(this.posts.getUsers().indexOf(User.getUser(post.getUserId())), users.get(users.indexOf(User.getUser(post.getUserId()))) );
      }
    }
    
  }
  
}
