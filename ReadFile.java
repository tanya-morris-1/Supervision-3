import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class ReadFile {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\uk\\ac\\cam\\tam71\\sort_input.txt");         // Reads input file
        Scanner scanner = new Scanner(file);        // Create scanner to go through each line
        String line = " ";      // Initialises line to store the line, pair to hold the line split up by the comma, and a list of lists to hold the pairs.
        String[] pair;
        ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();
        while (scanner.hasNext()){        // If there is another line in the file, this will run
            line = (scanner.nextLine());        // line becomes the next line that the scanner has read
            pair = line.split(", ");        // This splits the line into the 2 individual numbers
            pairs.add(new ArrayList<Integer>(Arrays.asList(Integer.parseInt(pair[0]), Integer.parseInt(pair[1]))));     // Changes the strng to integers, and then adds the pair to the list of pairs
    }
        System.out.println(pairs);      // Outputs unsorted list
        Collections.sort(pairs, new ListSorter());      // Uses Collections framework to sort, based on the algorithm we have written in ListSorter class.
        System.out.println(pairs);          // Outputs sorted list


}

}
