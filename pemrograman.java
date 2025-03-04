package tugas1;
import java.util.Scanner;

public class pemrograman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Anda sedang belajar apa?");
        System.out.println("1.Pemrograman Web");
        System.out.println("2.Pemrograman Mobile");
        System.out.println("3.Data Scince");

        System.out.print("Silakan pilih program (1-3): ");
        int pilihan = scanner.nextInt();

        System.out.print("Apakah anda yakin? (OK/Cancel): ");
        String konfirmasi = scanner.next();

        if (konfirmasi.equalsIgnoreCase("OK")) {
            switch (pilihan) {
                case 1:
                    System.out.println("Belajar pemrograman web sangat mudah.");

                    break;
                case 2: 
                    System.out.println("Belajar pemrograman web sangat menarik");

                    break;
                case 3:
                    System.out.println("Belajar data science sangat bermanfaat");
                default:
                    System.out.println("pilihan tidak valid");
                    break;
            }
        } else {
            System.out.println("Anda batal memilih program.");
        }

        scanner.close();
    }
}
