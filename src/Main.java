public class Main {

    public static void main(String[] args) {
        int sayı1 = 220;
        int sayı2 = 284;
        int toplam1 = 0;
        int toplam2 = 0;

        for (int a = 1; a < sayı1; a++) {
            if (sayı1 % a == 0) {
                toplam1 = toplam1 + a;
            }
        }
        for (int b = 1; b < sayı2; b++) {
            if (sayı2 % b == 0) {
                toplam2 = toplam2 + b;
            }
        }
        if (toplam1 == sayı2 && toplam2 == sayı1) {
            System.out.println("Bu sayılar Arkadaş Sayıdır!");
        } else {
            System.out.println("Bu sayılar Arkadaş Sayı değildir!");
        }
    
    }

}