package hust.soict.globalict.garbage;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.*;

public class GarbageCreator {
    
    public static void main(String[] args) throws IOException {
        String filename = "OtherProjects/src/hust/soict/globalict/garbage/test.txt";
        byte[] inputBytes = {0};
        long startTime, endTime;

        inputBytes = Files.readAllBytes(Paths.get(filename)); 
        startTime = System.currentTimeMillis();
        StringBuilder outputStringBuilder = new StringBuilder();
        for (byte b : inputBytes) {
            outputStringBuilder.append((char)b);
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
