# TugasAkhirMaula
Pseudocode: Program Koperasi Simpan Pinjam
1.	Deklarasi Variabel Global:
o	ArrayList untuk menyimpan:
	listNoInduk : Nomor Induk
	listNama : Nama Anggota
	listKoperasi : Jenis Koperasi
	listSimpanan : Jumlah Simpanan
	listBunga : Persentase Bunga
	listNilai : Total Nilai (Simpanan + Bunga)
o	Scanner untuk input data.
2.	Fungsi main:
o	Panggil fungsi tampilkanMenuUtama.
3.	Fungsi tampilkanMenuUtama:
o	Tampilkan menu utama:
	Pilihan: Isi Data, Lihat Laporan, Koreksi Data, Hapus Data, Selesai.
o	Baca input pilihan menu.
o	Panggil fungsi sesuai dengan pilihan:
	1 → isiData
	2 → lihatLaporan
	3 → koreksiData
	4 → hapusData
	5 → Keluar program.
4.	Fungsi isiData:
o	Tampilkan prompt untuk input:
	Nama, Nomor Induk, Jenis Koperasi, Jumlah Simpanan, dan Persentase Bunga.
o	Hitung total nilai: total = simpanan * (1 + bunga/100).
o	Simpan data ke dalam ArrayList.
o	Tanyakan apakah ingin menambahkan data lagi:
	Jika "y" → Panggil isiData.
	Jika "t" → Kembali ke menu utama.
5.	Fungsi lihatLaporan:
o	Set jumlah data per halaman = 3.
o	Loop untuk menampilkan laporan halaman per halaman hingga data selesai:
	Tampilkan data berupa:
	Nomor Induk, Nama, Koperasi, Simpanan, Bunga, Total Nilai.
	Hitung subtotal per halaman.
	Jika halaman terakhir, tampilkan jumlah keseluruhan.
	Tunggu input untuk melanjutkan ke halaman berikutnya.
o	Kembali ke menu utama.
6.	Fungsi koreksiData:
o	Tampilkan prompt untuk input nomor data yang ingin dikoreksi.
o	Validasi input nomor data:
	Jika valid, tampilkan data saat ini.
	Minta input jumlah simpanan baru.
	Hitung kembali total nilai.
	Update data dalam ArrayList.
o	Kembali ke menu utama.
7.	Fungsi hapusData:
o	Tampilkan prompt untuk input nomor data yang ingin dihapus.
o	Validasi input nomor data:
	Jika valid, tampilkan data yang akan dihapus.
	Hapus data dari semua ArrayList.
o	Kembali ke menu utama.
8.	Fungsi Pendukung:
o	Perhitungan total nilai menggunakan formula: total = simpanan * (1 + bunga/100).
9.	Akhir Program:
o	Jika pengguna memilih menu selesai, tampilkan pesan "Terima kasih" dan keluar dari program.
