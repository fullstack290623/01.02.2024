package com.company.comparedemo;

import java.util.Comparator;

public class PersonCompareById implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
//        if (o1.getId() > o2.getId())
//            return +1;
//        else if (o1.getId() < o2.getId())
//            return -1;
//        return 0;

        // 10 8  == +
        // 8 10  == -
        // 10 10 == 0
        return o1.getId() - o2.getId();
    }

}
