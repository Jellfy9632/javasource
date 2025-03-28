package member;

import java.util.List;
import java.util.Scanner;

public class ConsoleUtil {

    public void memberAllprint(List<MemberDTO> list) {
        System.out.println("===================================================");
        System.out.println("번호" + "\t" + "ID" + "\t" + "이름" + "\t주소" + "\t나이" + "\t이메일");
        System.out.println("===================================================");

        for (MemberDTO memberDTO : list) {
            memberPrint(memberDTO);
        }
    }

    // 조회

    public String memberGertInfo(Scanner sc) {
        // 조회할 회원 아이디 리턴
        System.out.print("======회원 조회=====\n");
        System.out.println("1. ID 조회");
        System.out.println("2. 이름 조회");

        System.out.print("번호 >> ");
        int no = Integer.parseInt(sc.nextLine());
        String input = "";
        if (no == 1) {
            System.out.print("조회할 회원아이디 >> ");
            input = sc.nextLine();
        } else {
            System.out.print("조회할 회원 이름 >>");
            input = sc.nextLine();
        }
        return input;

    }

    // dto 출력메소드
    public void memberPrint(MemberDTO dto) {
        // dto 출력
        System.out.println();
        System.out.print("번호 : " + dto.getNo() + "\t");
        System.out.print("ID : " + dto.getId() + "\t");
        System.out.print("NAME : " + dto.getName() + "\t");
        System.out.print("주소 : " + dto.getAddr() + "\t");
        System.out.print("EMAIL : " + dto.getEmail() + "\t");
        System.out.print("나이 : " + dto.getAge() + "\t");
        System.out.println();
    }

    // 삭제작업

    public String memberDeleteInfo(Scanner sc) {
        System.out.println("=====회원삭제======");

        // 삭제할 회원아이디 입력
        System.out.print("삭제할 아이디 입력>> ");
        String id = sc.nextLine();
        // 입력 받은 아이디 리턴
        return id;
    }

    public MemberDTO memberInsertInfo(Scanner sc) {
        System.out.println();
        MemberDTO memberDTO = new MemberDTO();
        System.out.println("====== 회원정보 입력화면 ======");
        System.out.print("아이디>> ");
        memberDTO.setId(sc.nextLine());
        System.out.print("이름>> ");
        memberDTO.setName(sc.nextLine());
        System.out.print("주소>> ");
        memberDTO.setAddr(sc.nextLine());
        System.out.print("이메일>> ");
        memberDTO.setEmail(sc.nextLine());
        System.out.print("나이>> ");
        memberDTO.setAge(Integer.parseInt(sc.nextLine()));

        return memberDTO;
    }

    // 성공시 출력 메소드

    public void printSuccessMessage(int result) {
        // result 값에따라 입력 성공/실패 출력
        System.out.println(result > 0 ? "입력성공" : "입력실패");
    }

    public void printDeleteSuccessMessage(int result) {
        // result 값에따라 입력 성공/실패 출력
        System.out.println(result > 0 ? "삭제성공" : "삭제실패");
    }

    // 업데이트 성공시 출력 메소드
    public void printUpdateSuccessMessage(int result, String id) {
        // result 값에따라 입력 성공/실패 출력
        System.out.println(result > 0 ? id + "님의 정보를 수정하였습니다" : id + "님의 정보 수정에 실패하였습니다");
    }

    public MemberDTO memberUpdateMenu(Scanner sc) {
        MemberDTO mDto = null;
        System.out.println("=======회원 정보 수정=======");
        System.out.println("1. 주소 수정");
        System.out.println("2. 이메일 수정");
        System.out.println("=============================");
        System.out.print("번호 >> ");
        int no = Integer.parseInt(sc.nextLine());

        if (no == 1) {
            // no == 1 memberUpdateAddr() 호출
            return memberUpdateAddr(sc);
        } else if (no == 2) {
            // no == 2 memberUpdateEmail() 호출
            return memberUpdateEmail(sc);
        }
        return mDto;
    }
    // 리턴받은 DTO 를 리턴

    public MemberDTO memberUpdateAddr(Scanner sc) {
        // 수정할 값 입력 (id, 변경할 addr)
        MemberDTO mDto = new MemberDTO();
        System.out.print("id 입력>>");
        mDto.setId(sc.nextLine());

        System.out.print("변경할 주소>>");
        mDto.setAddr(sc.nextLine());

        return mDto;

    }

    public MemberDTO memberUpdateEmail(Scanner sc) {
        // 수정할 값 입력 (id, 변경할 Email)

        MemberDTO mDto = new MemberDTO();
        System.out.print("id 입력>>");
        mDto.setId(sc.nextLine());

        System.out.print("변경할 메일주소>>");
        mDto.setEmail(sc.nextLine());

        return mDto;

    }

}
