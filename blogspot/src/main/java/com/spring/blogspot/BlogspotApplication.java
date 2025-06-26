package com.spring.blogspot;

// import com.spring.blogspot.User.user;
import com.spring.blogspot.User.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BlogspotApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogspotApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserRepository userRepository) {
        return args -> {
            // Insert a new user
            // user newUser = new user("Ravi", "password123", 26, "Male", "IT", "U200");
            // int rows = userRepository.insertUser(newUser);

            // if (rows == 1) {
            //     System.out.println("User inserted successfully!");
            // } else {
            //     System.out.println("Insert failed.");
            // }

            // // Optionally, fetch all users
            // userRepository.findAll().forEach(System.out::println);
        };
    }
}
