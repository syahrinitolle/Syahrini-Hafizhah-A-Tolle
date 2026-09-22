import java.util.Scanner;
public class percabangan {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("masukan nilai (0-100): ");
        int nilai = input.nextInt();
        char  huruf;
        if (nilai >= 85) {
            huruf = 'A';
        } else if (nilai >= 70) {
            huruf = 'B';
        } else if (nilai >= 60) {
            huruf = 'C';
        } else if (nilai >= 50) {
            huruf = 'D';
        } else {
            huruf = 'E';
        }
        System.out.println("Nilai huruf: " + huruf);

    }

}
