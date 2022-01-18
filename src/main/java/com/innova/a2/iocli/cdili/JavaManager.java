package com.innova.a2.iocli.cdili;

import javax.inject.Inject;

// Manuel IoC kullandık
// Inject yani C.D.I yapısı (Contexts and Dependency Injection)
public class JavaManager {
	
	// IoC bileşenlerini oluşturmamız gerekiyor.
	
	// Interface çağır
	@SuppressWarnings("cdi-ambiguous-dependency") // Derleme uyarılarını görmezden gelmek için
	@Inject
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
