import java.util.ArrayList;
import java.util.Collections;

public class ComparePoints {
    int x;
    int y;
    int z;

    ComparePoints(int a, int b, int c){
        x = a;
        y = b;
        z = c;
    }

    private void print(){
        System.out.println(x+", "+y+" ,"+z);
    }

    public static void main(String[] args) {
        ComparePoints point1 = new ComparePoints(3,6,1);
        ComparePoints point2 = new ComparePoints(3,4,1);

        ArrayList<ComparePoints> my_list = new ArrayList<>();
        my_list.add(point1);                    // Creates an ArrayList and adds instnaces of ComparePoints to it
        my_list.add(point2);
        ComparePoints a = my_list.get(0);
        ComparePoints b = my_list.get(1);      // Outputs the current order of elements so we can see what is happening.
        a.print();                          // Outputs 3,6,1
        b.print();                          // Outputs 3,4,1

        System.out.println("Sorted:");
        Collections.sort(my_list, new PointComparator());           // Uses built-in sort method with my overridden comparator.
        ComparePoints c = my_list.get(0);           // Outputs 3,4,1
        ComparePoints d = my_list.get(1);           // Outputs 3,6,1
        c.print();
        d.print();
    }


}
