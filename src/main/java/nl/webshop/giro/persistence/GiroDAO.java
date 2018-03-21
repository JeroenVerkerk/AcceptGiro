package nl.webshop.giro.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import nl.hu.webshop.giro.pojo.Giro;

public class GiroDAO extends BaseDAO{
	List<Giro> results = new ArrayList<Giro>();
		
	private List<Double> selectCodes(String query) {
		List<Double> codes = new ArrayList<Double>();
		
		try (Connection con = super.getConnection()) {
			PreparedStatement pstmt = con.prepareStatement(query);
			ResultSet dbResultSet = pstmt.executeQuery();
			while (dbResultSet.next()) {
				double code = dbResultSet.getDouble("code");
				
				codes.add(code);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return codes;
	}
		
	public List<Double> getAllCodes() {
		return selectCodes("SELECT code FROM \"Acceptgiro\"");
	}
	
	public void insertGiro(String naam, String adres, double bedrag, double code) {

		try (Connection conn = super.getConnection()) {
			Statement stmt = conn.createStatement();
			
			String query = "INSERT INTO \"Acceptgiro\" (naam, adres, bedrag, code) VALUES ('" + naam
					+ "','" + adres + "'," + bedrag + "," + code + ")";
			stmt.executeUpdate(query);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
