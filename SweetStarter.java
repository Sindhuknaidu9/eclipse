package com.xworkz.sweet;

public class SweetStarter {

	public static void main(String[] args) {
		Sweet sweet = new Sweet();
		sweet.setColor(Color.BROWN);
		sweet.setName("Burfi");
		sweet.setPrice(655);
		sweet.setShape(Shape.DIAMOND);
		sweet.toString();
		sweet.hashCode();
		Sweet sweet1=new Sweet("MysorePak",Color.YELLOW,20.0f,Shape.SQUARE);

		boolean check=sweet.equals(sweet1);
		System.out.println(check);
		System.out.println(sweet.toString());
		System.out.println(sweet.hashCode());
		Class classs=sweet1.getClass();
		System.out.println(classs.getName());
		System.out.println(classs.getPackage());
		System.out.println(classs.getSuperclass());
		System.out.println(classs.getMethods().length);
		System.out.println(classs.getFields().length);
		System.out.println(classs.getConstructors().length);

   }
}