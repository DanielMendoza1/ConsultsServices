
package videogamesInventory;

import Entidades.Inventariovideojuegos;
import Fachadas.FachadaInventarioVideojuegos;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Daniel Ornelas
 */
@WebService(serviceName = "consultVideogamesInventory")
public class consultVideogamesInventory {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAllVideogamesInventories")
    public List<Inventariovideojuegos> getAllVideogamesInventories() {
        FachadaInventarioVideojuegos fVideogamesIn = new FachadaInventarioVideojuegos();
        return fVideogamesIn.consultarinventarioVideojuegos();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getVideogameInventoryByID")
    public Inventariovideojuegos getVideogameInventoryByID(@WebParam(name = "id") Integer id) {
        FachadaInventarioVideojuegos fVideogamesIn = new FachadaInventarioVideojuegos();
        return fVideogamesIn.consultarInventarioVideojuegosID(id);
    }
    
}
