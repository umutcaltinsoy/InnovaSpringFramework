package com.innova.a2.iocli.cdili;

// Interface yaptık.
public interface JavaVersion {
	
	// Govdesiz parametresiz method
	public void javaVersion();
	
	default void Deneme() {
		System.out.println("Merhaba");
	}
	
}
