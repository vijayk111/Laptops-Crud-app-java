package com.laptop.services;

import java.util.ArrayList;

import com.laptop.beans.Laptop;
import com.laptop.dao.LaptopDao;

public class LaptopService implements ServiceInterface<Laptop> {
	
	private static LaptopDao dao;
	
	public LaptopService() {
		dao = new LaptopDao();
	}
	
	@Override
	public ArrayList<Laptop> findAll() {
		return dao.findAll();
	}

	@Override
	public Laptop findById(int id) {
		return dao.findById(id);
	}

	@Override
	public boolean update(Laptop obj) {
		return dao.update(obj);
	}

	@Override
	public Laptop save(Laptop obj) {
		return dao.save(obj);
	}

	@Override
	public ArrayList<Laptop> findByType(String s) {
		return dao.findByType(s);
	}
	
	@Override
	public ArrayList<Laptop> findByModelNumber(String s) {
		return dao.findByModelNumber(s);
	}
	
}
