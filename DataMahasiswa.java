package ForModul3;

public class DataMahasiswa {
    public String nim;
    public String nama;
    public String alamat;

    public DataMahasiswa(String nim,String nama, String alamat) {
        this.nim=nim;
        this.nama=nama;
        this.alamat=alamat;
    }
    DataMahasiswa(){   
    }
}
class dataA extends DataMahasiswa{
    public String jurusan;
    public dataA(String jurusan,String nim,String nama,String alamat){
        super (nim,nama,alamat);
        this.jurusan=jurusan;
    }
    dataA(){  
    }
}
