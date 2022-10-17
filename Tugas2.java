import java.util.Scanner;
public class Tugas2 {

    public static void main(String args[])
    {
        Scanner masuk = new Scanner(System.in);
        int jk;
        float berat, tinggi, bmi, meter;
        double broca;

        System.out.println("PROGRAM JAVA MENGHITUNG BERAT BADAN IDEAL DENGAN BMI & RUMUS BROCA");
        System.out.println("............................................");
        System.out.print ("Masukan Jenis Kelamin (1.Laki-lai)| (2.Perempuan): ");
        jk = masuk.nextInt();
        System.out.print ("Masukan Berat: ");
        berat = masuk.nextFloat();
        System.out.print ("Masukan Tinggi: ");
        tinggi = masuk.nextFloat();
        meter=tinggi/100;

        bmi=(berat/(meter*meter));

        System.out.println("............................................");
        System.out.print("BMI : "+bmi+" ");

        if (bmi<18.5){
            System.out.println("(Underweight)");
        }else if (bmi<=22.9){
            System.out.println("(Ideal)");
        }else if (bmi<23.9){
            System.out.println("(Overweight)");
        }else {
            System.out.println("(Obesitas)");
        }

        switch(jk){
            case 1 : broca=((tinggi-100)-(0.10*(tinggi-100))); break;
            case 2 : broca=((tinggi-100)-(0.15*(tinggi-100))); break;
            default : broca=0;
        }

        int hasil = (int)broca;
        System.out.println("Berat badan ideal anda (menurut rumus Broca) : "+hasil+" Kg");
    }

}
