package com.innovation.resourceservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.expression.method.MethodSecurityExpressionHandler;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.provider.expression.OAuth2MethodSecurityExpressionHandler;

@SpringBootApplication
@EnableResourceServer
public class ResourceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResourceServiceApplication.class, args);
	}

	@Configuration
	@EnableGlobalMethodSecurity(prePostEnabled = true)
	public class MethodSecurityConfiguration extends GlobalMethodSecurityConfiguration {

		@Override
		protected MethodSecurityExpressionHandler createExpressionHandler() {
			return new OAuth2MethodSecurityExpressionHandler();
		}
	}

}
