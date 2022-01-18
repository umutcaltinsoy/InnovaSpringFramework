package com.innova.a4.cdi.scoped;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "requestCDI")
@RequestScoped // @RequestScoped => Tek bir request boyunca yaşar, sonra ölür. Performansı
				// olumsuz yönde etkiler.
public class _01_RequestScoped implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2729413083259464270L;
	
	public String scoped() {
		return "Request Scope" + hashCode();
	}
	
}