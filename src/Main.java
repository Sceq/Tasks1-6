public class Main {
    public static void main(String[] args) {

        Animal dog = new Animal("canis");
        dog.name = "Szarik";
        dog.age = 4;

        System.out.println(dog.name);
        System.out.println(dog.species);
        System.out.println(dog.getWeight() + "kg");


        System.out.println("\n[Task1]\n");
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();


        Animal cat = new Animal("felis");
        cat.name = "sierściuch";
        cat.age = 5;


        cat.feed();
    }
}