package org.dattv.codebase.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@SpringBootApplication
public class MainApiApplication implements CommandLineRunner {

  @Value("${s1}")
  private String s1;

  public static void main(String[] args) {
    SpringApplication.run(MainApiApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    log.info(
        "(start application)time: {}",
        LocalDateTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss dd-MM-yyy")));
    log.info("(author)name: {}", "Leonard Trinh");
    log.info("(Organization)name: {}", "All in blessing");
    log.info("(testConfig)s1: {}", s1);
  }
}
