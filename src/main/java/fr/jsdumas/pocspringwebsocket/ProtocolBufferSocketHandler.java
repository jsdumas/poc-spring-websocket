package fr.jsdumas.pocspringwebsocket;

import org.springframework.web.socket.BinaryMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.BinaryWebSocketHandler;

public class ProtocolBufferSocketHandler extends BinaryWebSocketHandler {
	
	@Override
    protected void handleBinaryMessage(WebSocketSession session, BinaryMessage message) throws Exception {
        super.handleBinaryMessage(session, message);
}

}
