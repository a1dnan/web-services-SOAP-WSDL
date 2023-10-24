package ws;

import jakarta.xml.ws.Endpoint;

public class Serveur {

    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:8086/", new BanqueService());
        System.out.println("Web Service déployé sur http://0.0.0.0:8086/");
    }
}
