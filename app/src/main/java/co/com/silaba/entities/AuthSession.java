package co.com.silaba.entities;

public class AuthSession {

    private User user;


    AuthSession () {
        //TODO: Revisar el init() de AuthSession.swift para determinar si se debe implementar en este constructor
    }

    public  boolean isValid() {
        return (user == null || user.getId() == null) ? false : true;
     }
}
