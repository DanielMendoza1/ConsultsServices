/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogames;

import Entidades.Videojuegos;
import Fachadas.FachadaVideojuegos;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Daniel Ornelas
 */
@WebService(serviceName = "consultVideogames")
public class consultVideogames {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAllVideogames")
    public List<Videojuegos> getAllVideogames() {
        FachadaVideojuegos fVideogames = new FachadaVideojuegos();
        return fVideogames.consultarVideojuegos();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getVideogameByID")
    public Videojuegos getVideogameByID(@WebParam(name = "id") Integer id) {
        FachadaVideojuegos fVideogames = new FachadaVideojuegos();
        return fVideogames.consultarVideojuegoID(id);
    }
}
