import java.util.Scanner;
class Mahasiswa{
	String npm;
	String nama, dosen;
	String jurusan;
	String mk1, mk2, mk3, mk4, mk5;

	void dataDiri(){
		Scanner input = new Scanner (System.in);

		System.out.println("		 Data Mahasiswa ");
		 System.out.println("********************************************************");
		System.out.println("Masukkan : ");
		System.out.println("-------------");
        System.out.print("NPM : ");
        npm = input.nextLine();
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("Jurusan : ");
        jurusan = input.nextLine();
        System.out.println("********************************************************");
	}

	void perwalian(){
		Scanner input = new Scanner (System.in);

		
		System.out.println("*********** Mata Kuliah yang Diambil ***********");
		System.out.print("Mata Kuliah 1 : ");
        mk1 = input.nextLine();
        System.out.print("Mata Kuliah 2 : ");
        mk2 = input.nextLine();
        System.out.print("Mata Kuliah 3 : ");
        mk3 = input.nextLine();
        System.out.print("Mata Kuliah 4 : ");
        mk4 = input.nextLine();
        System.out.print("Mata Kuliah 5 : ");
        mk5 = input.nextLine();
         System.out.println("********************************************************");
	}


	void permohonan(){
		Scanner input = new Scanner (System.in);

		System.out.println("");
		System.out.print("Nama Dosen Wali : ");
		dosen = input.nextLine();
	}

	void cetakKrs(){

		System.out.println("");
		System.out.println("*********** KRS ***********");
		System.out.println("NPM : " + npm );
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Mata Kuliah yang diambil : ");
        System.out.println("1 : "+ mk1);
        System.out.println("2 : "+ mk2);
        System.out.println("3 : "+mk3);
        System.out.println("4 : "+mk4);
        System.out.println("5 : "+mk5);
	}
}

