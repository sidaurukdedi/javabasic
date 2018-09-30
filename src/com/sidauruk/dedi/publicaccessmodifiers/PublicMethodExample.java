package com.sidauruk.dedi.publicaccessmodifiers;

import com.sidauruk.dedi.accessmodifiers.PublicPerson; // how to connect public modifier from the outside

public class PublicMethodExample {
	public static void main (String args[]){
		PublicPerson pp1 = new PublicPerson();
		pp1.greet("Fanny");
	}
}
