package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
        divide(4, 0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        for (Map.Entry<String, String> entry : studentFiles.entrySet()) {
            CheckFileExtension(entry.getKey(), entry.getValue());
        }
    }

    public static int divide(int x, int y) {
        try {
            if (y == 0) {
                throw new ArithmeticException("we cannot divide by 0, unless you really hate your students.");
            }
            return x / y;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return -1;
        }
    }


    public static int CheckFileExtension(String name, String fileName) {

        if (fileName == null || fileName.isEmpty()) {
            try {
                throw new Exception("Where is your file, " + name +"?");
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            return -1;
        }
        if (fileName.endsWith(".java")) {
            return 1;
        }
        return 0;
    }
}
