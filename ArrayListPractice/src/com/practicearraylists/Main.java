package com.practicearraylists;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Contact con=new Contact("gaurav","9550671038");
		MobilePhone mb=new MobilePhone();
		//mb.addContacts(con);
		mb.ListofContacts();
		
		Map<Double,String> map=new HashMap<>();
		map.put((double) 1.0, "gaurav");
		map.put((double) 2.0, "deepa");
		map.put((double) 3.0, "jay");
		map.put((double) 4.0, "dev");
		for(Double gaurav:map.keySet()) {
			System.out.println(gaurav +  " : " + map.get(gaurav));
		}
		
		
		
		
	}

}
