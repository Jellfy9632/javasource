package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//추상 클래스 : 클래스 + 추상메서드, 직접객체 생성불가, 부모역할
// int read(), int read(byte[] b, in off, int len), int read(byte b[])
// write(in b), write(byte b[],int off, int len), write(byte b[])
public class InputStreamEx1 {
    public static void main(String[] args) {
        // ~~Stream : 입력값 byte 형태로 처리
        InputStream in = System.in; // 입력장치에서 읽어오기
        OutputStream out = System.out;

        try {
            // 한바이트만 읽은 후 int로 돌려줌 (영어/숫자만 가능, 한글 불가능)
            // int input = in.read(); // abc입력
            // out.write(input); // a 출력

            // int input = 0;
            // while ((input = in.read()) != -1) {
            // }

            byte[] b = new byte[1024];

            while (in.read(b) != -1) {
                out.write(b);
            }

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
