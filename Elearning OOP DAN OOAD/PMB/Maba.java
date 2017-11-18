import java.util.Scanner;
class Maba{
    int noreg;
    String nama;
    String email;
    String no_hp;
    String jurusan;

    public void scan(){
        Scanner input = new Scanner (System.in);
        System.out.println("------------Masukkan Data------------");
        System.out.print("No Registrasi : ");
        noreg = input.nextInt();
    }

    void registrasi(){
        Scanner input = new Scanner (System.in);

        System.out.println("********************************************************");
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("Email : ");
        email = input.nextLine();
        System.out.print("No Hp : ");
        no_hp = input.nextLine();
        System.out.print("Jurusan : ");
        jurusan = input.nextLine();
        System.out.println("********************************************************");
            }

}