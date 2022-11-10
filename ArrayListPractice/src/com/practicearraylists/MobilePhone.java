package com.practicearraylists;
import java.util.*;
public class MobilePhone {
		private String myNumber;
	private List<Contact> contactsList=new ArrayList<Contact>();
	
	
	
	public MobilePhone(String myNumber, List<Contact> contactsList) {
		super();
		this.myNumber = myNumber;
		this.contactsList = contactsList;
	}

	

	public MobilePhone() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void addContacts(Contact contact) {
		int index=0;
			if(contactsList.contains(contact)) {
				contactsList.get(index);
			}
			contactsList.add(contact);
	}
	
	public void deleteContacts(String myNumber) {
		System.out.println("\n delete contacts should be");
		boolean b=contactsList.remove(myNumber);
		
	}
	
	public void ListofContacts() {
		for(int i=0;i<contactsList.size();i++) {
			System.out.println(contactsList.get(i));
		}
	}
	
	
}
