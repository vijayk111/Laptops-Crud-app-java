package com.laptop.dao;

import java.util.ArrayList;

public interface LaptopDaoInterface<T> {
	
	ArrayList<T> findAll();
	
	T findById(int id);
	
	boolean update(T obj);
	 
	T save(T obj);
	
	ArrayList<T> findByType(String s);
	ArrayList<T> findByModelNumber(String s);
}
