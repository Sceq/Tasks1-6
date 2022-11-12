import devices.Car;

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


        System.out.println("\n         Task 2     \n");

        Car c1 = new Car("Caddy", "Volkswagen", 2004, 10000.0);
        Car c2 = new Car("Octavia", "Skoda", 2007, 15000.0);

        Human filip = new Human("Filip", "Kaniecki");

        filip.setCar(c1);
        System.out.print("Samochód Caddy Volkswagen należy do: "+ filip.firstName +" "+ filip.lastName);
    }


}