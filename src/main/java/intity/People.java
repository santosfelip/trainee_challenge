package intity;

import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.io.Serializable;

public class People  implements Serializable {

    public int getId() {
        return id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public double getEmployee_salary() {
        return employee_salary;
    }

    public int getEmployee_age() {
        return employee_age;
    }

    public String getProfile_image() {
        return profile_image;
    }

    private final int  id;
    private final String employee_name;
    private final double employee_salary;
    private final int employee_age;
    private final String profile_image;


    public People(int id, String employee_name,double employee_salary, int employee_age, String profile_image) {
        this.id = id;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
        this.employee_age = employee_age;
        this.profile_image = profile_image;
    }

}
