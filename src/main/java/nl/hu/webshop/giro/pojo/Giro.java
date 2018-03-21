package nl.hu.webshop.giro.pojo;

public class Giro {
	private int id;
	private String naam;
	private String adres;
	private double bedrag;
	private double code;
	
	public Giro(int id, String naam, String adres, double bedrag, double code) {
		this.id = id;
		this.naam = naam;
		this.adres = adres;
		this.bedrag = bedrag;
		this.code = code;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public double getBedrag() {
		return bedrag;
	}

	public void setBedrag(double bedrag) {
		this.bedrag = bedrag;
	}

	public double getCode() {
		return code;
	}

	public void setCode(double code) {
		this.code = code;
	}
	
	
}
