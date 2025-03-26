package emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmpMain {
    public static void main(String[] args) {
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        int empNo = 0, result = 0;
        EmpDAO eDao = new EmpDAO();
        EmpDTO eDto = null;

        while (run) {
            System.out.println("====================");
            System.out.println("1. 입력");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 조회");
            System.out.println("5. 종료");
            System.out.println("====================");

            System.out.print("메뉴>> ");
            int menu = Integer.parseInt(scanner.nextLine());

            switch (menu) {
                case 1:
                    eDto = insertINfo(scanner);
                    result = eDao.insert(eDto);
                    System.out.println(result > 0 ? "입력성공" : "입력실패");
                    break;
                case 2:
                    eDto = updateINfo(scanner);
                    eDao.update(eDto);
                    System.out.println(result > 0 ? "수정성공" : "수정실패");
                    break;
                case 3:
                    empNo = deleteINfo(scanner);
                    result = eDao.delete(empNo);
                    eDao.delete(empNo);
                    System.out.println(result > 0 ? "삭제성공" : "삭제실패");
                    break;
                case 4:
                    break;
                case 5:
                    run = false;
                    break;
                default:
                    break;
            }
        }
    }

    public static int deleteINfo(Scanner scanner) {
        // 삭제할 empno 번호를 받아서 리턴
        System.out.print("삭제 대상 cmpNo >> ");
        int empNo = Integer.parseInt(scanner.nextLine());
        return empNo;
    }

    public static EmpDTO updateINfo(Scanner scanner) {
        // 수정할 empno, sal 입력받은 후 리턴
        System.out.print(" 수정 대상 empNo >> ");
        int empNo = Integer.parseInt(scanner.nextLine());

        System.out.print(" 변경 급여>> ");
        int sal = Integer.parseInt(scanner.nextLine());

        EmpDTO eDto = EmpDTO.builder().empNo(empNo).sal(sal).build();

        return eDto;
    }

    public static EmpDTO insertINfo(Scanner scanner) {
        // 수정할 empno, sal 입력받은 후 리턴
        System.out.print(" 사번 >> ");
        int empNo = Integer.parseInt(scanner.nextLine());

        System.out.print(" 이름>> ");
        String eName = scanner.nextLine();

        System.out.print(" 직무>> ");
        String job = scanner.nextLine();

        System.out.print(" 매니저 번호>> ");
        int mgr = Integer.parseInt(scanner.nextLine());

        System.out.print(" 입사일 >> ");
        String hiredate = scanner.nextLine();

        System.out.print(" 급여 >> ");
        int sal = Integer.parseInt(scanner.nextLine());

        System.out.print(" 수당 >> ");
        int comm = Integer.parseInt(scanner.nextLine());

        System.out.print(" 부서 번호 >>");
        int deptno = Integer.parseInt(scanner.nextLine());

        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(hiredate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // EmpDTO eDto = EmpDTO.builder()
        // .empNo(empNo)
        // .eName(eName)
        // .job(job)
        // .mgr(MGR)
        // .hireDate(hiredate)
        // .sal(sal)
        // .comm(comm)
        // .deptNo(deptno)
        // .build();

        // return eDto;

        return new EmpDTO(empNo, eName, job, mgr, hiredate, sal, comm, deptno);
    }

}
