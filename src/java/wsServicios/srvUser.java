package wsServicios;

import Modelo.csUser;
import Modelo.user;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Jeffrey
 */
@WebService(serviceName = "srvUser")
public class srvUser {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "autenticar")
    public user autenticarUser(@WebParam(name = "usuario") String usuario, @WebParam(name = "password") String password)
    {
        csUser u = new csUser();
        return u.autenticar(usuario, password);
    }
}
