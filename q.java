interface Animal {
    void speak();
    void eat();	
}
 class Dog implements Animal{
	public void speak() {
		System.out.println("Dog bark");
	}
	public void eat() {
		System.out.println("Dog eat bones");
	}
 }
 class cat implements Animal{
		public void speak() {
			System.out.println("Cat meow");
		}
		public void eat() {
			System.out.println("Cat veggies");
		}
	 }

class q{
 public static void main(String[] args) {
      Animal d=new Dog();
      d.speak();
      d.eat();
      d=new cat();
System.out.println("\n---------------------\n");
      d.speak();
      d.eat();
}
}