package com.etc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.util.SocketUtils;

@SpringBootApplication
@EnableEurekaClient
public class SpringclouduserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringclouduserApplication.class, args);
	}
//	@Bean
//	public WebServerFactoryCustomizer<ConfigurableWebServerFactory> containerCustomizer(){
//		return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
//			@Override
//			public void customize(ConfigurableWebServerFactory factory) {
//				int port= SocketUtils.findAvailableTcpPort(8001,8999);//随机获取一个端口号
//				factory.setPort(port);
//				System.getProperties().put("server.port",port);
//			}
//		};
//	}


}
