package in.sagarkirtakar.File;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {

    String fileName = "java-course.txt";

    // try with resourse.!
    try (FileWriter writer = new FileWriter(fileName)) {

        writer.write("This is the best java youtube course..!");
        for(int i = 0; i< 10; i++) {
            writer.write("\n*");
        }
        writer.flush();
        System.out.println("File written successfully..!");

    } catch(IOException exception) {
        System.out.printf("Exception occured %s", exception.getMessage());
    }

    }
}
