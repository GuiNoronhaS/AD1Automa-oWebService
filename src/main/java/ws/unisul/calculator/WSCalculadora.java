/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.unisul.calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Guilherme Noronha
 */
@WebService(serviceName = "WSCalculadora")
@Stateless()
public class WSCalculadora {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "somar")
    public double somar(@WebParam(name = "x") double x, @WebParam(name = "y") double y) {
        //TODO write your implementation code here:
        return x + y;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "subtracao")
    public double subtracao(@WebParam(name = "a") double a , @WebParam(name = "b") double b) {
        //TODO write your implementation code here:
        return a - b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiplcacao")
    public double multiplcacao(@WebParam(name = "xa") double xa, @WebParam(name = "xy") double ya) {
        //TODO write your implementation code here:
        return xa * ya;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "divisao")
    public double divisao(@WebParam(name = "xb") double xb, @WebParam(name = "yb") double yb) {
        //TODO write your implementation code here:
        return xb / yb;
    }

}
