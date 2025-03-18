package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        int data = 0;
        try {
            fis = new FileInputStream("c:/temp/file1.txt");
            fos = new FileOutputStream("c:/temp/file1.txt");
            long start = System.currentTimeMillis();
            while ((data = fis.read()) != -1) {
                char ch = (char) data;
                // System.out.print(ch);
                fos.write(ch);
            }
            long end = System.currentTimeMillis();
            System.out.println("복사에 걸린 시간 : " + (end - start) + "ms");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
