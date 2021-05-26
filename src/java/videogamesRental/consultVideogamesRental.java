package videogamesRental;

import Entidades.Rentasvideojuegos;
import Fachadas.FachadaRentasVideojuegos;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Daniel Ornelas
 */
@WebService(serviceName = "consultVideogamesRental")
public class consultVideogamesRental {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAllVideogamesRentals")
    public List<Rentasvideojuegos> getAllVideogamesRentals() {
        FachadaRentasVideojuegos fVideogamesRen = new FachadaRentasVideojuegos();
        return fVideogamesRen.consultarRentas();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getVideogameRental")
    public Rentasvideojuegos getVideogameRental(@WebParam(name = "rental") Rentasvideojuegos rental) {
        FachadaRentasVideojuegos fVideogamesRen = new FachadaRentasVideojuegos();
        return fVideogamesRen.consultarRenta(rental);
    }
    
    

}
