package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {

    @WebMethod(operationName = "ConversionEuroToDH")
    public int conversion(@WebParam(name = "montant") int mt){
        return mt*11;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(code, Math.random()*777, new Date());
    }

    @WebMethod
    public List<Compte> listeComptes(){
        return List.of(
                new Compte(1, Math.random()*777, new Date()),
                new Compte(2, Math.random()*777, new Date()),
                new Compte(2, Math.random()*777, new Date())
        );
    }
}
