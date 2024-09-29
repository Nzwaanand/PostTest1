/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Model;

/**
 *
 * @author mirantibella
 */

public class Dokter {
    private String nama;
    private String spesialis;
    private String jadwal;

    // Constructor
    public Dokter(String nama, String spesialis, String jadwal) {
        this.nama = nama;
        this.spesialis = spesialis;
        this.jadwal = jadwal;
    }

    // Method untuk menampilkan informasi dokter
    public void tampilkanInfo() {
        System.out.println("Nama Dokter: " + nama);
        System.out.println("Spesialis: " + spesialis);
        System.out.println("Jadwal: " + jadwal);
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }

    public String getJadwal() {
        return jadwal;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }
}
