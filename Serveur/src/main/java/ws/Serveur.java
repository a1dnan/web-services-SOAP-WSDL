package ws;

import jakarta.xml.ws.Endpoint;

import java.util.Date;

public class Serveur {

    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:8086/", new BanqueService());
        System.out.println("Web Service deploye sur http://0.0.0.0:8086/");
    }
}
