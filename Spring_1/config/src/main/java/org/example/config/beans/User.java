package org.example.config.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "user")
public class User {
    private String username;
    private int age;
    private RabbitConnectionDetails.Address address;
    private Date birthday;
    private List<String> hobbies;
    private Map<Integer,String> girlfriends;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public RabbitConnectionDetails.Address getAddress() {
        return address;
    }

    public void setAddress(RabbitConnectionDetails.Address address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<Integer, String> getGirlfriends() {
        return girlfriends;
    }

    public void setGirlfriends(Map<Integer, String> girlfriends) {
        this.girlfriends = girlfriends;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", birthday=" + birthday +
                ", hobbies=" + hobbies +
                ", girlfriends=" + girlfriends +
                '}';
    }
}
