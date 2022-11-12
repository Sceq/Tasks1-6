import devices.Car;
import devices.Phone;

public class Human{

    private static final Double DEFAULT_SALARY = 3500.0;
    private static final String HUMAN_SPECIES = "homo sapiens";


    String firstName;
    String lastName;
    Phone mobile;
    Animal pet;
    private String car;
    private Double salary;


    Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = DEFAULT_SALARY;
    }


    public void setSalary(Double salary) {
        if (salary >= 0) {
            this.salary = salary;
            System.out.println("Nowe dane zostały wysłane do systemu księgowego");
            System.out.println("Należy odebrać aneks do umowy od pani Hani z kadr");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty, nie ma co ukrywać dochodu :)");
        }
        else
        {
            System.out.println("Próbujesz przypisać ujemną wypłatę!");
        }
    }
    public void setCar(Car vehicle)
    {
        if(salary > vehicle.value)
        {
            System.out.println("Udało się kupić samochód za gotówkę!");
            car = vehicle.showCar();
        }
        else if(salary > (vehicle.value/12))
        {
            System.out.println("Udało się kupić samochód na kredyt!");
            car = vehicle.showCar();
        }
        else
        {
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę!");
        }
    }

    public Double getSalary(){

        System.out.println("Ostatnie dane dotyczące wypłaty: 10.10.2022:");
        return this.salary;
    }

    public Double getCash(){
        return this.salary;
    }
    public void getCar()
    {
        System.out.println(this.car);
    }



    String showHuman()
    {
        return "Imię: " + firstName + " Nazwisko: " + lastName + " Nr telefonu: " + mobile + " Zwierzę: " + pet + " Samochód:( " + car + ") Pensja: " + salary;
    }
}

