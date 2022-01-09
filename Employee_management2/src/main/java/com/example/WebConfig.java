package com.example;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

//フォームクラスとメッセージの紐付け
@Configuration
public class WebConfig {
	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource bean = new ReloadableResourceBundleMessageSource();

		//エラーメッセージのプロパティーファイルを指定(message.properties)
		bean.setBasename("classpath:messages");
		//文字プロパティを指定
		bean.setDefaultEncoding("UTF-8");

		return bean;
	}

	@Bean
	public LocalValidatorFactoryBean localValidatorFactoryBean(){
			LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
			localValidatorFactoryBean.setValidationMessageSource(messageSource());
			return localValidatorFactoryBean;
	}




}
