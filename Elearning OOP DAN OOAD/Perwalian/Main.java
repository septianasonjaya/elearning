public class Main{
    public static void main (String[]args){
       	Keuangan bayar = new Keuangan();
       	Mahasiswa mhs = new Mahasiswa();
       	Akademik akad = new Akademik();
       	Dosen dosen = new Dosen();

       	bayar.cekPembayaran();
        mhs.dataDiri();
       	mhs.perwalian();
       	akad.pemberitahuan();
       	dosen.permohonan();
       	dosen.persetujuan();
        mhs.cetakKrs();

        
    }
}
