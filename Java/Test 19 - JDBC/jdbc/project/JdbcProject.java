package jdbc.project;

import java.util.ArrayList;

public class JdbcProject {
    
    public static void main(String[] args) {
        // TODO code application logic here
        MahasiswaModel mhs = new MahasiswaModel();
        
        Mahasiswa mhs1 = new Mahasiswa("2117051002","Alex Keren");
        
        mhs.deleteMahasiswa(mhs1);
        
        ArrayList<Mahasiswa> listMahasiswa = mhs.getMahasiswa();
        System.out.println();
        for(int i = 0; i < listMahasiswa.size(); i++){
            System.out.println("Nama: "+listMahasiswa.get(i).getNama());
            System.out.println("NPM: "+listMahasiswa.get(i).getNpm());
            System.out.println();
        }
    }
}
