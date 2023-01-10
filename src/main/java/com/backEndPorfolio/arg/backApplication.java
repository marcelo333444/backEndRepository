package com.backEndPorfolio.arg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class backApplication {

    public static void main(String[] args) {
        SpringApplication.run(backApplication.class, args);
    }
//@Bean
    //CorsConfigurationSource corsConfigurationSource() {
    //CorsConfiguration cc = new CorsConfiguration();
    //cc.setAllowedHeaders(Arrays.asList("Origin,Accept", "X-Requested-With", "Content-Type", "Access-Control-Request-Method", "Access-Control-Request-Headers", "Authorization"));
    //cc.setExposedHeaders(Arrays.asList("Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
    //cc.setAllowedOrigins(Arrays.asList("/*"));
    //cc.setAllowedMethods(Arrays.asList("GET", "POST", "OPTIONS", "PUT", "PATCH"));
    //cc.addAllowedOrigin("*");
    //cc.setMaxAge(Duration.ZERO);
    //cc.setAllowCredentials(Boolean.TRUE);
    //UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    //source.registerCorsConfiguration("/**", cc);
    //return source;
    //}

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("https://portafolio-arg-prog.netlify.app");
            }
        };
    }

}
