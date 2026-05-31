package com.SaludUnificada.Esu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EsuApplication {

    private static final Logger log = LoggerFactory.getLogger(EsuApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EsuApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void logSwaggerUrl() {
        log.info("=========================================================");
        log.info("📄 Documentación Swagger UI disponible en:");
        log.info("👉 http://localhost:8080/swagger-ui.html");
        log.info("=========================================================");
    }
}