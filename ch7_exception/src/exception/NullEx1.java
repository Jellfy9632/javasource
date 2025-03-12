package exception;

public class NullEx1 {
    public static void main(String[] args) {

        String str = null;

        // NullPointerException : 실행 시 발생
        // System.out.println(str.length());

        Account accounts[] = new Account[5];
        try {
            for (Account account : accounts) {
                if (account != null) {
                    System.out.println(account.getAno());

                }

                System.out.println(account.getAno());

            }
            // if를 사용하지 않는다면 널포인터가 발생할 때 처리 필요

        } catch (NullPointerException e) {
            // e.printStackTrace();
            // System.out.println(e.getMessage());
            System.out.println("입력을 확인해주세요");
        }

    }

}
