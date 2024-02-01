package com.company;

import com.company.comparedemo.Person;
import com.company.comparedemo.PersonCompareByArnona;
import com.company.comparedemo.PersonCompareById;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person p1 = new Person(1, "danny", 1.88f, 1200);
        Person p2 = new Person(1, "danny", 1.88f, 1200);
        Person p3 = new Person(2, "shanny", 1.85f, 0);
        Person p4 = new Person(3, "shlomit", 1.67f, 800);

        System.out.println("is null instanceof Person " + (null instanceof Person));
        System.out.println("is p1 == p2 ? " + (p1.equals(p2)));
        System.out.println("is p1 == null ? " + (p1.equals(null)));
        System.out.println("is p1 == p3 ? " + (p1.equals(p3)));
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(Integer.toHexString(p1.hashCode()));
        System.out.println(Integer.toHexString(p2.hashCode()));

        Person[] people = new Person[4];
        p2.setName("Shlomo");
        p2.setId(4);
        p2.setHeight(1.80f);
        people[0] = p1;
        people[1] = p2;
        people[2] = p3;
        people[3] = p4;

        //System.out.println(people);
        // people.forEach(p => console.log(p))
        System.out.println("============ Array ");
        Arrays.stream(people).forEach(p -> System.out.println(p));
        System.out.println("============ Array sort height");
        Arrays.sort(people);
        Arrays.stream(people).forEach(p -> System.out.println(p));
        System.out.println("============ Array sort by id");
        Arrays.sort(people, new PersonCompareById());
        Arrays.stream(people).forEach(p -> System.out.println(p));

        System.out.println("============ Array sort by arnona");
        Arrays.sort(people, new PersonCompareByArnona());
        Arrays.stream(people).forEach(p -> System.out.println(p));

        Arrays.sort(people);

        System.out.println("============ Array sort by arnona -- anonymous");

//        Arrays.sort(people, new Comparator<Person>() {
//            @Override
//            public int compare (Person o1, Person o2){
//                return o1.getArnonaAmount() - o2.getArnonaAmount();
//            }
//        });

        Arrays.sort(people, (o1, o2) -> o1.getArnonaAmount() - o2.getArnonaAmount());

        Arrays.stream(people).forEach(p -> System.out.println(p));



        System.out.println("============ List");
        ArrayList<Person> people_list = new ArrayList<>();
        people_list.add(p1);
        people_list.add(p2);
        people_list.add(p3);
        people_list.add(p4);
        //people_list.stream().filter(p -> p.getHeight() > 1.80f).toArray();
        people_list.stream().forEach(p -> System.out.println(p));
        Collections.sort(people_list);

    }
}
