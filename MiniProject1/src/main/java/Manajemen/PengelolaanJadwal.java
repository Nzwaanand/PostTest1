/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manajemen;

import Model.Dokter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mirantibella
 */
public class PengelolaanJadwal {
    private static ArrayList<Dokter> daftarDokter = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\nSistem Pengelolaan Jadwal Dokter di Klinik");
            System.out.println("1. Tambah Dokter");
            System.out.println("2. Tampilkan Semua Dokter");
            System.out.println("3. Update Jadwal Dokter");
            System.out.println("4. Hapus Dokter");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    tambahDokter();
                    break;
                case 2:
                    tampilkanDokter();
                    break;
                case 3:
                    updateJadwal();
                    break;
                case 4:
                    hapusDokter();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);
    }

    // Method untuk menambah data dokter
    private static void tambahDokter() {
        System.out.print("Masukkan nama dokter: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan spesialis dokter: ");
        String spesialis = scanner.nextLine();
        System.out.print("Masukkan jadwal dokter: ");
        String jadwal = scanner.nextLine();

        Dokter dokter = new Dokter(nama, spesialis, jadwal);
        daftarDokter.add(dokter);
        System.out.println("Dokter berhasil ditambahkan.");
    }

    // Method untuk menampilkan semua data dokter
    private static void tampilkanDokter() {
        if (daftarDokter.isEmpty()) {
            System.out.println("Belum ada dokter yang terdaftar.");
        } else {
            System.out.println("\nDaftar Dokter di Klinik:");
            for (Dokter dokter : daftarDokter) {
                dokter.tampilkanInfo();
                System.out.println("-------------------------");
            }
        }
    }

    // Method untuk mengupdate jadwal dokter
    private static void updateJadwal() {
        System.out.print("Masukkan nama dokter yang ingin diupdate jadwalnya: ");
        String nama = scanner.nextLine();
        boolean found = false;

        for (Dokter dokter : daftarDokter) {
            if (dokter.getNama().equalsIgnoreCase(nama)) {
                System.out.print("Masukkan jadwal baru: ");
                String jadwalBaru = scanner.nextLine();
                dokter.setJadwal(jadwalBaru);
                System.out.println("Jadwal dokter berhasil diupdate.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Dokter dengan nama tersebut tidak ditemukan.");
        }
    }

    // Method untuk menghapus data dokter
    private static void hapusDokter() {
        System.out.print("Masukkan nama dokter yang ingin dihapus: ");
        String nama = scanner.nextLine();
        boolean found = false;

        for (Dokter dokter : daftarDokter) {
            if (dokter.getNama().equalsIgnoreCase(nama)) {
                daftarDokter.remove(dokter);
                System.out.println("Dokter berhasil dihapus.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Dokter dengan nama tersebut tidak ditemukan.");
        }
    }
}