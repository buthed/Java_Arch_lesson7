package com.tematihonov;

public class UserController {
    private User model;
    private UserView view;

    public UserController(User model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void setUserName(String name){
        model.setName(name);
    }

    public String getUserName(){
        return model.getName();
    }

    public void setUserPosition(String position){
        model.setPosition(position);
    }

    public String getUserPosition(){
        return model.getPosition();
    }

    public void updateView(){
        view.displayUser(model.getName(), model.getPosition(), model.getExperience());
    }
}
