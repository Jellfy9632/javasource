package dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateEx1 {
    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "tiger";

            con = DriverManager.getConnection(url, user, password);

            String sql = "update dept_temp SET loc='SEOUL' WHERE deptno=10";
            pstmt = con.prepareStatement(sql);
            System.out.println(pstmt.executeUpdate() > 0 ? "수정 성공" : "수정 실패");

        } catch (SQLException e) {

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
