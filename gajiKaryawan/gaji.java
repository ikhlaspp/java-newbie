import java.util.Scanner;

public class gaji {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int gajiPokok = 4000000;
            int gajiTotal;
            System.out.println("Ketik 1 jika anda belum menikah");
            System.out.println("Ketik 2 jika anda sudah menikah");
            int statusNikah = input.nextInt();
            if (statusNikah == 1) {
                System.out.println("Gaji anda adalah Rp" + gajiPokok);
            } else if (statusNikah == 2) {
                System.out.println("Masukkan jumlah anak anda, jika tidak mempunyai anak silahkan ketik 0");
                int anak = input.nextInt();
                if (anak == 0) {
                    gajiTotal = gajiPokok + 500000;
                    System.out.println("Gaji pokok anda adalah Rp" + gajiPokok);
                    System.out.println("Anda mendapat tunjungan sebesar Rp500000");
                    System.out.println("Maka gaji anda adalah Rp" + gajiTotal);
                } else if (anak == 1) {
                    gajiTotal = gajiPokok + 1000000;
                    System.out.println("Gaji pokok anda adalah Rp" + gajiPokok);
                    System.out.println("Anda mendapat tunjungan sebesar Rp1000000");
                    System.out.println("Maka gaji anda adalah Rp" + gajiTotal);
                } else if (anak == 2) {
                    gajiTotal = gajiPokok + 1500000;
                    System.out.println("Gaji pokok anda adalah Rp" + gajiPokok);
                    System.out.println("Anda mendapat tunjungan sebesar Rp1500000");
                    System.out.println("Maka gaji anda adalah Rp" + gajiTotal);
                } else {
                    gajiTotal = gajiPokok + 3000000;
                    System.out.println("Gaji pokok anda adalah Rp" + gajiPokok);
                    System.out.println("Anda mendapat tunjungan sebesar Rp3000000");
                    System.out.println("Maka gaji anda adalah Rp" + gajiTotal);
                }
            } else {
                System.out.println("Inputan anda salah");
            }
        }
    }
}
