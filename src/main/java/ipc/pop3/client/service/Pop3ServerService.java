package ipc.pop3.client.service;

import org.springframework.stereotype.Service;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

@Service
public class Pop3ServerService {

    private InetAddress server_address;
    private int server_port;

    private Socket pop3_server_socket;
    private BufferedReader in;
    private PrintWriter out;


    public boolean refreshSocket() throws IOException {
        if (pop3_server_socket == null || pop3_server_socket.getInetAddress() != server_address || pop3_server_socket.getPort() != server_port) {
            pop3_server_socket = new Socket(server_address, server_port);
            in = new BufferedReader(new InputStreamReader(pop3_server_socket.getInputStream()));
            out = new PrintWriter(pop3_server_socket.getOutputStream());
            return true; }
        else {
            return false; }
    }

    public void setServer_adr(String serverAddress) throws UnknownHostException { server_address = InetAddress.getByName(serverAddress); }

    public void setServer_port(String serverPort) throws NumberFormatException { server_port = Integer.parseInt(serverPort); }

}
