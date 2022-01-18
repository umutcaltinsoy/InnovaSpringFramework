package com.innova.a3.cdi;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class _01_Named implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2729413083259464270L;
	private String computerName;
	
	// Getter and Setter
	public String getComputerName() {
		return computerName;
	}
	
	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}
	
	// Unparameterized Const.
	public _01_Named() {
		this.computerName = "Bilgisayar Adı ASUS-X550J";
		
	}
	
	// Parameterized Const.
	public _01_Named(String computerName) {
		this.computerName = computerName;
	}
	
	// toString()
	@Override
	public String toString() {
		return "Computer [computerName=" + computerName + "]";
	}
	
}