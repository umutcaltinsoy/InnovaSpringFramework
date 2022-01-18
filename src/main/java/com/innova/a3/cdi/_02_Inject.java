package com.innova.a3.cdi;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "tuketenCDI")
@ApplicationScoped
public class _02_Inject implements Serializable {
	
	private static final long serialVersionUID = -9142284917511595478L;
	
	// Tüketen : @Inject ile new oluşturmadan direkt olarak çağırıp
	// kullanabiliyoruz.
	@Inject
	private List<String> tuketenList;
	
	public List<String> getTuketenList() {
		return tuketenList;
	}
	
}
