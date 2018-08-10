package fr.jsdumas.pocspringwebsocket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		registry.addHandler(new MyHandler(), "/myhandler").setAllowedOrigins("*");
		registry.addHandler(new ProtocolBufferSocketHandler(), "/protobuf").setAllowedOrigins("*");
		registry.addHandler(new BinarySocketHandler(), "/binary").setAllowedOrigins("*");
	}

//	@Bean
//	private WebSocketHandler myHandler() {
//		return new MyHandler();
//	}
//https://github.com/developerworks/spring-websocket-without-stomp
}
