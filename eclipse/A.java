class A{
	public static void sound()
	{
		System.out.println("Meow");
	}
}
public class B extends A{
	public static void sound(){
		System.out.println("Roar");
	}
	public static void main(String[] args){
		A a=newB();
		a.sound();
	}
}