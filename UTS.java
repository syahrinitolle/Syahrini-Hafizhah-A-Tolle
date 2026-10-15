import java.util.Scanner;
public class UTS {
    public static void main(String[] Args){
    Scanner input = new Scanner(System.in);
        String pinBenar = "123456";
        boolean aksesDiterima = false;

        for (int i = 1; i <= 3; i++) {
            String pinInput = input.nextLine();

            if (pinInput.equals(pinBenar)) {
                System.out.println("Akses Diterima");
                aksesDiterima = true;
                break;
            } else {
                if (i < 3) {
                    System.out.println("PIN Salah");
                }
            }
        }

        if (!aksesDiterima) {
            System.out.println("Kartu Terblokir!");
        }

        input.close();
    }
}