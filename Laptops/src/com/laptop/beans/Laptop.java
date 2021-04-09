package com.laptop.beans;


public class Laptop {	
	private int laptop_id;
    private String modelnumber;
    private String laptop_brand;
    private String laptop_type;
    private String laptop_condition;
    private int laptop_ssd; 
    private int laptop_harddisk;
    private String laptop_comment;
    
    public Laptop() {}
    
	public Laptop(int laptop_id, String modelnumber, String laptop_brand, 
			String laptop_type, String laptop_condition,
			int laptop_ssd, int laptop_harddisk, String laptop_comment) {
		super();
		this.laptop_id = laptop_id;
		this.modelnumber = modelnumber;
		this.laptop_brand = laptop_brand;
		this.laptop_type = laptop_type;
		this.laptop_condition = laptop_condition;
		this.laptop_ssd = laptop_ssd;
		this.laptop_harddisk = laptop_harddisk;
		this.laptop_comment = laptop_comment;
	}
    
	public int getLaptop_id() {
		return laptop_id;
	}
	public void setLaptop_id(int laptop_id) {
		this.laptop_id = laptop_id;
	}
	public String getModelnumber() {
		return modelnumber;
	}
	public void setModelnumber(String modelnumber) {
		this.modelnumber = modelnumber;
	}
	public String getLaptop_brand() {
		return laptop_brand;
	}
	public void setLaptop_brand(String laptop_brand) {
		this.laptop_brand = laptop_brand;
	}
	public String getLaptop_type() {
		return laptop_type;
	}
	public void setLaptop_type(String laptop_type) {
		this.laptop_type = laptop_type;
	}
	public String getLaptop_condition() {
		return laptop_condition;
	}
	public void setLaptop_condition(String laptop_condition) {
		this.laptop_condition = laptop_condition;
	}
	public int getLaptop_ssd() {
		return laptop_ssd;
	}
	public void setLaptop_ssd(int laptop_ssd) {
		this.laptop_ssd = laptop_ssd;
	}
	public int getLaptop_harddisk() {
		return laptop_harddisk;
	}
	public void setLaptop_harddisk(int laptop_harddisk) {
		this.laptop_harddisk = laptop_harddisk;
	}
	public String getLaptop_comment() {
		return laptop_comment;
	}
	public void setLaptop_comment(String laptop_comment) {
		this.laptop_comment= laptop_comment;
	}  
    
}
