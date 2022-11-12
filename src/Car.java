public class Car {

        public final Double value;

        final String model;
        final String producer;
        public final Integer year;


        public Car(String model, String producer, Integer year, Double value) {
            this.model = model;
            this.producer = producer;
            this.year = year;
            this.value = value;
        }
        public void setOwner()
        {
        }

        public String showCar() {
            return "Marka: " + producer + " Model: " + model + " Rok produkcji: " + year;
        }
}

