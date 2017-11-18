public class Main{
    public static void main (String[]args){
       	Maba maba = new Maba();
        Akademik akad = new Akademik();
        Keuangan uang = new Keuangan();

        maba.scan();
		akad.registrasi();
        akad.cekRegistrasi();
        uang.cekKeuangan();       

        System.out.println("NPM : "+maba.noreg);
        System.out.println("Nama : "+akad.nama);
        System.out.println("Jurusan : "+akad.jurusan);


    }
}