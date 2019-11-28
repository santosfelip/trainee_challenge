package intity;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {


    public HashMap<String, Object> getMap() {
        return map;
    }

    public void setMap(HashMap<String, Object> map) {
        this.map = map;
    }

    private HashMap<String, Object> map = new HashMap<String, Object>();
    private double average;

    public Employee()
    {

    }

    public HashMap<String,Object>  ReportSalary(People[] people)
    {

        Employee test = new Employee();

        this.map.put("smaller",people[0]);
        this.map.put("bigger",people[people.length-1]);
        this.map.put("average",(people[0].getEmployee_salary() + people[people.length-1].getEmployee_salary())/2);

        return map;
    }

    public HashMap<String,Object>  ReportAge(People[] people)
    {

        Employee test = new Employee();

        this.map.put("younger",people[0]);
        this.map.put("older",people[people.length-1]);
        this.map.put("average",(people[0].getEmployee_age() + people[people.length-1].getEmployee_age())/2);

        return map;
    }
}
