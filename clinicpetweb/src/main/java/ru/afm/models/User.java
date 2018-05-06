package ru.afm.models;

public class User {
    private int id;
    private String login;
    private String email;

    public User(){}

    public User(int id, String login, String email) {
        this.id = id;
        this.login = login;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id){this.id = id;}

    public void setLogin(String login) {
        this.login = login;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(this.getClass() != obj.getClass()){
            return false;
        }
        User user = (User) obj;
        if(this.getLogin().equals(user.getLogin())){
            return true;
        } else{
            return false;
        }
    }
}
