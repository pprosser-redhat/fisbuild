package fis.HelloFromPod;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Hello {
	String message;

	public String getMessage() {

		try {
			message = "Hello from PODgsjfjghskfghsfgkjfh:- " + InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			message = "Hello, no hostname found";

		}
		return message;
	}

	@Override
	public String toString() {

		return getMessage();
	}

}
