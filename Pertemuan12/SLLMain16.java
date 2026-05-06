package Pertemuan12;

import java.util.Scanner;

public class SLLMain16 {
    public static void main(String[] args) {
        SingleLinkedList16 sll = new SingleLinkedList16();
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Mahasiswa: ");
        int jumlahMhs = sc.nextInt();
        sc.nextLine();
        Mahasiswa16[] mhs = new Mahasiswa16[jumlahMhs];

        System.out.println("=== INPUT DATA MAHASISWA ===");

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("\nData Mahasiswa " + (i + 1) + ": ");
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            mhs[i] = new Mahasiswa16(nim, nama, kelas, ipk);
        }

        System.out.println("\n=== Hasil Linked List ===");
        sll.print();

        for (int i = 0; i < jumlahMhs; i++) {
            sll.addLast(mhs[i]);
            sll.print();
        }

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();

        sll.removeAt(0);
        sll.print();
    }
}
