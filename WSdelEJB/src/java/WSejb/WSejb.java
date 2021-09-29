/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WSejb;

import ejb.MySessionRemote;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author rorod
 */
@WebService(serviceName = "WSejb")
public class WSejb {

    @EJB
    private MySessionRemote mySession;

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getResult_ejb")
    public String getResult_ejb() {
        //TODO write your implementation code here:
        return mySession.getResult();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sumaDos")
    public int sumaDos(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        return mySession.sumaDos(a, b);
    }
    

    
    
    
    
}
