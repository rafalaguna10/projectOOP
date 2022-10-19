
class Animal{
    public void animalSound(){
        System.out.println("Sound");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("wow wow");
    }
}

class Pug extends Dog{
    public void animalSound(){
        System.out.println("no puedo respirar soy un pug");
    }
}

class Chicken extends Animal{
    public void animalSound(){
        System.out.println("pio pio");
    }
}


public class Main extends Primary{
    private String name1 = "child";
    public static void main(String[] args) {
        Main objChild = new Main();
        System.out.println(objChild.name+" "+objChild.number);

        Primary objPrimary = new Primary();
        Primary.InnerPrimary objInnerPri = objPrimary.new InnerPrimary();
        Primary.InnerStatic staticOBjInner = new InnerStatic();
        System.out.println(staticOBjInner.x);
        objInnerPri.myMethod();

        Animal xAnimal = new Animal();
        Animal myDog = new Dog();
        Dog myPug = new Pug();
        Animal myChicken = new Chicken();

        xAnimal.animalSound();
        myDog.animalSound();
        myPug.animalSound();
        myChicken.animalSound();
    }
}