package com.innova.a7.enumqualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "multipleQualifier")
@ApplicationScoped
public class _8_QualifierManager {
	
	// // default
	// @Inject
	// _3_IJavaVersion iJavaVersion;
	
	// Optional
	@Inject
	@_2_EQualifier(_1_EJavaVersion.JAVA17)
	_3_IJavaVersion iJavaVersion;
	
	public String getiJavaVersion() {
		return iJavaVersion.javaVersion("Seçim");
	}
	
}
