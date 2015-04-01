package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/31/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RestaurantFacts {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<ArrayList <String>> lines = FileParser.getLines("/Users/alvin2/Desktop/accesscode/AC-20150331/nyc-restaurants-small.csv", 14);



        HashMap<String, String> restaurants = new HashMap<String, String>();

        for (ArrayList<String> line : lines) {
            restaurants.put(line.get(1), line.get(14));

        }


        System.out.println("Please enter a restaurant: ");
        String restaurant = input.nextLine();

        if (!restaurants.containsKey(restaurant)) {
            System.out.println("Restaurant not found!");
        } else {
            System.out.println(restaurants.get(restaurant));
        }




        // Step 1. Use FileParser's static method getLines() to get a nested
        //         ArrayList representing the CSV file.
        //
        //         For now, use "nyc-restaurants-small.csv".
        //
        //         Use a parameter to specify which column you're interested
        //         in. For now, use the int 14, which will give you the
        //         restaurant's grade.

        // Step 2. Build a HashMap named "restaurants".
        //         Loop over every line and add the appropriate data to your
        //         HashMap.

        // Step 3. Create a Scanner and prompt the user for a restaurant.
        //         If the restaurant has a relevant fact, print it. Otherwise
        //         print "Restaurant not found.".
    }
}
