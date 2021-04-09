package com.laptop.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import com.laptop.beans.Laptop;
import com.laptop.utilities.DBCon;

public class LaptopDao implements LaptopDaoInterface<Laptop> {
	
	private static Statement stmt = null;
	private static Connection Con = null;
    private static ResultSet rs = null;
	
	@Override
	public ArrayList<Laptop> findAll() {
		ArrayList<Laptop> listLaptop = new ArrayList<>();
		
		String selectQuery = "SELECT * FROM bs1981222_laptops";
		
		try 
	    {
	        //connect to DB 
	        Con = DBCon.getConnection();
	        stmt=Con.createStatement();
	        rs = stmt.executeQuery(selectQuery);	        
	        while(rs.next()) {
	        	Laptop laptop = new Laptop();
	        	laptop.setLaptop_id(rs.getInt("laptop_id"));
	        	laptop.setModelnumber(rs.getString("modelnumber"));
	        	laptop.setLaptop_brand(rs.getString("laptop_brand"));
	        	laptop.setLaptop_condition(rs.getString("laptop_condition"));
	        	laptop.setLaptop_type(rs.getString("laptop_type"));
	        	laptop.setLaptop_ssd(rs.getInt("laptop_ssd"));
	        	laptop.setLaptop_harddisk(rs.getInt("laptop_harddisk"));
	        	laptop.setLaptop_comment(rs.getString("laptop_comment"));
	        	listLaptop.add(laptop);
	        }
	    }catch (Exception ex){
	        ex.printStackTrace();
	    }
		finally 
	    {
			DBCon.closeConnection();
	    }
		return listLaptop;
	}

	@Override
	public Laptop findById(int id) {
		Laptop laptop = new Laptop();
		
		String selectByIdQuery = "SELECT * FROM bs1981222_laptops where laptop_id='"+id+"'";
		try 
	    {
	        //connect to DB 
	        Con = DBCon.getConnection();
	        stmt=Con.createStatement();
	        rs = stmt.executeQuery(selectByIdQuery);	        
	       while(rs.next()) {
	        	laptop.setLaptop_id(rs.getInt("laptop_id"));
	        	laptop.setModelnumber(rs.getString("modelnumber"));
	        	laptop.setLaptop_brand(rs.getString("laptop_brand"));
	        	laptop.setLaptop_condition(rs.getString("laptop_condition"));
	        	laptop.setLaptop_type(rs.getString("laptop_type"));
	        	laptop.setLaptop_ssd(rs.getInt("laptop_ssd"));
	        	laptop.setLaptop_harddisk(rs.getInt("laptop_harddisk"));
	        	laptop.setLaptop_comment(rs.getString("laptop_comment"));
	       } 	
	    }catch (Exception ex){
	        ex.printStackTrace();
	    }
		finally 
	    {
			DBCon.closeConnection();
	    }
		return laptop;
	}

	@Override
	public boolean update(Laptop obj) {
		boolean rowUpdated = false;
		
		String updateQuery = "update bs1981222_laptops set modelnumber='" + obj.getModelnumber() + "', laptop_brand = '"
				+ obj.getLaptop_brand() +"', laptop_type='"+ obj.getLaptop_type() +"', laptop_condition ='"
				+ obj.getLaptop_condition() +"', laptop_ssd='"+ obj.getLaptop_ssd() +"', laptop_harddisk='"
				+ obj.getLaptop_harddisk() +"', laptop_comment='"+ obj.getLaptop_comment() + "' where laptop_id='"
				+obj.getLaptop_id()+"'";
		System.out.println(updateQuery);
	    try 
	    {
	        //connect to DB 
	        Con = DBCon.getConnection();
	        stmt=Con.createStatement();
	        rowUpdated = stmt.executeUpdate(updateQuery) > 0;
	        
	        
	    }catch (Exception ex){
	        ex.printStackTrace();
	    }
	     
	    finally 
	    {
	    	DBCon.closeConnection();
	    }
	    return rowUpdated;
	}

