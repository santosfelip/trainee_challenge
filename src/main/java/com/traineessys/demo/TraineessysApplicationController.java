package com.traineessys.demo;

import com.google.gson.Gson;
import intity.DataJson;
import intity.People;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

@RestController
public class TraineessysApplicationController {

    @GetMapping("/report")
    @ResponseBody
    public People[] listData()
    {
        DataJson dataJson = new DataJson();

        Gson gson = new Gson();
        People[] userArray = gson.fromJson(dataJson.getPostsAsObject(), People[].class);

        Arrays.sort(userArray, new Sortbyroll());
        return userArray;

    }

    class Sortbyroll implements Comparator<People>
    {
        // Used for sorting in ascending order of
        // roll number
        public int compare(People a, People b)
        {
            return a.getEmployee_age() - b.getEmployee_age();
        }



        @Override
        public Comparator<People> reversed() {
            return null;
        }

        @Override
        public Comparator<People> thenComparing(Comparator<? super People> other) {
            return null;
        }

        @Override
        public <U> Comparator<People> thenComparing(Function<? super People, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
            return null;
        }

        @Override
        public <U extends Comparable<? super U>> Comparator<People> thenComparing(Function<? super People, ? extends U> keyExtractor) {
            return null;
        }

        @Override
        public Comparator<People> thenComparingInt(ToIntFunction<? super People> keyExtractor) {
            return null;
        }

        @Override
        public Comparator<People> thenComparingLong(ToLongFunction<? super People> keyExtractor) {
            return null;
        }

        @Override
        public Comparator<People> thenComparingDouble(ToDoubleFunction<? super People> keyExtractor) {
            return null;
        }
    }
}
