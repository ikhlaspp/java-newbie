import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        try (Scanner gameJava = new Scanner(System.in)) {
            System.out.println("Selamat datang di The Sims");
            System.out.println("1. New Game");
            System.out.println("2. Load Game");
            System.out.print("3. Exit Game \nSilahkan memilih opsi diatas : ");
            int mainMenu = gameJava.nextInt();
            switch (mainMenu) {
                case 1:
                    System.out.println("Silahkan membuat karakter sesuai keinginan anda");
                    System.out.println("1. Laki-laki");
                    System.out.println("2. Perempuan");
                    System.out.println("Silahkan memilih gender anda");
                    int pilihanGender = gameJava.nextInt();
                    switch (pilihanGender) {
                        case 1:
                            System.out.println("permainan akan segera dimulai, mohon tunggu beberapa saat");
                        case 2:
                            System.out.println("permainan akan segera dimulai, mohon tunggu beberapa saat");
                    }
                    break;
                case 2:
                    System.out.println("Silahkan memilih permainan anda sebelumnya");
                    System.out.println("1. Char-1");
                    System.out.println("2. Char-2");
                    System.out.println("3. Char-3");
                    int loadGame = gameJava.nextInt();
                    switch (loadGame) {
                        case 1:
                            System.out.println("permainan akan segera dimulai, mohon tunggu beberapa saat");
                        case 2:
                            System.out.println("permainan akan segera dimulai, mohon tunggu beberapa saat");
                        case 3:
                            System.out.println("permainan akan segera dimulai, mohon tunggu beberapa saat");
                    }
                    break;
                case 3:
                    System.out.println("Anda telah keluar dari the sims, goodbye");
                    break;
                default:
                    System.out.println("Error! pilihan tidak valid");
                    break;

            }
        }
    }
}
