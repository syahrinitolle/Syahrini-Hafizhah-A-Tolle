public class bilangan {
    public static void main(String[] args) {
        int a = 1;

        while (a <= 10) {

            if (a % 2 == 0) {
                System.out.println(a + " adalah bilangan genap");
            } else {
                System.out.println(a + " adalah bilangan ganjil");
            }
            a = a + 1;
        }
    }
}