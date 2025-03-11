package shop;

public class CellPhone extends Products {

    private String carrier;

    public CellPhone(String p_name, int price, String carrier) {
        super(p_name, price);
        // TODO Auto-generated constructor stub
        this.carrier = carrier;
    }

    @Override
    public void printExtra() {
        System.out.println("\t통신사 : " + this.carrier);
    }

}
