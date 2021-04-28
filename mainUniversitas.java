package ForModul3;

public class mainUniversitas {
   public static void main (String[] args){
        
        System.out.println("------------------------------------------------");
        System.out.println("      Daftar Sebagian Nama PTN Di Indonesia     ");
        System.out.println("------------------------------------------------");
        
        Universitas utm = new Universitas();
        utm.setnama("(Universitas Trunojoyo Madura)");
        System.out.println(" UTM " + utm.getnama());
       
        Universitas ugm = new Universitas();
        ugm.setnama("(Universitas Gajah Mada)");
        System.out.println(" UGM " + ugm.getnama());
        
        Universitas uny = new Universitas();
        uny.setnama("(Universitas Negeri Yogyakarta)");
        System.out.println(" UNY " + uny.getnama());
        
        Universitas insa = new Universitas();
        insa.setnama("(Universitas Islam Negeri Surabaya)");
        System.out.println(" UINSA " + insa.getnama());
        
        Universitas unj = new Universitas();
        unj.setnama("(Universitas Negeri Jakarta)");
        System.out.println(" UNJ " + unj.getnama());
        
        Universitas air = new Universitas();
        air.setnama("(Universitas Negeri Airlangga)");
        System.out.println(" AIR " + air.getnama());
        
        Universitas upnj = new Universitas();
        upnj.setnama("(UPN Veteran Jakarta)");
        System.out.println(" UPNJKT " + upnj.getnama());
   }
} 