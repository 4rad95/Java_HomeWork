package Algorithmen.HW_7_20240415;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ActivitySelection {

    public void selectActivity(List<Activity> list) {

        //  Я изменил компаратор

        list.sort(Comparator.comparing((Activity a) -> a.finish).thenComparing(a -> a.start));
        List<Activity> res = new ArrayList<>();

        print(list);
        System.out.println("------------");
        Activity first = list.get(0);
        int last = first.finish; // следующее свободное время
        res.add(first);

        for(int i = 1; i < list.size(); i++) {
            if(list.get(i).start >= last) {
                last = list.get(i).finish;
                res.add(list.get(i));
            }
        }
        print(res);
    }

    private void print(List<Activity> list) {
        for (Activity e : list) {
            System.out.println(e.name + "  "+e.start+"->"+e.finish);
        }
    }

}