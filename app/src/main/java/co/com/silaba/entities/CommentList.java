package co.com.silaba.entities;

import java.util.List;

public class CommentList {

    public List<Comment> comments;

    public List<User> users;

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
