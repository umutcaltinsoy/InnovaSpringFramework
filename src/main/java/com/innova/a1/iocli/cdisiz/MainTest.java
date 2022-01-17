package com.innova.a1.iocli.cdisiz;

public class MainTest {
	
	public static void main(String[] args) {
		JavaManager javaManager = new JavaManager(new Java20());
		javaManager.newJavaVersion();
	}
	
}
