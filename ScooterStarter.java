class ScooterStarter{

	public static void main(String [] value)
	{
		Scooter scooty=new Scooter("TVS");
		System.out.println(scooty);
		System.out.println(scooty.company);

		Scooter scooty1=new Scooter("58529");
		System.out.println(scooty1);
		System.out.println(scooty1.price);

		Scooter scooty2=new Scooter("65");
		System.out.println(scooty2);
		System.out.println(scooty2.maxSpeed);

		Scooter scooty3=new Scooter("kmDriven");
		System.out.println(scooty3);
		System.out.println(scooty3.kmDriven);

		Scooter scooty4=new Scooter("milage");
		System.out.println(scooty4);
		System.out.println(scooty4.milage);
	}
}