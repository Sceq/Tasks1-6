public class Human {

    Animal pet;
    String firstName;
    String lastName;

    String car;



    Human(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;


    }

    public void setCar(Car vehicle)
    {

    }
    public void getCar()
    {
        System.out.println(this.car);
    }


}
