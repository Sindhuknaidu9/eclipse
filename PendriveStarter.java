package com.xworkz.pendrive;

public class PendriveStarter {

	public static void main(String[] args) {
		Pendrive pen = new Pendrive();
		pen.setBrand("sony");
		pen.setCapacity(8);
		pen.setPrice(290);
		pen.setWorking(true);

		Pendrive pen1 = new Pendrive();
		pen1.setBrand("sony");
		pen1.setCapacity(8);
		pen1.setPrice(290);
		pen1.setWorking(true);
		pen1.hashCode();
		pen1.toString();

		Pendrive pen2 = new Pendrive();
		Class cls = pen2.getClass();
		System.out.println(cls.getMethods().length);
		System.out.println(cls.getFields().length);
		System.out.println(cls.getConstructors().length);
		boolean same = pen.equals(pen1);
		System.out.println(same);
	}

}