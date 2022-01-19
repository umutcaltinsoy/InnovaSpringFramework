package com.innova.a6.qualifier;

import javax.enterprise.inject.Default;

// Defaultta bu obje gelsin
@Default
public class Java11 implements IJavaVersion {
	
	@Override
	public String javaVersion(String data) {
		// TODO Auto-generated method stub
		return "Default Version: Java 11";
	}
	
}
