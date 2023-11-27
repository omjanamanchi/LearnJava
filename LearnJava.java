import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class LearnJava extends Thread {
    private volatile boolean isRunning = true;

    public static void main(String[] args) {

        // print() vs println()
        System.out.println("\nprint() vs println():");
        System.out.print("print() - current line");
        System.out.println();
        System.out.println("println() - next line");

        // escape characters
        System.out.println("\nescape characters:");
        System.out.println("a\tb"); // \t is for tab
        System.out.println("a\nb"); // \n is for next line
        System.out.println("a\\\b"); // \\\ is for \\
        System.out.println("a\"b\"\n"); // \" \" is for " "

        // variables
        System.out.println("varibles:");
        String stringDef = "string"; // string stores text with double quotes
        int intDef = 1; // int stores
        double doubleDef = 1.0; // double stores decimals
        char charDef = 'a'; // char stores single characters with single quotes
        boolean booleanDef = true; // boolean sets true or false value
        System.out.println("stringDef = " + stringDef + "\nintDef = " + intDef + "\ndoubleDef = " + doubleDef
                + "\ncharDef = " + charDef + "\nbooleanDef = " + booleanDef + "\n");

        /*
         * Primitive data types specifies the size and type of variable values with no
         * additional methods
         * - includes byte, short, int, long, float, double, boolean and char
         * Non-primitive data types are not pre-defined in Java and created by
         * programmers, typically objects
         * - includes String, Arrays and Classes
         */

        // operations
        int x = 1, y = 2;
        System.out.println("operations:");
        System.out.println("Addition (x+y) = " + (x + y)); // +=
        System.out.println("Subtraction (x-y) = " + (x - y)); // -=
        System.out.println("Multiplication (x*y) = " + (x * y)); // *=
        System.out.println("Divison (x/y) = " + (x / y)); // /=
        System.out.println("Modulus-Remainder (x%y) = " + (x % y)); // %=
        x++; // increments x by 1 (x+1)
        y--; // decrements y by 1 (y-1);
        System.out.println("x started as 1 now x = " + x + "\ny started as 2 now y = " + y);
        System.out.println(x < y); // <, >, <=, >=, ==, !=
        // && both conditionals must be true
        // || at least one of the conditionals must be true

        // string methods
        System.out.println("\nstring methods:");
        String text = "hello";
        System.out.println("text.length() = " + text.length()); // returns length of text
        System.out.println("text.toUpperCase() = " + text.toUpperCase()); // sets all letters to uppercase
        System.out.println("text.toLowerCase() = " + text.toLowerCase()); // sets all letters to lowercase
        System.out.println("text.indexOf(\"h\") = " + text.indexOf("h")); // returns position of 'h' in "hello"

        // math methods
        int z = 64, w = -5, randomNumber = (int) (Math.random() * 10 + 1); // 1 to 10
        System.out.println("\nmath methods:");
        System.out.println("Math.max(x,y) = " + Math.max(x, y)); // returns max number between x and y
        System.out.println("Math.min(x,y) = " + Math.min(x, y)); // returns min number between x and y
        System.out.println("Math.sqrt(z) = " + Math.sqrt(z)); // returns square root of z
        System.out.println("Math.abs(w) = " + Math.abs(w)); // returns absolute value of w
        System.out.println("Math.pow(x,y) = " + Math.pow(x, y)); // returns x^y
        System.out.println("randomNumber = " + randomNumber + "\n"); // returns random number between range of 1 to 10

        // if-else conditional statements
        System.out.println("if-else conditional statements:");
        if (x > y)
            System.out.println("x is greater than y");
        else if (x == y)
            System.out.println("x equals y");
        else if (x < y)
            System.out.println("x is less than y");
        else
            System.out.println("UNABLE TO COMPUTE");

        String result = (x > y) ? "x is greater than y" : "x is less than y"; // simplified if-else statement
        System.out.println("result = " + result + "\n");

        // switch statements
        System.out.println("switch statements:");
        int numColor = 1;
        String color = "";
        switch (numColor) {
            case 1:
                color = "red";
                break;
            case 2:
                color = "blue";
                break;
            case 3:
                color = "yellow";
                break;
            default:
                color = "";
                break;
        }
        System.out.println("numColor = " + numColor + ", color = " + color + "\n");

        // while loops - while loops repeat tasks as long as the condition is true
        System.out.println("while loops:");
        while (y > 0) {
            System.out.println(y + " ");
            y--;
        }

        do { // do-while loops execute at once then will check the condition to continue
            System.out.println(y + " ");
            y--;
        } while (y > 0);

        // for loops - for loops repeat tasks as long as the condition is true as well
        System.out.println("\nfor loops:");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 1; j++)
                System.out.print(j + " ");
            System.out.println();
        } // you can nest for loops to get 2D data structures
        System.out.println();
        String[] carBrands = { "Volvo", "BMW", "Ford", "Mazda" };
        for (String i : carBrands) // for-each loops are useful to print out elements in arrays
            System.out.print(i + " ");

        // arrays - same for 2D arrays syntax --> String[][] fruits
        String[] fruits = { "apple", "orange", "banana" };
        System.out.println("\n\narrays:");
        System.out.println("fruits.length = " + fruits.length); // array length
        System.out.println("fruits[0] = " + fruits[0]); // returns value at index 0 which is apple
        fruits[0] = "pineapple"; // sets index 0 to new value
        System.out.println("fruits[0] = " + fruits[0]);
        for (String fruit : fruits)
            System.out.print(fruit + " ");

        // methods output
        System.out.println("\n\nmethods:\n" + "sum(x,y) = " + sum(x, y) + "\n");

        // user input - scanner takes in user input in any of the variables learned
        Scanner scanner = new Scanner(System.in);
        System.out.println("input:");
        System.out.print("Input a number: ");
        int num = scanner.nextInt();
        System.out.println("num = " + num + "\n");

        // arraylist - better to use than arrays in many cases
        System.out.println("arraylist:");
        ArrayList<String> toys = new ArrayList<String>();
        toys.add("car");
        toys.add("ball");
        toys.add("teddy bear"); // add toys to arraylist
        printArrayList(toys);
        System.out.println("toys.get(0) = " + toys.get(0)); // gets value at index 0
        toys.set(0, "legos");
        System.out.print("toys.set(0, \"legos\") = "); // set index 0 to legos
        printArrayList(toys);
        toys.remove(0);
        System.out.print("toys.remove(0) = "); // removes index 0 from arraylist
        printArrayList(toys);
        Collections.sort(toys); // sort arraylist in alphabetical order
        System.out.print("Collections.sort(toys) = ");
        printArrayList(toys);
        System.out.println("toys.size() = " + toys.size()); // returns size of arraylist
        toys.clear();
        System.out.print("toys.clear() = ");
        printArrayList(toys);

        // linkedlist - most efficient
        System.out.println("\nlinkedlist:");
        LinkedList<String> toy = new LinkedList<String>();
        toy.add("car");
        toy.add("ball");
        toy.add("teddy bear"); // add toys to linkedlist
        System.out.print("toy = ");
        printLinkedList(toy);
        toy.addFirst("addFirst"); // adds to beginning of linkedlist
        System.out.print("toy.addFirst(\"addFirst\") = ");
        printLinkedList(toy);
        toy.addLast("addLast"); // adds to end of linkedlist
        System.out.print("toy.addLast(\"addLast\") = ");
        printLinkedList(toy);
        toy.removeFirst(); // remove from beginning of linkedlist
        System.out.print("toy.removeFirst() = ");
        printLinkedList(toy);
        toy.removeLast(); // remove from end of linkedlist
        System.out.print("toy.removeLast() = ");
        printLinkedList(toy);
        System.out.println("toy.getFirst() = " + toy.getFirst()); // get item at beginning of linkedlist
        System.out.println("toy.getLast() = " + toy.getLast() + "\n"); // get item at end of linkedlist

        // hashmaps - key|value relationship where key: country | value: city
        System.out.println("hashmaps:");
        HashMap<String, String> capital_city = new HashMap<String, String>();
        capital_city.put("England", "London");
        capital_city.put("Germany", "Berlin");
        capital_city.put("Norway", "Oslo");
        capital_city.put("USA", "Washington DC");
        System.out.println("capital_city.get(\"England\") = " + capital_city.get("England")); // get(key)
        System.out.println("capital_city.remove(\"England\") = " + capital_city.remove("England")); // remove(key)
        System.out.print("capital_city = ");
        printHashMap(capital_city);
        System.out.println("capital_city.size() = " + capital_city.size()); // returns size of hashmap
        System.out.print("capital_city (keys) = ");
        for (String city : capital_city.keySet())
            System.out.print(city + ", "); // prints keys in hashmap
        System.out.print("\ncapital_city (values) = ");
        for (String city : capital_city.values())
            System.out.print(city + ", "); // prints values in hashmap
        capital_city.clear();
        System.out.print("\ncapital_city = ");
        printHashMap(capital_city);

        // hashset
        System.out.println("\nhashset:");
        HashSet<Integer> evenNumbers = new HashSet<Integer>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        evenNumbers.add(8);
        System.out.println("evenNumbers.contains(2) = " + evenNumbers.contains(2)); // check value in hashset
        evenNumbers.remove(6);
        System.out.println("evenNumbers.remove(6) = " + evenNumbers); // remove value from hashset
        System.out.println("evenNumbers.size() = " + evenNumbers.size()); // returns size of hashset
        System.out.print("evenNumbers = ");
        for (int evenNum : evenNumbers)
            System.out.print(evenNum + ", ");
        evenNumbers.clear();
        System.out.println("\nevenNumbers = " + evenNumbers);

        // threads - way to complete tasks (3 ways: runnable, callable, virtual)
        System.out.println("\nthreads:");
        LearnJava thread = new LearnJava();
        thread.start();
        try {
            Thread.sleep(5000); // Sleep for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.shutdown();

        // files
        System.out.println("\nfiles:");

        // Create and Write to a File
        File myObj = new File("file.txt");
        try (FileWriter myWriter = new FileWriter(myObj)) {
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
                myWriter.write("wrote to file.txt");
                System.out.println("Successfully wrote to file.txt");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Read from a File
        System.out.println("\nRead a File");
        try (Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Gain File Info
        System.out.println("\nFile Info");
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }

        // Delete a File
        System.out.println("\nDelete a File");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }

    }

    // methods - small tasks used to reduce redundency and improve efficiency
    public static int sum(int a, int b) {
        return (a + b);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread is running... " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        shutdown();
    }

    public void shutdown() {
        System.out.println("Shutting down the thread...");
        isRunning = false;
    }

    public static void printArrayList(ArrayList<String> list) {
        System.out.println(list);
    }

    public static void printLinkedList(LinkedList<String> list) {
        System.out.println(list);
    }

    public static void printHashMap(HashMap<String, String> hashMap) {
        System.out.println(hashMap);
    }
}