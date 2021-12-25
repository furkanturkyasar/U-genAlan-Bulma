import java.util.Scanner;
public class FinalCommit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kenar1, kenar2, kenar3,sonuc, u, alanxalan;
        System.out.print("Birinci degerini giriniz: ");
        kenar1 = input.nextDouble();
        System.out.print("Ikinci degerini giriniz: ");
        kenar2 = input.nextDouble();
        System.out.print("Ucuncu degeri giriniz: ");
        kenar3 = input.nextDouble();
        u = (kenar1+kenar2+kenar3)/2;
        alanxalan = u * (u-kenar1) * (u-kenar2) * (u-kenar3);
        sonuc = Math.sqrt(alanxalan);
        System.out.print("Ucgenin Alani: "+sonuc);



    }
}
