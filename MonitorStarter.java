class MonitorStarter{

	public static void main(String[] value)
	{
		Monitor monitor=new Monitor("HP");
		System.out.println(monitor);
		System.out.println(monitor.brand);

		Monitor monitor1=new Monitor("150000");
		System.out.println(monitor1);
		System.out.println(monitor1.price);

		Monitor monitor2=new Monitor("size");
		System.out.println(monitor2);
		System.out.println(monitor2.size);

		Monitor monitor3=new Monitor("refreshRate");
		System.out.println(monitor3);
		System.out.println(monitor3.refreshRate);

		Monitor monitor4=new Monitor("resolution");
		System.out.println(monitor4);
		System.out.println(monitor4.resolution);
	}

} 