package com.skillenza.CRUD.model;

//package com.skillenza.CRUD.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.TableGenerator;

import org.hibernate.annotations.GenericGenerator;

//import org.hibernate.annotations.Entity;

//import org.hibernate.annotations.Entity;


//@SequenceGenerator(name="product_id_seq", initialValue=4, allocationSize=100)
@Entity
public class Product {
	//@GeneratedValue(generator="increment")
	  @TableGenerator(name = "Address_Gen", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", pkColumnValue = "Addr_Gen", initialValue = 3, allocationSize = 100)
    @Id@GeneratedValue(strategy = GenerationType.TABLE, generator = "Address_Gen") private int id;
    
    private String name;
    private String description;
    private String homedelivery;
    
    
	public Product(int id, String name, String description, String homedelivery) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.homedelivery = homedelivery;
	}

	
	 

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getHomedelivery() {
		return homedelivery;
	}


	public void setHomedelivery(String homedelivery) {
		this.homedelivery = homedelivery;
	}


	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", description=" + description + ", homedelivery="
				+ homedelivery + "]";
	}
	
	
    
    

    //getters and setters
}

