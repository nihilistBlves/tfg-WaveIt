package org.tfg.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sendgrid.SendGrid;

@Configuration
public class SendGridConfig {

	@Value("${SENDGRID_KEY}")
	private String appKey;

	@Bean
	public SendGrid getSendGrid() {
		return new SendGrid(appKey);

	}
}
