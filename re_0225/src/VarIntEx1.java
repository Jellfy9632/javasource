public class VarIntEx1 {
    public static void main(String[] args) {
   
    int age = 15, maxSpeed = 100;
    int max = 256;

    age = 30;

    System.out.println("나이 : "+age + ", 최고속도 : " + maxSpeed);
    System.out.println(age + maxSpeed);

    System.out.printf("나이 : %d , 최고속도 : %d, max : %d\n", age, maxSpeed, max);
    System.out.printf("나이 : %10d , 최고속도 : %d, max : %d\n", age, maxSpeed, max);
    }
    
}
