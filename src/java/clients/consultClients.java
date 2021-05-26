/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clients;

import Entidades.Clientes;
import Fachadas.FachadaClientes;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Daniel Ornelas
 */
@WebService(serviceName = "consultClients")
public class consultClients {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAllClients")
    public List<Clientes> getAllClients() {
        FachadaClientes fclients = new FachadaClientes();
        return fclients.consultarClientes();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getClientByID")
    public Clientes getClientByID(@WebParam(name = "id") Integer id) {
        FachadaClientes fclients = new FachadaClientes();
        return fclients.consultarClienteId(id);
    }
    
}
