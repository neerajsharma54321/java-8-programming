package com.neeraj.string_pattern;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StrongPatternProgram {

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
       int requiredCounter = 0;
       
       
       
       if(Pattern.compile(".*[a-z]*.").matcher(password).matches()) {
           requiredCounter +=1;
       }
       if(Pattern.compile(".*[A-Z]*.").matcher(password).matches()){
            requiredCounter +=1;
       }
       if(Pattern.compile(".*\\d.*").matcher(password).matches()){
            requiredCounter +=1;
       }
       if(Pattern.compile("[^a-z0-9A-Z]").matcher(password).matches()){
            requiredCounter +=1;
       }

       if(n+requiredCounter > 6){
           return 6-requiredCounter;
       } else {
           return requiredCounter;
       }
       
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        String password = scanner.nextLine();
    	int n =11;
    	String password = "#HackerRank";
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        n = 3;
        password = "Ab1";
        answer = minimumNumber(n, password);
        System.out.println(answer);

//        bufferedWriter.write(String.valueOf(answer));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}
