package member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberDAO mDao = new MemberDAO();
        MemberDTO mDto = null;
        ConsoleUtil util = new ConsoleUtil();
        int result = 0;

        boolean run = true;

        while (run) {
            System.out.println("======================Member======================");
            System.out.println("1.member 추가");
            System.out.println("2.member 수정");
            System.out.println("3.member 삭제");
            System.out.println("4.member 조회");
            System.out.println("5.member 전체조회");
            System.out.println("6.프로그램종료");
            System.out.println("==================================================");
            System.out.print("메뉴선택 >> ");
            int menu = (Integer.parseInt(sc.nextLine()));

            switch (menu) {
                case 1:
                    MemberDTO dto = util.memberInsertInfo(sc);
                    result = mDao.insert(dto);
                    util.printSuccessMessage(result);
                    break;
                case 2:
                    mDto = util.memberUpdateMenu(sc);
                    if (mDto != null) {
                        result = mDao.update(mDto);
                        // 출력문 호출
                        util.printUpdateSuccessMessage(result, mDto.getId());
                    }
                    break;
                case 3:
                    // result = mDao.delete(util.memberDeleteInfo(sc));
                    // // 삭제 성공 메세지 출력 메소드 호출

                    // mDto = util.memberDeleteInfo(sc);
                    // result = mDao.delete(mDto);

                    String id = util.memberDeleteInfo(sc);
                    result = mDao.delete(id);
                    util.printDeleteSuccessMessage(result);

                    break;
                case 4:
                    String input = util.memberGertInfo(sc);

                    // regex(정규식)
                    // input.matches("^[A-Za-z].*") : 정규식과 일치하면 true

                    // 아이디는 영어로 시작 => getRow()
                    if (input.matches("^[A-Za-z].*")) {

                        MemberDTO row = mDao.getRow(input);
                        if (row != null) {
                            // 출력 메소드
                            util.memberPrint(row);
                        }
                    } else {
                        // 이름은 한글로 시작 => getNamelist()
                        List<MemberDTO> list = mDao.geNametList(input);
                        if (!list.isEmpty()) {
                            util.memberAllprint(list);
                        }
                    }

                    break;
                case 5:
                    // mDao.getList() => 받은 결과를 출력
                    List<MemberDTO> list = mDao.getList();
                    util.memberAllprint(list);
                    break;
                case 6:
                    run = false;
                    break;
                default:
                    break;
            }
        }
    }

}
