package data;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;

public class PersonStoreServerSocket extends HttpServlet {

	private static final long serialVersionUID = -3475158632427320283L;
	DataReader store;
	String csvFilepath;

	void start() {
		try {
			ServerSocket serverSocket = new ServerSocket(1234);
			Socket socket = serverSocket.accept();
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			List<Person> personList = new ArrayList<>();
			int i;
			while ((i = is.read()) > -1) {
				// csvReader()

			}
			os.close();
			is.close();
			socket.close();
			serverSocket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
