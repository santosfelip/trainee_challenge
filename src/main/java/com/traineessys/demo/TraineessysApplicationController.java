package com.traineessys.demo;

import com.google.gson.Gson;
import intity.DataJson;
import intity.People;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

@RestController
public class TraineessysApplicationController {

    @GetMapping("/employees/reports/age")
    @ResponseBody
    public People[] listData()
    {
        DataJson dataJson = new DataJson();

        Gson gson = new Gson();
        People[] userArray = gson.fromJson(dataJson.getPostsAsObject(), People[].class);

        Arrays.sort(userArray , Comparator.comparing(People::getEmployee_age));

        return userArray;

    }

    @GetMapping("/employees/reports/salary")
    @ResponseBody
    public People[] listData2()
    {
        DataJson dataJson = new DataJson();

        Gson gson = new Gson();
        People[] userArray = gson.fromJson(dataJson.getPostsAsObject(), People[].class);

        Arrays.sort(userArray , Comparator.comparing(People::getEmployee_salary));

        return userArray;

    }

}
