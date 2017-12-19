package cn.org.jetbrains.initializr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InitializrApplication {

    public static void main(String[] args) {
        //dev 合并到 master test
        SpringApplication.run(InitializrApplication.class, args);
    }
}
