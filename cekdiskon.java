import java.util.Scanner;
public class cek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("masukan status member GOLD, SILVER, BRONZE");
        String status = scanner.nextLine();
        double diskon;
        
        if (status.equals ("GOLD")) {
            diskon = 20;
        } else if (status.equals ("SILVER")) {
            diskon = 15;
        } else if (status.equals("BRONZE")) {
            diskon = 10;
        } else {
            diskon = 0;
            
        }
        System.out.println("Status member: " + status);
        System.out.println("Diskon yang didapat: " + diskon + "%");
    }
}