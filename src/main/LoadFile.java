package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoadFile {
    // The readFile function returns a list containing the array of strings read from the txt files
    public static List<String[]> readFile(String fileName){
        List<Object> list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            while (line != null){
                list.add(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String[]> myList = new ArrayList<String[]>(); // list of arrays

        for (Object o : list){
            String[] arr = o.toString().split("\\s+");
            myList.add(arr);
        }

        for (String[] arr : myList){
            System.out.println(Arrays.toString(arr));
        }
        return myList;
    }
}
