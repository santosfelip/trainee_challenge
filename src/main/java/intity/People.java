package intity;

public class People{
    private final long id;
    private final String name;
    private final double salary;
    private final int age;
    private final String image;


    public People(long id, String name, double salary, int age, String image) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.image = image;
    }

    //Getter and Setters
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
    public String getImage() {
        return image;
    }
}
