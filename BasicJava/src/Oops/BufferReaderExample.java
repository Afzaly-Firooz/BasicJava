package Oops;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
public class BufferReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        String name = reader.readLine();
        System.out.println("Hello, " + name + "!");
        reader.close();
	}

}
