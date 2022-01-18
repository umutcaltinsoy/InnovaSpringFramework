package com.innova.a3.cdi;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class Computer implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String computerName;
	
	// Getter and Setter
	public String getComputerName() {
		return computerName;
	}
	
	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}
	
	// Unparameterized Const.
	public Computer() {
		this.computerName = "Bilgisayar Adı ASUS-X550J";
		
	}
	
	// Parameterized Const.
	public Computer(String computerName) {
		this.computerName = computerName;
	}
	
	// toString()
	@Override
	public String toString() {
		return "Computer [computerName=" + computerName + "]";
	}
	
}
