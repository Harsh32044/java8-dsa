package main.java.roughwork;

import java.util.ArrayList;
import java.util.Collection;

public class CustomArrayList extends ArrayList {

    @Override
    public boolean add(Object o) {
        if (this.contains(o))
            return true;
        return super.add(o);
    }

    public static void main(String[] args) {

        CustomArrayList arrayList = new CustomArrayList();

        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);

        arrayList.add(2);

        System.out.println(arrayList);

    }
}
