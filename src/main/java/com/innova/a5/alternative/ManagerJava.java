package com.innova.a5.alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "alternativeCDI")
@ApplicationScoped
public class ManagerJava {
	
	@Inject
	private IJavaVersion iJavaVersion;
	
	public String getiJavaVersion() {
		return iJavaVersion.javaVersion("Sürümler: ");
	}
}
