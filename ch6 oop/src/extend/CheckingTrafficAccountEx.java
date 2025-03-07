package extend;

public class CheckingTrafficAccountEx {
    public static void main(String[] args) throws Exception {
        CheckingTrafficAccount checkingTrafficAccount = new CheckingTrafficAccount("1", "A", 1000000, "C1", false);
        CheckingTrafficAccount checkingTrafficAccount2 = new CheckingTrafficAccount("2", "B", 1000000, "C2", true);

        try {
            checkingTrafficAccount.payTrafficCard("C1", 10000);
            System.out.println(checkingTrafficAccount.getBalance());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            checkingTrafficAccount2.payTrafficCard("C2", 10000);
            System.out.println(checkingTrafficAccount2.getBalance());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
