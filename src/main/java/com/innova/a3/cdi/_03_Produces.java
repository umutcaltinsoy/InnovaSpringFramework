package com.innova.a3.cdi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

// loose coupling = Gevşek bağlama ==> @Inject ve @Produces
@Named(value = "uretenCDI")
@ApplicationScoped
public class _03_Produces implements Serializable {
	private static final long serialVersionUID = 8292823257907113325L;
	
	// Üreten; bir şeyler üretildiğini göstermek için @Produces kullanıyoruz
	@Produces
	public List<String> uretenLists() {
		List<String> list = new ArrayList<String>();
		list.add("Ankara");
		list.add("Aydin");
		list.add("Sinop");
		
		return list;
		
	}
	
}
