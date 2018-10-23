package co.com.silaba.entities;

import java.util.ArrayList;
import java.util.List;

public class PostList {

  private List<Post> posts;

  private List<User> users;
  
  public PostList() {
    this.posts = new ArrayList<Post>();
    this.users = new ArrayList<User>();
  }
  
  
  public List<Post> getPosts() {
    return posts;
  }

  public void setPosts(List<Post> posts) {
    this.posts = posts;
  }

  public List<User> getUsers() {
    return users;
  }

  public void setUsers(List<User> users) {
    this.users = users;
  }

  public Integer getCount() {
    return ( this.posts == null ? 0 : this.posts.size() );
  }
  
  public Post suscribePost(int index) {
    if( index >= 0 && this.posts != null && ! this.posts.isEmpty()  ) {
        return this.posts.get(index);
    }

    return  null;
  }
  
  public User suscribeUser(int index) {
    if( index >= 0 && this.users != null && ! this.users.isEmpty()  ) {
        return this.users.get(index);
    }

    return  null;
  }


  public User getUserById(String userId) {
    if( this.users != null && userId != null ) {
      User u = new User();
      u.setId(userId);
      return this.users.
    }
  }
  
}
  

