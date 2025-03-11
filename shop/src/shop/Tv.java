package shop;

public class Tv extends Products {

    public Tv(String p_name, int price, String resolution) {
        super(p_name, price);
        // TODO Auto-generated constructor stub
        this.resolution = resolution;
    }

    private String resolution;

    @Override
    public void printExtra() {
        System.out.println("\t해상도 : " + this.resolution);
    }

}
