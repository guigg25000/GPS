package com.example.yoann.gps;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Guillaume on 12/01/2017.
 */

public class FileManagement {



    public int Fil(){

// Instanciate the first element
        String fileName = "test.jpg";

// if there is a selected file, then read it
        if (fileName != null) {
            try {
                //open the file and retrieve the inputStream
                FileInputStream inputStream = new FileInputStream(fileName);
                if (inputStream != null) {
                    // open a reader on the inputStream
                    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

                    // String to use to store read lines
                    String str;
                    StringBuilder buf = new StringBuilder();

                    // Read the file
                    while ((str = reader.readLine()) != null) {
                        buf.append(str + "\r\n");
                    }
                    // Close the reader
                    reader.close();
                    // Close the inputStream
                    inputStream.close();
                    // Affect the text to the textView
                 //setText(buf.toString());
                }
            } catch (java.io.FileNotFoundException e) {
                //Toast.makeText(this, "FileNotFoundException", Toast.LENGTH_LONG);
            } catch (IOException e) {
               // Toast.makeText(this, "FileNotFoundException", Toast.LENGTH_LONG);
            }
        }


        return 0;
    }
}
