package com.innova.a6.qualifier;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifierCDI")
@ApplicationScoped
public class QualifierManagerJava implements Serializable {
	
	private static final long serialVersionUID = 5887926423791550002L;
	
	// // Default için kullanılan yapı
	// @Inject
	// private IJavaVersion iJavaVersion;
	
	// Opsiyonel olarak seçmek için kullanılan yapı
	@Inject
	@QualifierCokluSecim
	private IJavaVersion iJavaVersion;
	
	public String getiJavaVersion() {
		return iJavaVersion.javaVersion("Sürüm : ");
	}
}
