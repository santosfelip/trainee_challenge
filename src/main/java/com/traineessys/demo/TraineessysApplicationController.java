package com.traineessys.demo;

import com.google.gson.Gson;
import intity.DataJson;
import intity.Employee;
import intity.People;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

@RestController
public class TraineessysApplicationController {

    @GetMapping("/employees/reports/all")
    @ResponseBody
    public People[] listDataAll()
    {
        DataJson dataJson = new DataJson();

        Gson gson = new Gson();
        People[] userArray = gson.fromJson(dataJson.getPostsAsObject(), People[].class);

        Arrays.sort(userArray , Comparator.comparing(People::getEmployee_age));

        return userArray;

    }

    @GetMapping("/employees/reports/age")
    @ResponseBody
    public HashMap<String,Object> listDataAge()
    {
        DataJson dataJson = new DataJson();

        Gson gson = new Gson();
        People[] userArray = gson.fromJson(dataJson.getPostsAsObject(), People[].class);

        Arrays.sort(userArray , Comparator.comparing(People::getEmployee_age));
        Employee employee = new Employee();

        return employee.ReportAge(userArray);

    }

    @GetMapping("/employees/reports/salary")
    @ResponseBody
    public HashMap<String,Object> listDataSalary()
    {
        DataJson dataJson = new DataJson();

        Gson gson = new Gson();
        People[] userArray = gson.fromJson(dataJson.getPostsAsObject(), People[].class);

        Arrays.sort(userArray , Comparator.comparing(People::getEmployee_salary));

        Employee employee = new Employee();

        return employee.ReportSalary(userArray);
    }

}
