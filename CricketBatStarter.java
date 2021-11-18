package com.xworkz.cricket;

public class CricketBatStarter {

	public static void main(String[] args) {
		CricketBat cricket=new CricketBat();
		cricket.setCompanyName("MRF");
		cricket.setPrice(98768);
		cricket.setWood("wood");
		cricket.setType(BatType.MRF);
		cricket.hashCode();
		cricket.toString();



		CricketBat cricket1=new CricketBat();
		cricket1.setCompanyName("sg");
		cricket1.setPrice(87908);
		cricket.setWood("wood");
		cricket1.setType(BatType.GM);

		CricketBat cricket2=new CricketBat();
		Class cls= cricket2.getClass();
		System.out.println(cls.getMethods().length);
		System.out.println(cls.getFields().length);
		System.out.println(cls.getConstructors().length);

		boolean same=cricket.equals(cricket1);
		System.out.println(same);
	}

}