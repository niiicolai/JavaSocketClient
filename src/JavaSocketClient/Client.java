package JavaSocketClient;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	private static int port = 6666;
	private static String host = "localhost";
	
	public static void main (String[] args) {
		
		try {
			// Creates a stream socket and connects it to the specified port number on the named host. 
			var socket = new Socket(host, port);
			
			// Returns an output stream for this socket. 
			var outputStream = socket.getOutputStream();
			
			// Creates a new data output stream to write data to the specified underlying output stream. 
			// The counter written is set to zero.
			var dataOutputStream = new DataOutputStream(outputStream );
			
			// Declare message
			var message = "Hello world";
			
			// Writes a string to the underlying output stream using modified UTF-8encoding in a machine-independent manner. 
			dataOutputStream.writeUTF(message);
			
			// Flushes this data output stream. This forces any buffered output bytes to be written out to the stream.
			dataOutputStream.flush();
			
			// Closes this output stream and releases any system resources associated with the stream. 
			dataOutputStream.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
