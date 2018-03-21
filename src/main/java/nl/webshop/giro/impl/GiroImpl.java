package nl.webshop.giro.impl;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import nl.webshop.giro.persistence.GiroDAO;
import nl.webshop.soap.simulategiro.wsinterface.Fault;
import nl.webshop.soap.simulategiro.wsinterface.GiroFault;
import nl.webshop.soap.simulategiro.wsinterface.GiroRequest;
import nl.webshop.soap.simulategiro.wsinterface.GiroResponse;
import nl.webshop.soap.simulategiro.wsinterface.GiroServiceInterface;

@WebService(endpointInterface = "nl.webshop.soap.simulategiro.wsinterface.GiroServiceInterface")
public class GiroImpl implements GiroServiceInterface {
	private GiroDAO dao = new GiroDAO();
	private List<Double> getallen;
	private double getal;

	@Override
	public GiroResponse generateNumber(GiroRequest request) throws Fault {
		GiroResponse response = new GiroResponse();
		
		try {
			getal = Math.random();
			getallen = dao.getAllCodes();
			if (getallen.contains(Math.round(getal*1000))) {
				getal = Math.random();
			}
			else {
				getal = Math.round(getal*1000);
				response.setGetal(getal);
			}
		}catch (RuntimeException e) {
			GiroFault x = new GiroFault();
			x.setErrorCode((short) 1);
			x.setMessage("Er ging iets mis met de betaling");
			
			Fault fault = new Fault("Er ging iets mis met de betaling", x);
			throw fault;
		}
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		dao.insertGiro(request.getNaam(), request.getAdres(), request.getBedrag(), getal);
		return response;
	}

}
