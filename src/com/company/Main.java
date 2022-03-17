package com.company;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Locale;

public class Main { 
    public  static  double Harry() {
        return 0;
    
}

    public static void main(String[] args) throws IOException {

        String content = new String(Files.readAllBytes(Paths.get( "/Users/Asus/Desktop/kohonen-oct/harry.txt")));
        content = content.toLowerCase(Locale.ROOT).replaceAll(" [ ^A-Za-z]", "");

        String[] words = content.split(" + ");

        String uniqueAsString = "";

        for (int i = 0; i < words.length; i++) {
            if (!uniqueAsString.contains(words[i])) {
                uniqueAsString += words[i] + "";
            }
        }

            String[] uniqueAsArray = uniqueAsString.split("");
            Arrays.sort(uniqueAsArray);

        for (int i =0; i < 20; i++) {
            System.out.println(uniqueAsArray[i]);
        }


    }
}
