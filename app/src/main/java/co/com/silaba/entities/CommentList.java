package co.com.silaba.entities;

import java.util.ArrayList;
import java.util.List;

public class CommentList {

    private List<Comment> comments;

    private List<User> users;
    
    public CommentList() {
      this.comments = new ArrayList<Comment>();
      this.users = new ArrayList<User>();
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
