package com.innova.a4.cdi.scoped;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "sessionCDI")
@SessionScoped // Tek turu boyunca yaşar. Farklı browserda yaşamaz.
public class _02_SessionScoped implements Serializable {
	
	private static final long serialVersionUID = -2729413083259464270L;
	
	public String scoped() {
		return "Session Scope" + hashCode();
	}
}