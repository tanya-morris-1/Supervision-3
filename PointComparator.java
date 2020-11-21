import java.util.Comparator;

public class PointComparator implements Comparator<ComparePoints> {
    @Override
    public int compare(ComparePoints o1, ComparePoints o2) {
        if (o1.z>o2.z){             // As comparison starts with z, this is run first, then y then x.
            return 1;               // If o1.z is larger, it must be the 'larger' value in this comparison hence return 1.
        }
        else if (o1.z<o2.z){            // Else if z is smaller, we know this is the smaller value.
            return -1;
        }
        else if (o1.y>o2.y){       // The same process is done for y, and then x.
            return 1;
        }
        else if (o1.y<o2.y){
            return -1;
        }
        else if (o1.x > o2.x){
            return 1;
        }
        else if (o1.x<o2.x){
            return -1;
        }
        else if ((o1.x == o2.x) && (o1.y == o2.y) && (o1.z == o2.z)){   // If they are exactly equal, 0 is returned.
            return 0;
        }
        else return -1;

    }
}
