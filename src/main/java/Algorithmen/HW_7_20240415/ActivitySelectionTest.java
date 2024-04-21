package Algorithmen.HW_7_20240415;
import java.util.ArrayList;

//import static Algorithmen.HW_07_20240415.ActivitySelection.chooseBestActivities;

// 1 уровень сложности: Посмотрите на задачу, которую реализовывали в классе и измените критерии работы жадного алгоритма
// на "максимальная выгода от активностей, второстепенно заполняемость по времени"
// зал для конференций работает с 9:00 до 17:00
// заявки с 9:00 до 13:00 стоят 1 единицу
// заявки с 13:00 до 17:00 стоят 2 единицы
// заявки на пересечении в большую сторону до 13:00 стоят 1 ед
// например с 11 до 14 стоит 1 ед
// заявки на пересечении в большую сторону после 13:00 стоят 2 ед
// например с 12 до 16 стоит 2 ед

public class ActivitySelectionTest {
    public static void main(String[] args) {
        ArrayList<Activity> list = new ArrayList<>();
        list.add(new Activity("a", 16,17));
        list.add(new Activity("b", 15,16));
        list.add(new Activity("c", 10,15));
        list.add(new Activity("d", 12,13));
        list.add(new Activity("e", 14,17));
        list.add(new Activity("f", 10,11));
        list.add(new Activity("g", 14,15));
        list.add(new Activity("i", 11,13));

        // list.add(new Activity("a", 16,17,1));
        // list.add(new Activity("b", 15,16,1));
        // list.add(new Activity("c", 10,15,1));
        // list.add(new Activity("d", 12,13, 1));
        // list.add(new Activity("e", 14,17,1));
        // list.add(new Activity("f", 10,11,1));
        // list.add(new Activity("g", 14,15,1));
        // list.add(new Activity("i", 11,13, 2));

//        List<Activity> selectedActivities = chooseBestActivities(list);
//        System.out.println("Выбранные заявки:");
//        for (Activity activity : selectedActivities) {
//            System.out.println("[" + activity.name + " , "+ activity.startTime + ", " + activity.endTime + "]");
//        }
        ActivitySelection activities = new ActivitySelection();
        activities.selectActivity(list); //с помощью жадного алгоритма ищем оптимальное заполнение зала
    }
}