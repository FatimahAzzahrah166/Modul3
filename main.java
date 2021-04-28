package ForModul3;

import java. util. Scanner;
class main {
    public static void main(String [] args){
       String ulang;
       
       do{
       dataA data = new dataA();
       System.out.println("");
       System.out.println("========================================");
       System.out.println("|         INPUT DATA MAHASISWA          |");
       System.out.println("========================================");
       Scanner input = new Scanner(System.in);
       System.out.println("Masukan Nim : ");
       data.nim = input.nextLine();
       System.out.println("Masukan Nama : ");
       data.nama = input.nextLine();
       System.out.println("Masukan Alamat : ");
       data.alamat = input.nextLine();
       System.out.println("JURUSAN");
       System.out.println(" 61 - Matematika");
       System.out.println(" 62 - Biologi");
       System.out.println(" 63 - Kimia");
       System.out.println(" 64 - Fisika");
       System.out.println(" 65 - Teknik Informatika");
       System.out.println(" 66 - Sistem Informasi");
       
       Scanner input1=new Scanner (System.in);
       int pilih;
       System.out.println("Masukan kode jurusan : ");
       pilih = input1.nextInt();
       
       if (pilih==61){
           data.jurusan="Matematika";
       }
       else if (pilih == 62){
           data.jurusan="Biologi";
       }
       else if (pilih == 63){
           data.jurusan="Kimia";
       }
       else if (pilih == 64){
           data.jurusan="Fisika";
       }
       else if (pilih == 65){
           data.jurusan="Teknik Informatika";
       }
       else if (pilih == 66){
           data.jurusan="Sistem Informasi";
       }
       else{
           data.jurusan="pilihan tidak ada";
       }
       
    System.out.println("========================================");
    System.out.println("              DATA MAHASISWA            ");
    System.out.println("========================================");
    System.out.println("NIM          : "+data.nim);
    System.out.println("NAMA         : "+data.nama);
    System.out.println("ALANAT       : "+data.alamat);
    System.out.println("JURUSAN      : "+data.jurusan);
    System.out.println("----------------------------------------");
    
    Scanner input2 = new Scanner (System.in);
    System.out.println("Ingin masukan data lagi? y/t ");
    ulang=input2.next();
       }while (ulang.equals("y"));
    System.out.println("------------ program selesai -----------");
    }     
}
