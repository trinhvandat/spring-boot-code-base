package org.dattv.codebase.core.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "ore.dattv.codebase.core.entity")
@EnableJpaAuditing
@EnableJpaRepositories(basePackages = "org.dattv.codebase.core.repository")
public class CoreBusinessConfiguration {
}
