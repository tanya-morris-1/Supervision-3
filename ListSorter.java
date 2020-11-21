import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListSorter implements Comparator<ArrayList<Integer>> {     // Comparator of ArrayList<Integer>, representing our list of 2 integers in our bigger list

    @Override
    public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
        if (o1.get(0)>o2.get(0)) return 1;
        else if (o1.get(0)<o2.get(0)) return -1;
        else if (o1.get(0)==o2.get(0)){                 // Compares the first element first, then subsorts by second if necessary
            if (o1.get(1)>o2.get(1)) return 1;
            else if (o1.get(1)<o2.get(1)) return -1;
            else return 0;
        }
        return 0;
    }
}
