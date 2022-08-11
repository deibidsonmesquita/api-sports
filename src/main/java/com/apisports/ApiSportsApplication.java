package com.apisports;

import com.apisports.repository.ClubeRepositorio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class ApiSportsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiSportsApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ClubeRepositorio repositorio) {
        return args -> {
            System.out.println("Executando api..");
        };
    }

/*    @Bean
    @Primary
    public PasswordEncoder getPasswordEncoder() {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder;
    }*/
}
