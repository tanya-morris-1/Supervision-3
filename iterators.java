import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class iterators {

    protected float for_loop(List<Integer> list){
        float sum = 0;
        for (int i = 0; i<list.size(); i++){
            sum += list.get(i);
        }
        return sum/list.size();
    }

    protected float for_each(List<Integer> list){
        float sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        return sum/list.size();
    }

    protected float iterator(List list){
        Iterator<Integer> list_iterator = list.iterator();
        float sum = 0;
        while (list_iterator.hasNext()) {
            sum += list_iterator.next();
        }
        return sum/list.size();
    }


    public static void main(String[] args) {
        List<Integer> my_list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        iterators averages = new iterators();
        System.out.println("For loop:");
        System.out.println(averages.for_loop(my_list));
        System.out.println("For each loop:");
        System.out.println(averages.for_each(my_list));
        System.out.println("Iterator:");
        System.out.println(averages.iterator(my_list));
    }
}
