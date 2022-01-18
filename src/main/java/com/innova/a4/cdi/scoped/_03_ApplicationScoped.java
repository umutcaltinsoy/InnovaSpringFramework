package com.innova.a4.cdi.scoped;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "applicationCDI")
@ApplicationScoped // Server ayakta kaldığı sürece yaşar. Farklı browserda da aynısında da yaşar.
public class _03_ApplicationScoped implements Serializable {
	
	private static final long serialVersionUID = -2729413083259464270L;
	
	public String scoped() {
		return "Application Scope" + hashCode();
	}
	
}