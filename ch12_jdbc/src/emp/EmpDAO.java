package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpDAO {
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public List<EmpDTO> selectAll() {

        con = getConnection();

        String sql = "SELECT * FROM emp_temp";
        List<EmpDTO> list = new ArrayList<>();
        try {
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            // rs 객체에 담긴 결과를 옮기기 => DTO
            while (rs.next()) {
                EmpDTO eDto = new EmpDTO();
                eDto.setEmpNo(rs.getInt("empNo"));
                eDto.setEName(rs.getString("eName"));
                eDto.setJob(rs.getString("job"));
                eDto.setMgr(rs.getInt("mgr"));
                eDto.setHireDate(rs.getString("HireDate"));
                eDto.setComm(rs.getInt("Comm"));
                eDto.setDeptNo(rs.getInt("DeptNo"));
                eDto.setSal(rs.getInt("Sal"));
                list.add(eDto);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return list;
    }

    // select , insert, update, delete 처리 메소드
    public EmpDTO select(int empNo) {

        con = getConnection();

        String sql = "SELECT * FROM emp_temp WHERE empno=?";
        EmpDTO eDto = null;
        try {
            pstmt = con.prepareStatement(sql);
            // ? 해결
            pstmt.setInt(1, empNo);
            rs = pstmt.executeQuery();

            // rs 객체에 담긴 결과를 옮기기 => DTO
            if (rs.next()) {
                eDto = new EmpDTO();
                eDto.setEmpNo(rs.getInt("empNo"));
                eDto.setEName(rs.getString("eName"));
                eDto.setJob(rs.getString("job"));
                eDto.setMgr(rs.getInt("mgr"));
                eDto.setHireDate(rs.getString("HireDate"));
                eDto.setComm(rs.getInt("Comm"));
                eDto.setDeptNo(rs.getInt("DeptNo"));
                eDto.setSal(rs.getInt("Sal"));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return eDto;
    }

    // static: 인스턴스 변수,인서턴스 메서드 앞에 붙으면 공유(생성되는 모든 인스턴스가 같은걸 사용)
    static {
        try {
            // 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {

        try {
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "tiger";
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;
    }

    public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
        try {
            pstmt.close();
            con.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close(Connection con, PreparedStatement pstmt) {
        try {
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // 로드 시점이 가장먼저 로드됨

    // select,insert,update,delete 처리 메소드
    public int insert(EmpDTO eDto) {
        con = getConnection();
        int result = 0;

        try {
            String sql = "insert into emp_temp(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)";
            sql += "values(?,?,?,?,?,?,?,?)";
            pstmt = con.prepareStatement(sql);
            // ? 해결
            pstmt.setInt(1, eDto.getEmpNo());
            pstmt.setString(2, eDto.getEName());
            pstmt.setString(3, eDto.getJob());
            pstmt.setInt(4, eDto.getMgr());
            pstmt.setString(5, eDto.getHireDate());
            pstmt.setInt(6, eDto.getSal());
            pstmt.setInt(7, eDto.getComm());
            pstmt.setInt(8, eDto.getDeptNo());

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;

    }

    public int update(EmpDTO eDto) {
        con = getConnection();
        int result = 0;
        String sql = "update emp_temp SET sal=? where empno=?";
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, eDto.getSal());
            pstmt.setInt(2, eDto.getEmpNo());

            result = pstmt.executeUpdate();
        } catch (SQLException e) {

            e.printStackTrace();
        }

        try {

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
        return result;
    }

    public int delete(int empno) {
        con = getConnection();
        String sql = "delete from emp_temp where empno=?";
        int result = 0;
        try {
            pstmt = con.prepareStatement(sql);
            // 물음표 해결
            pstmt.setInt(1, empno);
            result = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }
}
