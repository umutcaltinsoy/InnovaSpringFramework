package com.innova.a7.enumqualifier;

import javax.enterprise.inject.Default;

@Default
public class _4_DefaultJavaVersion implements _3_IJavaVersion {
	
	@Override
	public String javaVersion(String data) {
		
		return "Default Java Version : Java 11";
	}
	
}
