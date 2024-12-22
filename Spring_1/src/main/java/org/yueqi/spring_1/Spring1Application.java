package org.yueqi.spring_1;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring1Application {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(Spring1Application.class);
        app.setBannerMode(Banner.Mode.OFF);//添加横幅
        app.run(args);
    }

}
