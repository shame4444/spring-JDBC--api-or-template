package com.example.springjdbclearning;

import com.example.springjdbclearning.Dao.UserDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringjdbclearningApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringjdbclearningApplication.class, args);
        UserDAO dao = context.getBean(UserDAO.class);
        dao.readAndPrintUser();
    }

}
