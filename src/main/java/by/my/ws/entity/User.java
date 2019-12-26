package by.my.ws.entity;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    private String name;
    private String login;
    private int age;
    private String password;

    public User(String name, String login, int age, String password) {
        this.name = name;
        this.login = login;
        this.age = age;
        this.password = password;
    }


    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(password);
//    }

//    ???

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}





