/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integra.paisesaeropuerto;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import net.webservicex.Airport;
import net.webservicex.AirportSoap;
import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;

/**
 *
 * @author MaríaConstanza
 */
@WebService(serviceName = "PaisesAeropuerto")
public class PaisesAeropuerto {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String[] hello(@WebParam(name = "name") String txt) {
        GlobalWeather funcion = new GlobalWeather();
        Airport a = new Airport();
        GlobalWeatherSoap funcions = funcion.getGlobalWeatherSoap();
        AirportSoap a1 = a.getAirportSoap();
        String[] arr = new String[2];
        arr[0]=funcions.getCitiesByCountry(txt);
        arr[1]=a1.getAirportInformationByCountry(txt);
        return arr;
        
    }
}
