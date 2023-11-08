/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompok_PBOL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class Koneksi {

//    public Connection getKoneksi(){
//        
//    }
//    
    public static void main(String[] args) {
        Koneksi koneksi = new Koneksi();
//        koneksi.getConnection();

    }

    public static Connection getConnection() {
        String usr = "hr";
        String pwd = "ditoQuery";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Maaf , driver class tidak ditemukan");
            System.out.println(ex.getMessage());
        }

        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", usr, pwd);
        } catch (SQLException ex) {
            System.out.println("Maaf . koneksi tidak berhasil");
            System.out.println(ex.getMessage());
        }

        if (conn != null) {
            System.out.println("Koneksi BERHASIL ");
        } else {
            System.out.println("Maaf , koneksi ke database gagal");
        }

        return conn;
    }
}
