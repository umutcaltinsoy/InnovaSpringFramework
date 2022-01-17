package com.innova.a1.iocli.cdisiz;

public class JavaManager {
	
	// IoC bileşenlerini oluşturmamız gerekiyor.
	
	// Interface çağır
	private JavaVersion javaInterface;
	
	// alt+s = parametreli constr.
	public JavaManager(JavaVersion javaInterface) {
		this.javaInterface = javaInterface;
	}
	
	// Method
	public void newJavaVersion() {
		javaInterface.javaVersion();
	}
	
}
