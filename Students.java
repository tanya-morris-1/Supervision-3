import java.util.List;
import java.util.Map;

public class Students {
    public static void main(String[] args) {
        Map<String, Double> marks = Map.of("Sarah", 45.6, "Daniel", 90.3, "James", 67.7, "Lisa", 86.7, "Peter", 34.5 );
        StudentMarks Marks = new StudentMarks(marks);
        List<String> top_grades = Marks.top_percent(20);
        double median = Marks.output_median();
        List<String> all_students = Marks.output_students();
        System.out.println(all_students);       // Outputs [Daniel, James, Lisa, Peter, Sarah]
        System.out.println(median);     // Outputs 67.7
        System.out.println(top_grades);     // Outputs [Daniel]
    }
}
