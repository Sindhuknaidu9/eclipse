package com.xworkz.sweet;

public class Sweet {

	private String name;
	private Color type;
	private float price;
	private Shape shape;

	public Sweet()
	{
		System.out.println("Invoked no arg Sweet Cons");
	}

	public Sweet(String name, Color type, float price, Shape shape) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.shape = shape;
	}

	public String toString()
	{
		System.out.println("Invoked toString from Sweet");
		System.out.println("this.name");
		System.out.println("this.type");
		System.out.println("this.price");
		System.out.println("this.shape");
		return "returned Sweet";
	}

	public int hashCode()
	{
		System.out.println("Invoked hashCode from sweet");
		return 5;

	}

	public boolean equals(Object obj)
	{
		System.out.println("Invoked equals method from Sweet");
		if(obj!=null)
		{
			System.out.println("reference is not null");

		if(obj instanceof Sweet)
		{
			System.out.println("Ref is Watch");
			Sweet casted=(Sweet)obj;
			String castedName=casted.getName();
			Color castedColor=casted.getType();
			if(this.name.equals(castedName)&& this.type.equals(castedColor))
			{
				System.out.println("name and colorType are matching");
				return true;
			}
			else
			{
				System.err.println("name or color type is not matching");
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Color getType() {
		return type;
	}

	public void setType(Color type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

}

