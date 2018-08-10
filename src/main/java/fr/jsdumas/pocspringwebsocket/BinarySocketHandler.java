package fr.jsdumas.pocspringwebsocket;

import org.springframework.web.socket.BinaryMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.BinaryWebSocketHandler;

public class BinarySocketHandler extends BinaryWebSocketHandler {
	
	@Override
    protected void handleBinaryMessage(WebSocketSession session, BinaryMessage message) throws Exception {
        session.sendMessage(new BinaryMessage("hello world!".getBytes()));
}

}
