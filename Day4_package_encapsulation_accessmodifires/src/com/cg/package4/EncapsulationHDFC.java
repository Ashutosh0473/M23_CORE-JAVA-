package com.cg.package4;

import com.cg.package3.HDFC;

public class EncapsulationHDFC {

	public static void main(String[] args) {
		HDFC h=new HDFC();
		h.setAmount(45500);
		System.out.println("the amount in my bank :"+h.getAmount());

	}

}
