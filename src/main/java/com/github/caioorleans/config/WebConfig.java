package com.github.caioorleans.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{

	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		
		configurer.favorParameter(false) //determina se um parâmetro de solicitação deve ser usado para determinar o tipo de mídia
		.ignoreAcceptHeader(false) //determina se o parâmetro "accept" do header deve ser solicitado
		.useRegisteredExtensionsOnly(false)//determina se devem ser usados apenas MediaTypes registrados
		.defaultContentType(MediaType.APPLICATION_JSON)
		.mediaType("json", MediaType.APPLICATION_JSON)
		.mediaType("xml", MediaType.APPLICATION_XML);
		
	}

}
