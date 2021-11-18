package com.xworkz.camera;

public class Camera {

		private String brand;
		private String company;
		private double price;
		private int modelNo;
		public Camera()
		{

		}

		public boolean equals(Object obj) {
			System.out.println("Object is invoked");
			if (obj != null) {
				System.out.println("obj is not pointing to null");
				if (obj instanceof Camera) {
					System.out.println("refrence is Camera");
					Camera casted = (Camera) obj;
					String castedBrand = casted.getBrand();
					int castedModelNo = casted.getModelNo();
					if (this.brand.equals(castedBrand) && this.modelNo==castedModelNo) {
						System.out.println("brand and modelno matching");
						return true;
					} else {
						System.err.println(" brand and modelno not is matching");
					}
				} else {
					System.err.println("refrence is not Camera");
				}
			} else {
				System.err.println("obj is  pointing to null");
			}
			return false;
		}
		public String toString()
		{
			System.out.println(this.brand);
			System.out.println(this.company);
			System.out.println(this.modelNo);
			System.out.println(this.price);
			return "camera";
		}
		public int hashCode()
		{
			return 90;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getModelNo() {
			return modelNo;
		}
		public void setModelNo(int modelNo) {
			this.modelNo = modelNo;
		}

	}