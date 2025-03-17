package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//추상 클래스 : 클래스 + 추상메서드, 직접객체 생성불가, 부모역할
// int read(), int read(byte[] b, in off, int len), int read(byte b[])
// write(in b), write(byte b[],int off, int len), write(byte b[])
public class InputStreamEx2 {
    public static void main(String[] args) {
        // ~~Stream : 입력값 byte 형태로 처리
        InputStream in = System.in; // 입력장치에서 읽어오기
        OutputStream out = System.out;

        try {
            System.out.print("이름 : ");
            byte[] b = new byte[1024];
            int input = in.read(b);

            // String 객체 생성
            // enter : 캐리지리턴(13) + 라인피드(10)
            String name = new String(b, 0, input - 2);
            System.out.println(name);

            // while (in.read(b) != -1) {
            // out.write(b);
            // }

        } catch (IOException e) {
            e.printStackTrace();
        }

        finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
