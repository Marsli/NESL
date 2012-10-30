package com.lq.esl;

import org.freeswitch.esl.client.inbound.Client;
import org.freeswitch.esl.client.inbound.InboundConnectionFailure;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
	
	private static final Logger log = LoggerFactory.getLogger(Test.class);
	
	public static void main(String[] args) {
		Client client = new Client();
		try {
			client.connect("127.0.0.1",8021,"ClueCon",100);
			log.info("Test"+client.canSend());
		} catch (InboundConnectionFailure e) {
			e.printStackTrace();
		}
	}
}
