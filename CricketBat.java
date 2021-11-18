package com.xworkz.cricket;

public class CricketBat {
	private String companyName;
	private BatType type;
	private float price;
	private String wood;

	public CricketBat()
	{
		System.out.println("Invoked no arg constructor");
	}

	public boolean equals(Object obj)
	{
		System.out.println("Invoked equals method from CricketBat");
		if(obj!=null)
		{
			System.out.println("reference is not null");

		if(obj instanceof CricketBat)
		{
			System.out.println("Ref is Watch");
			CricketBat casted=(CricketBat)obj;
			String castedCompany=casted.getCompanyName();
			BatType castedType=casted.getType();
			if(this.equals(castedCompany)&& this.type.equals(castedType))
			{
				System.out.println("Comapny name and Type are matching");
				return true;
			}
			else
			{
				System.err.println("Company name or type is not matching");
			}
		}
		else
		{
			System.err.println(" Ref is not a match");

		}
		}
	else
		{
			System.err.println("Referance cannot be null!!");
		}
		return false;

	}

	public String toString()
	{
		System.out.println("String invoked");

		System.out.println(this.companyName);
		System.out.println(this.price);
		System.out.println(this.wood);
		System.out.println(this.type);
		return "string";
	}

	public int hashCode()
	{
		System.out.println("hashcode invoked");
		return 45;
	}
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String brand)
	{

	this.companyName = brand;
	}

	public BatType getType() {
		return type;
	}


	public void setType(BatType type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getWood() {
		return wood;
	}

	public void setWood(String wood) {
		this.wood = wood;
	}
}