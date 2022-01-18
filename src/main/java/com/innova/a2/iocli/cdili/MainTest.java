package com.innova.a2.iocli.cdili;

public class MainTest {
	
	public static void main(String[] args) {
		JavaManager javaManager = new JavaManager(new Java18());
		javaManager.newJavaVersion();
	}
	
}
