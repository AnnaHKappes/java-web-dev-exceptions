package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
//        divide(10, 2);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode");
        studentFiles.put("Stefanie", "CoolProgram.java");
        studentFiles.put("Anna", null);

        // Test out your CheckFileExtension() function!
        System.out.println(checkFileExtension(studentFiles.get("Carl")));
    }

//    public static void divide(int x, int y) {
//        // Write code here!
//        if (y == 0) {
//            try {
//                throw new ArithmeticException("You can't divide by zero!");
//            } catch (ArithmeticException e) {
//                e.printStackTrace();
//            }
//        } else {
//            System.out.println(String.format("The quotient of %s divided by %s is: %s", x , y, x/y));
//        }
//        System.out.println("Method finished.");
//    }

    public static int checkFileExtension(String fileName) {
        // Write code here!
        // If fileName ends in .java, give 1 pt
        // If not, give 0 pt
        // If null or an empty string, an exception and give -1 pt

        int point;

        if (fileName == null || fileName == "") {
            try {
                throw new NullPointerException("File can't be null or empty!");
            } catch (NullPointerException e) {
                e.printStackTrace();
                point = -1;
                return point;
            }
        } else if (fileName.endsWith(".java")) {
                point = 1;
                return point;
        } else {
            point = 0;
            return point;
        }
    }
}