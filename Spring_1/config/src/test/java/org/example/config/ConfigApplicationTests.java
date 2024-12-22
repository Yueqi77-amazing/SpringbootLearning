package org.example.config;

import org.example.config.beans.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class ConfigApplicationTests {
    @Autowired
    private User user;
    @Test
    void contextLoads() {
        System.out.println(user);
    }

}
