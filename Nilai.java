import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double strukturD,pbo,basisD,algoritma,rpl;


        System.out.print("Masukkan Nilai Struktur Data: ");
        strukturD = sc.nextDouble();
        System.out.print("Masukkan Nilai Pemrograman Beroirentasi Objek: ");
        pbo = sc.nextDouble();
        System.out.print("Masukkan Nilai Basis Data: ");
        basisD = sc.nextDouble();
        System.out.print("Masukkan Nilai Algoritma dan Pemrograman: ");
        algoritma = sc.nextDouble();
        System.out.print("Masukkan Nilai Rekayasa Perangkat: ");
        rpl = sc.nextDouble();


        double rataRata = (strukturD + pbo + basisD + algoritma + rpl) / 5;
        double ipk = (rataRata / 100) * 4;


        String predikat;
        if(ipk >= 3.75){
            predikat = "A (Sangat Baik)";
        }else if(ipk >= 3.50 && ipk <= 3.74){
            predikat = "AB (Baik Sekali)";
        }else if(ipk >= 3.00 && ipk <= 3.49){
            predikat = "B (Baik)";
        }else if(ipk >= 2.50 && ipk <= 2.99){
            predikat = "BC (Cukup)";
        }else{
            predikat = "C (Kurang)";
        }

        System.out.println("\nHasil Nilai\n");
        System.out.println("IPK: " + ipk );
        System.out.println("Predikat: " + predikat);

        if(predikat.equals("A (Sangat Baik)") || predikat.equals("AB (Baik Sekali)")){
            System.out.println("\n Daftar Mata Kuliah Yang Dapat Diajukan Untuk Posisi Asisten: \n");
            System.out.println("1. Struktur Data");
            System.out.println("2. Pemrograman Berorientasi Objek");
            System.out.println("3. Basis Data");
            System.out.println("4. Algoritma dan Pemrograman");
            System.out.println("5. Rekayasa Perangkat Lunak");
        }else{
            System.out.println("Mahasiswa Belum Memenuhi  Syarat");
        }
        
    }
}
