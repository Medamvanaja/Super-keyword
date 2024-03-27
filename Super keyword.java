class Cat
{
    public void animalSound(){
        System.out.println("The cat says:meow");
    }
}
class Dog extends Cat{
public void animalSound()
{
    super.animalSound();
    System.out.println("the dog says:bow wow");
    }
}
public class Main
{
    public static void main(String[]args)
    {
        Cat myDog=new Dog();
        myDog.animalSound();
    }
}
