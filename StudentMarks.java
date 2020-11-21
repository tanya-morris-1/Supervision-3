import java.util.*;

public class StudentMarks {             // Creates a class for Student Marks, to hold the map and methods for it
    private Map<String, Double> marks = new TreeMap<String, Double>();          // Initialises map, with the String being the key for the name and the double the grade

    StudentMarks(Map<String, Double> input){
        marks = input;      // Constructor sets the marks to be the inputted map
    }

    protected List<String> output_students(){                   // Method to output all students
        List<String> students = new ArrayList<>();      // Creates a new list to hold the students
        for (String name : marks.keySet()){     // Iterates through element in the map, through the keys (which are the names)
            students.add(name);     // Adds the name to list of students
        }
        Collections.sort(students);
        return students;        // returns list
    }

    protected double output_mean(){           // Finds mean of scores
        double total = 0;
        for (double score : marks.values()){
            total += score;                     // Iterates through and adds each value
        }
        return total/(marks.size());        // Divides by number of students to find mean
    }

    protected List<String> top_percent(int percent){
        List<Double> sort_by_score = new ArrayList<>(marks.values());       // Creates an array of the scores
        Collections.sort(sort_by_score);                                    // Sorts the array in ascending order
        int top_number = marks.size()*(percent/100);            // Finds the number of students in the top percent
        List<Double> top_grades = new ArrayList<>();        // Initialises a list to hold the top grades only.
        for (int i = top_number; i>=0; i--){
            top_grades.add(sort_by_score.get(marks.size()-i-1));        // Adds the final P% elements in the list
        }
        List<String> top_students = new ArrayList<>();      // Creates a list to hold the name of the students
        for (Double grade: top_grades){     // Goes through each top grade
        for (Map.Entry<String, Double> student: marks.entrySet()){
            if ((student.getValue()) == grade){         // For each grades, checks if the student holds this grade
                top_students.add(student.getKey());     // If so, then the student name is added to the top student list
           }
        }}
        return top_students;            // list returned with top percent of students

    }
    protected double output_median(){           // Finds median of scores
        List<Double> sort_by_score = new ArrayList<>(marks.values());
        Collections.sort(sort_by_score);                    // Gets sorted list of scores, as above
        return sort_by_score.get(sort_by_score.size()/2);       // Returns the middle value
    }


}
