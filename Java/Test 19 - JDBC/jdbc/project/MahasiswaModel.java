/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.project;

import db.DBHelper;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Asid
 */
public class MahasiswaModel {
    private final Connection CONN;

    public MahasiswaModel() {
        this.CONN = DBHelper.getConnection();
    }
    
    public void addMahasiswa(Mahasiswa mhs){
        String insert = "INSERT INTO mhs VALUES ('" + mhs.getNpm() + "', '" + mhs.getNama() + "');";
        
        try {
            CONN.createStatement().execute(insert);
            System.out.println("Berhasil memasukan data!");
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal memasukan data!");
        }
    }
    
    public void updateMahasiswa(Mahasiswa mhs){
        String update = "UPDATE mhs SET nama = '" + mhs.getNama() + "' WHERE mhs.npm = '" + mhs.getNpm() + "';";
        
        try {
            CONN.createStatement().execute(update);
            System.out.println("Berhasil mengupdate data!");
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal mengupdate data!");
        }
    }
    
    public void deleteMahasiswa(Mahasiswa mhs){
        String delete = "DELETE FROM mhs WHERE mhs.npm = '" + mhs.getNpm() + "';";
        
        try {
            CONN.createStatement().execute(delete);
            System.out.println("Berhasil menghapus data!");
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal menghapus data!");
        }
    }
    
    public ArrayList<Mahasiswa> getMahasiswa(){
        String query = "SELECT * FROM mhs";
        ArrayList<Mahasiswa> mhs = new ArrayList<Mahasiswa>();
        
        try {
            ResultSet rs = CONN.createStatement().executeQuery(query);
            while(rs.next()){
                Mahasiswa temp = new Mahasiswa(rs.getString("npm"),rs.getString("nama"));
                mhs.add(temp);
            }
            System.out.println("Berhasil menampilkan data");
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal menampilkan data");
        }
        
        return mhs;
    }
}
