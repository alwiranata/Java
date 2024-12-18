
package java_and_lab;

class animal{
    public void animalSound(){
        System.out.println("The animal make sound");
    }
}

class pig extends animal{
    public void animalSound(){
        System.out.println("The pig says :Wee Wee");
    }
}
class dog extends animal{
    public void animalSound(){
        System.out.println("The dog says : Bow Bow");
    }
}

public class Polymorphism {
    public static void main (String[] args){
        animal myAnimal = new animal();
        animal myPig = new pig();
        animal myDog = new dog();
        myAnimal.animalSound();
        myDog.animalSound();
        myPig.animalSound();
    }
}
