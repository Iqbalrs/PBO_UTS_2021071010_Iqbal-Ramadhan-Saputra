import java.lang.Math;
public class Lingkaran {
    private double r;
    private final double PHI = 3.14;

    //method
    public Lingkaran(){
        this.r = 0;
    }
    public Lingkaran(double jari){
        this.r = jari;
    }
    public void setR(double jari) {
        this.r = jari;
    }
    public double getR() {
        return this.r;
    }
    public double luas() {
        return this.PHI * Math.pow(this.r,2);
    }
    public double keliling(){
        return 2 * this.PHI * this.r;
    }
    public static void main(String[] args){
        Lingkaran link1 = new Lingkaran();
        link1.setR(10);
        System.out.println("Luas Lingkaran 1 = " + link1.luas());

        //cara 2
        Lingkaran link2 = new Lingkaran(100);
        System.out.println("Luas Lingkaran 2 = " + link2.luas());
    }
}
