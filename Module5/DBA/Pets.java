public class Pets {
    // declare instance variables for pet name, pet breed and pet age
    private String name;
    private String breed;
    private int age;

    // create the default constructor
    public Pets() {

    }

    // create the constructor with parameters
    public Pets(String _name, String _breed, int _age) {
        name = _name;
        breed = _breed;
        age = _age;
    }

    // setter & getter methods for petName, petBreed and petAge
    public void SetName(String _inp) {
        name = _inp;
    }

    // sets breed
    public void SetBreed(String _inp) {
        breed = _inp;
    }

    // sets age and overload function if somebody puts a double instead of int
    public void SetAge(int _inp) {
        age = _inp;
    }

    public void SetAge(double _inp) {
        age = (int) _inp;
    }

    public String GetName() {
        return name;
    }

    public String GetBreed() {
        return breed;
    }

    public int GetAge() {
        return age;
    }

    public void Output() {

        System.out.println("\n===========================\nThe name of your pet is " + name);
        System.out.println("The breed of your pet is " + breed);
        System.out.println("The age of your pet is " + age + "\n===========================\n");
    }
}
