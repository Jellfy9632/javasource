public class VarFloatEx1 {
    public static void main(String[] args) {

        //소수점 형태는 무조건 double로 인식하기 때문에 뒤에 f를
        //붙여 float 변수로 선언
        float score1 = 90.14f;
        //double 도 d,D 를 붙임
        double score2 = 98.5d;
        System.out.println("score1 = "+score1);
        System.out.println("score2 = "+score2);
        //형식화 된 출력
        System.out.printf("score2 = %.2f\n", score2);
    }
    
}
