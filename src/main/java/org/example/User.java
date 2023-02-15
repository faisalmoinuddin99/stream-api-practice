package org.example;

public class User {
    private int id ;
    private String firstName ;
    private String city ;

    public User(int id, String firstName, String city) {
        this.id = id;
        this.firstName = firstName;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
