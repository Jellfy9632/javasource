package dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertEx1 {
    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement pstmt = null;

        try {

            Class.forName("oracle.jdbc.OracleDriver");
            // connection 객체 생성
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "tiger";
            Scanner sc = new Scanner(System.in);

            con = DriverManager.getConnection(url, user, password);

            String sql = "insert into dept_temp(deptno,dname,loc) values(10, 'ACOUNTING', 'NEW YORK')";
            pstmt = con.prepareStatement(sql);

            int result = pstmt.executeUpdate();

            System.out.println(result > 0 ? "입력성공" : "입력실패");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
