/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pencatat_utang;
import Helper.koneksiDB;
import view.login;

/**
 *
 * @author Victus 16
 */
public class Pencatat_utang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        koneksiDB.getConnection();
        
        login loginframe = new login();
        loginframe.setVisible(true);
        loginframe.pack();
        loginframe.setLocationRelativeTo(null);
    }
    
}
