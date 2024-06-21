package main.java;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class SimpleHttpServer {
    public static void main(String[] args) throws IOException {

        int port = 5000;
        HttpServer httpServer = HttpServer.create(new InetSocketAddress(port), 0);

        HttpHandler httpHandler = exchange -> {
                String response = "Hello World!";
                exchange.sendResponseHeaders(300, response.length());
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
        };

        httpServer.createContext("/", httpHandler);
        httpServer.start();
    }
}
