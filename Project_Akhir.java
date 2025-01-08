/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_akhir;
import java.util.Scanner;
import java.util.ArrayList;

public class Project_Akhir {


    static ArrayList <String> listNoInduk  = new ArrayList();
    static ArrayList <String> listNama     = new ArrayList<>();
    static ArrayList <String> listKoperasi = new ArrayList<>();
    static ArrayList <Double> listSimpanan = new ArrayList<>();
    static ArrayList <Double> listBunga    = new ArrayList<>();
    static ArrayList <Double> listNilai    = new ArrayList<>();

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        tampilkanMenuUtama();
    }
    
    static void tampilkanMenuUtama() {
        System.out.println("------------------------------------------------------------------------------------------------" );
        System.out.println("                           PROGRAM KOPERASI SIMPAN PINJAM                                       " );
        System.out.println("                       NIM : 24.240.0061 NAMA : M MASRUR MAULANA                                " );
        System.out.println("------------------------------------------------------------------------------------------------" );
        
        System.out.println("========================= KOPERASI SIMPAN PINJAM BHAKTI MANDIRI ================================" );
        System.out.println(" 1. Isikan data ");
        System.out.println(" 2. Melihat Laporan ");
        System.out.println(" 3. Mengedit data ");
        System.out.println(" 4. Mengahapus Data ");
        System.out.println(" 5. Selesai ");
        System.out.print(" Silahkan Dipilih Pada Menu Yang Sudah Ada : ");
        int pilihanMenu = input.nextInt();

        switch (pilihanMenu) {
            case 1:
            isiData();
            break;
            
            case 2:
            lihatLaporan();
            break;
            
            case 3:
            koreksiData();
            break;
            
            case 4:
            hapusData();
            break;
            
            case 5:
            System.out.println(" Terima kasih. Data Sudah Habis.");
            break;
            
            default:
            System.out.println(" Pilihan Tidak Valid. Silakan dipilih kembali." );
            tampilkanMenuUtama();
        }
    }

    static void isiData() {
        System.out.println("");
         //Nama
        System.out.print("Masukkan Nama :\t"); 
        String nama = input.next();
        //No Induk
        System.out.print("Masukkan No Induk :\t"); 
        String noInduk = input.next();
        
        System.out.print("==================================== DAFTAR KOPERASI ====================================\t\n "
                + "\t1. SIMPANAN UMUM RISQONA \n"
                + "\t   Simpanan Umum Syariah dengan pengambilan kapan saja. \n"
                + "\t   Bisa jemput bola dan fasilitas transfer akan Wadiah Yadh Dhamanah Awal Setoran 20 Ribu. \n\n"
                
                + "\t2. SIMPANAN SIMAS - TREN \n"
                + "\t   Simpanan untuk Lembaga Anda dan segala Administrasi yang Anda kelola. \n"
                + "\t   Setoran Awal 100 Ribu. \n\n"
                
                + "\t3. SIMAPAN ( SIMPANAN MASA DEPAN ) \n"
                + "\t   Simpanan untuk rencana masa depan Anda, ivestasi yang akan kemblai kepada Anda beragam manfaatnya. \n" 
                + "\t   Keuangan jadi semakin tertata dan berdaya guna, dan membantu target pencapaian dana. Akad Mudharabah Musytarakah. \n"
                + "\t   Minimal Setoran 150 Ribu / bulan. \n\n"
                
                + "\t4. SIMBAH ( SIMPANAN QURBAN - AQIQOH ) \n"
                + "\t   Simpanan yang bisa diambil 20 hari sebelum hari Qurban atau Aqiqoh. \n"
                + "\t   Bekerja sama dengan Lembaga layanan Qurban atau Aqiqoh. \n\n"
                
                + "\t5. SIMPATI ( Simpanan Wisata Hati ) \n"
                + "\t   Untuk Tujuan WIsata, Ziarah, dan Study Tour. \n"
                + "\t   Bisa secara perorangan atau lembagan. \n\n"
                
                + "\t6. ES LIMA ( Simpanan Wailmah ) \n"
                + "\t   Untuk Persiapan Pernikahan, Khitan, Safar dan Wiladah. \n"
                + "\t   Dapatkan Souvenir Cantik disetiap Pembukaan Rekening Simpanan Haji dan Umroh). \n\n"
                + "Isikan Data [1-6] : ");
        int daftarKoperasi = input.nextInt();
        String koperasi = null;
    
        switch (daftarKoperasi) {
            case 1:
            koperasi = " SIMPANAN UMUM RISQONA              ";
            break;
            
            case 2:
            koperasi = " SIMPANAN SIMAS - TREN              ";
            break;
            
            case 3:
            koperasi = " SIMAPAN ( SIMPANAN MASA DEPAN )    ";
            break;
            
            case 4:
            koperasi = " SIMBAH ( SIMPANAN QURBAN - AQIQOH )";
            break;
            
            case 5:
            koperasi = " SIMPATI ( SIMPANAN WISATA HATI )   ";
            break;
            
            case 6:
            koperasi = " ES LIMA ( SIMPANAN WALIMAH )       ";
            break;
        }
        
        //Simpanan
        System.out.print("Masukkan Jumlah Simpanan : Rp. ");
        double simpanan = input.nextDouble();
        //Bunga
        System.out.print("Masukkan Bunga % : "); 
        double bunga = input.nextDouble();
        
        //Total Nilai
        double total = simpanan * (1 + bunga/100);
        double totalNilai = total;
        
        listNoInduk.add(noInduk);
        listNama.add(nama);
        listKoperasi.add(koperasi);
        listSimpanan.add(simpanan);
        listBunga.add(bunga);
        listNilai.add(total);
      
        System.out.println(" DATA BERHASIL DISIMPAN.");
        System.out.print(" Apakah Anda ingin mengisi data lagi? [y/t] : ");
        String jawab = input.next();
        if ("y".equalsIgnoreCase(jawab)) {
        isiData();
        } else {
        tampilkanMenuUtama();
}
    }
  

    static void lihatLaporan(){
        
        int JUMLAH_DATA_PER_HALAMAN = 3; // Jumlah data perHalaman
        int nomorHalaman = 1;
        int dataDitampilkan = 0;
        
        double totalHargaHalaman1 = 0;
        double totalHargaHalaman2 = 0;// Menambah variabel untuk menyimpan jumlah keseluruhan nilai

        while (nomorHalaman <= 2 && dataDitampilkan < listNoInduk.size()) {
           System.out.println("");
           System.out.println("LAPORAN SIMPANAN KOPERASI - HALAMAN " + nomorHalaman + "");
           System.out.println(" __________________________________________________________________________________________________________________________________");
           System.out.println("| No |    NO INDUK   |      NAMA     |               KOPERASI               |        SIMPANAN      |   BUNGA    |      NILAI      |");
           System.out.println("|    |               |               |                                      |                      |            |                 |");
           System.out.println("|____|_______________|_______________|______________________________________|______________________|____________|_________________|");
           double totalNilai = 0;
        for (int i = 0; i < JUMLAH_DATA_PER_HALAMAN && dataDitampilkan < listNoInduk.size(); i++) {
         
           String noInduk  = listNoInduk.get(dataDitampilkan);
           String nama     = listNama.get(dataDitampilkan);
           String koperasi = listKoperasi.get(dataDitampilkan);
           double simpanan = listSimpanan.get(dataDitampilkan);
           double bunga    = listBunga.get(dataDitampilkan);
           double nilai    = listNilai.get(dataDitampilkan);

           totalNilai += nilai; // Menambahkan Nilai
          
           System.out.printf("| %-2d | %-13s | %-13s | %-20s | %-20.2f | %-10.2f | %-15.2f |\n",
           dataDitampilkan + 1, noInduk, nama, koperasi, simpanan, bunga, nilai);
           dataDitampilkan++;
        }
           System.out.println("|____|_______________|_______________|______________________________________|______________________|____________|_________________|");

       
        if ( nomorHalaman == 1) {
            totalHargaHalaman1 += totalNilai;
           System.out.printf("| %-109s | %-15.2f |\n", "Subtotal Halaman 1", totalNilai);
           System.out.println("|_________________________________________________________________________________________________________________________________|");
           System.out.println("Tekan enter untuk melihat halaman berikutnya...");
           input.nextLine();
           input.nextLine(); // Tekan tombol enter dan akan ke halaman berikutnya
        } else if (nomorHalaman == 2) {
            totalHargaHalaman2 += totalNilai;
            System.out.printf("| %-109s | %-15.2f |\n", "Subtotal Halaman 2", totalNilai);
           System.out.println("|_________________________________________________________________________________________________________________________________|");
           //jumlah keseluruhan
           double jumlahKeseluruhan = totalHargaHalaman1 + totalHargaHalaman2;
           //Tekan enter untuk kembali ke menu utama
           System.out.printf("| %-109s | %-15.2f |\n", "Jumlah Keseluruhan", jumlahKeseluruhan);
           System.out.println("|_________________________________________________________________________________________________________________________________|");

           //Tekan enter untuk kembali ke menu utama
           System.out.println("Anda sudah mencapai halaman terakhir. Tekan enter untuk kembali ke menu utama...");
           input.nextLine(); // tekan tombol enter untuk kembali ke menu utama
        }

           nomorHalaman++;
    }

           tampilkanMenuUtama();
    }
    
    static void koreksiData() {
        System.out.print("Masukkan Nomor Data Yang Akan Dikoreksi\t: ");
        int nomorData = input.nextInt();

        if (nomorData >= 1 && nomorData <= listNoInduk.size()) {
            System.out.println("Data saat ini: Koperasi\t\t: " + listKoperasi.get(nomorData - 1) + "\t\tSimpanan: " + listSimpanan.get(nomorData - 1));
            System.out.print("Masukkan Jumlah Simpanan Baru\t: ");
            double simpananBaru = input.nextDouble();

            // Menghitung kembali nilai dan menyimpan perubahan
            double bunga = listBunga.get(nomorData - 1);
            double total = simpananBaru * (1 + bunga / 100);
            listSimpanan.set(nomorData - 1, simpananBaru);
            listNilai.set(nomorData - 1, total);

            System.out.println("Data berhasil dikoreksi.");
          } else {
            System.out.println("Nomor data tidak valid.");
        }

            tampilkanMenuUtama();
    }

    static void hapusData() {
        System.out.print("Masukkan Nomor Data Yang Akan Dihapus\t: ");
        int nomorData = input.nextInt();

        if (nomorData >= 1 && nomorData <= listNoInduk.size()) {
            System.out.println("Data Yang Dihapus: Koperasi\t\t: " + listKoperasi.get(nomorData - 1) + "\t\tSimpanan: " + listSimpanan.get(nomorData - 1));
            listKoperasi.remove(nomorData - 1);
            listSimpanan.remove(nomorData - 1);
            listBunga.remove(nomorData - 1);
            listNoInduk.remove(nomorData - 1);
            listNama.remove(nomorData - 1);
            listNilai.remove(nomorData - 1);
            System.out.println("Data Berhasil Dihapus.");
        } else {
            System.out.println("Nomor Data Tidak Valid.");
        }

        tampilkanMenuUtama();
    }
}
