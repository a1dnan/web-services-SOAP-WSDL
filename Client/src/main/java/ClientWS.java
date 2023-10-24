import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        System.out.println(stub.conversionEuroToDH(1));
        Compte c = stub.getCompte(1);
        System.out.println(c.getCode());
        System.out.println(c.getSolde());
        System.out.println(c.getDateCreation());
    }
}