	@Override
	public Laptop save(Laptop obj) {			    
    String saveQuery = "insert into bs1981222_laptops (modelnumber, laptop_brand,"
    		+ " laptop_type, laptop_condition, laptop_ssd, laptop_harddisk, laptop_comment) values ('"
    		+ obj.getModelnumber() +"','"+ obj.getLaptop_brand() +"','"+ obj.getLaptop_type() +"','"
    		+ obj.getLaptop_condition() +"','"+ obj.getLaptop_ssd() +"','"+ obj.getLaptop_harddisk() +"','"
    		+ obj.getLaptop_comment() + "')";
    
    try 
    {
        //connect to DB 
        Con = DBCon.getConnection();
        stmt=Con.createStatement();
        rs = stmt.executeQuery(saveQuery);        
        boolean inserted = rs.next();
        if (!inserted) 
        {
           return null;
        }
    }catch (Exception ex){
        ex.printStackTrace();
    }
     
    finally 
    {
    	DBCon.closeConnection();
    }
	return obj;
	}

	@Override
	public ArrayList<Laptop> findByType(String s) {
		ArrayList<Laptop> listLaptop = new ArrayList<>();
		
		String selectByTypeQuery = "SELECT * FROM bs1981222_laptops where laptop_type LIKE '%"+s+"%'";
		
		try 
	    {
	        //connect to DB 
	        Con = DBCon.getConnection();
	        stmt=Con.createStatement();
	        rs = stmt.executeQuery(selectByTypeQuery);	        
	        while(rs.next()) {
	        	Laptop laptop = new Laptop();
	        	laptop.setLaptop_id(rs.getInt("laptop_id"));
	        	laptop.setModelnumber(rs.getString("modelnumber"));
	        	laptop.setLaptop_brand(rs.getString("laptop_brand"));
	        	laptop.setLaptop_condition(rs.getString("laptop_condition"));
	        	laptop.setLaptop_type(rs.getString("laptop_type"));
	        	laptop.setLaptop_ssd(rs.getInt("laptop_ssd"));
	        	laptop.setLaptop_harddisk(rs.getInt("laptop_harddisk"));
	        	laptop.setLaptop_comment(rs.getString("laptop_comment"));
	        	listLaptop.add(laptop);
	        }
	    }catch (Exception ex){
	        ex.printStackTrace();
	    }
		finally 
	    {
			DBCon.closeConnection();
	    }
		return listLaptop;
	}
	
	@Override
	public ArrayList<Laptop> findByModelNumber(String s) {
		ArrayList<Laptop> listLaptop = new ArrayList<>();
		
		String selectByModelNumberQuery = "SELECT * FROM bs1981222_laptops where modelnumber LIKE '%"+s+"%'";
		try 
	    {
	        //connect to DB 
	        Con = DBCon.getConnection();
	        stmt=Con.createStatement();
	        rs = stmt.executeQuery(selectByModelNumberQuery);	        
	        while(rs.next()) {
	        	Laptop laptop = new Laptop();
	        	laptop.setLaptop_id(rs.getInt("laptop_id"));
	        	laptop.setModelnumber(rs.getString("modelnumber"));
	        	laptop.setLaptop_brand(rs.getString("laptop_brand"));
	        	laptop.setLaptop_condition(rs.getString("laptop_condition"));
	        	laptop.setLaptop_type(rs.getString("laptop_type"));
	        	laptop.setLaptop_ssd(rs.getInt("laptop_ssd"));
	        	laptop.setLaptop_harddisk(rs.getInt("laptop_harddisk"));
	        	laptop.setLaptop_comment(rs.getString("laptop_comment"));
	        	listLaptop.add(laptop);
	        }
	    }catch (Exception ex){
	        ex.printStackTrace();
	    }
		finally 
	    {
			DBCon.closeConnection();
	    }
		return listLaptop;
	}

}
