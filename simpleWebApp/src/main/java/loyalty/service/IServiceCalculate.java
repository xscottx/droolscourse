package loyalty.service;

import loyalty.domains.Ticket;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IServiceCalculate {

    @WebMethod(operationName = "calculate")
	public abstract Ticket calculate(Ticket ticket);

}