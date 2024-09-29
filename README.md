# Sistem Pengelolaan Jadwal Dokter di Klinik
## Nama: Nazwa Tri Ananda (2309116018)
---

### Latar Belakang Program
Program Sistem Pengelolaan Jadwal Dokter di Klinik dibuat untuk memudahkan pengelolaan jadwal praktik dokter secara efektif dan efisien. Dengan menggunakan program ini, staf klinik dapat dengan mudah melakukan pencatatan, pembaruan, penghapusan, dan peninjauan jadwal dokter yang bertugas. Hal ini akan membantu dalam mengurangi kesalahan penjadwalan, mempercepat proses administrasi, dan memastikan informasi jadwal dokter selalu up-to-date bagi pasien dan pihak klinik.

---
### Penjelasan Program
#### Struktur Paket (Package)
- Model: Berisi kelas Dokter yang merepresentasikan objek dokter dengan atribut dan perilakunya.
- Manajemen: Berisi kelas PengelolaanJadwal yang berfungsi sebagai manajemen utama dari sistem pengelolaan jadwal dokter.

#### Penjelasan Kelas Model (Dokter)
Kelas *Dokter* merepresentasikan data dari seorang dokter. Kelas ini berisi atribut dan metode berikut:

#### *Atribut*

    - nama (String): Menyimpan nama dokter.
    - spesialis (String): Menyimpan spesialisasi dokter.
    - jadwal (String): Menyimpan jadwal praktik dokter.

#### *Constructor*
- Dokter(String nama, String spesialis, String jadwal):
- Constructor yang digunakan untuk membuat objek Dokter dengan nama, spesialis, dan jadwal tertentu.

#### *Metode*
- void tampilkanInfo(): Menampilkan informasi lengkap dokter.
- String getNama(): Mengembalikan nama dokter.
- void setNama(String nama): Mengubah nama dokter.
- String getSpesialis(): Mengembalikan spesialisasi dokter.
- void setSpesialis(String spesialis): Mengubah spesialisasi dokter.
- String getJadwal(): Mengembalikan jadwal dokter.
- void setJadwal(String jadwal): Mengubah jadwal dokter.

#### Penjelasan Kelas Manajemen (Pengelolaan Jadwal)
Kelas *PengelolaanJadwal* berisi logika utama dari program yang mengelola operasi CRUD. Kelas ini berisi menu untuk interaksi dengan pengguna.

#### *Atribut*
- daftarDokter: ArrayList yang menyimpan objek-objek Dokter.
- scanner: Objek Scanner untuk membaca input dari pengguna.

#### *Metode Utama (main)*
public static void main(String[] args): Metode utama yang menjalankan program dan menampilkan menu pengelolaan jadwal dokter.

#### *CRUD Program*
- tambahDokter(): Menambahkan data dokter baru berdasarkan input pengguna.
- tampilkanDokter(): Menampilkan seluruh data dokter yang ada di dalam daftarDokter.
- updateJadwal(): Memperbarui jadwal praktik dokter berdasarkan nama dokter yang diinput oleh pengguna.
- hapusDokter(): Menghapus data dokter berdasarkan nama yang diinput oleh pengguna.
____

### Menu Utama

<img width="367" alt="Tangkapan Layar 2024-09-29 pukul 21 49 46" src="https://github.com/user-attachments/assets/7867e09c-b392-4c5a-bd18-8c3f5804698c">

Program ini berfungsi untuk mengelola data jadwal dokter di sebuah klinik melalui beberapa operasi CRUD (Create, Read, Update, Delete). Berikut adalah penjelasan menu yang tersedia:
- Tambah Dokter: Menu ini memungkinkan Admin untuk menambahkan data dokter baru ke dalam sistem, termasuk informasi seperti nama dokter, spesialisasi, dan jadwal praktik.
- Tampilkan Semua Dokter: Menu ini digunakan untuk menampilkan seluruh data dokter yang sudah terdaftar di sistem beserta jadwal praktiknya. Informasi ini akan membantu Admin klinik untuk memantau daftar dan jadwal dokter.
- Update Jadwal Dokter: Menu ini memberikan fitur untuk mengubah jadwal dokter yang sudah ada. Admin dapat mencari dokter yang ingin diubah jadwalnya dan memperbarui informasi sesuai kebutuhan.
- Hapus Dokter: Fitur ini memungkinkan Admin untuk menghapus data dokter dari sistem. Biasanya digunakan jika dokter tersebut tidak lagi bekerja di klinik atau jadwalnya tidak lagi diperlukan.
- Keluar: Menu ini digunakan untuk keluar dari program dan mengakhiri sesi pengelolaan jadwal dokter.

#### Penjelasan Alur Program
#### *Tambah Dokter*

<img width="360" alt="Tangkapan Layar 2024-09-29 pukul 22 13 12" src="https://github.com/user-attachments/assets/bd5bf785-2e08-4a51-82f6-b640a08c8a99">

- Meminta pengguna untuk memasukkan nama, spesialis, dan jadwal dari dokter baru.
- Membuat objek Dokter dan menambahkannya ke daftarDokter.

#### *Tampilkan Semua Dokter*

<img width="354" alt="Tangkapan Layar 2024-09-29 pukul 22 45 09" src="https://github.com/user-attachments/assets/4d384fb7-52ad-433e-a61d-f4961fb212a4">

- Jika daftarDokter kosong, program akan menampilkan pesan bahwa belum ada dokter yang terdaftar.
- Jika tidak, program akan menampilkan informasi dari setiap dokter yang ada di dalam daftarDokter.

#### *Update Jadwal Dokter*

<img width="571" alt="Tangkapan Layar 2024-09-29 pukul 22 47 13" src="https://github.com/user-attachments/assets/66b50475-7c49-472b-9a0b-2270f7457563">

- Meminta nama dokter yang ingin diperbarui.
- Jika dokter ditemukan, program meminta jadwal baru dan memperbarui jadwal dokter.
- Jika tidak ditemukan, menampilkan pesan bahwa dokter tidak ditemukan.

#### *Hapus Dokter*

<img width="398" alt="Tangkapan Layar 2024-09-29 pukul 23 10 14" src="https://github.com/user-attachments/assets/e79a1fba-5c97-4c6d-b4e0-a2c5121feff7">

- Meminta nama dokter yang ingin dihapus.
- Jika dokter ditemukan, dokter tersebut akan dihapus dari daftarDokter.
- Jika tidak ditemukan, menampilkan pesan bahwa dokter tidak ditemukan.

#### *Keluar*

<img width="358" alt="Tangkapan Layar 2024-09-30 pukul 00 01 37" src="https://github.com/user-attachments/assets/80c4811c-5035-4b2b-a877-926534fb8902">

Mengakhiri program dan menampilkan pesan ucapan terima kasih.
