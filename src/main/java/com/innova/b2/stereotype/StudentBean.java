package com.innova.b2.stereotype;

// Fazla olan annotation yapılarımız teke indirgenemek için kullanıyoruz.
@InnovaMultipleAnnotation
public class StudentBean {
	
	private String name = "Deneme";
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
