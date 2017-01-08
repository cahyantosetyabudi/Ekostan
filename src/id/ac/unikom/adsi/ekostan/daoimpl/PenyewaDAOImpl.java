/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unikom.adsi.ekostan.daoimpl;

import id.ac.unikom.adsi.ekostan.dao.PenyewaDAO;
import id.ac.unikom.adsi.ekostan.entity.Penyewa;
import id.ac.unikom.adsi.ekostan.utility.DatabaseConnectivity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zmart D3viL
 */
public class PenyewaDAOImpl implements PenyewaDAO {
    
    private final Connection conn;

    public PenyewaDAOImpl() {
        conn = DatabaseConnectivity.getConnection();
    }

    @Override
    public ArrayList<Penyewa> getPenyewa() {
        return getPenyewa(null);
    }

    @Override
    public ArrayList<Penyewa> getPenyewa(String namaPenyewa) {
        ArrayList<Penyewa> arrayPenyewa = null;
        PreparedStatement state = null;
        
        boolean isSearching = namaPenyewa != null && !namaPenyewa.isEmpty();
        String SELECT;
        if (isSearching) {
            SELECT = "SELECT * FROM penyewa WHERE nama_penyewa LIKE ?";
        } else {
            SELECT = "SELECT * FROM penyewa";
        }
        
        try {
            state = conn.prepareStatement(SELECT);
            if (isSearching) {
                state.setString(1, namaPenyewa + "%");
            }
            
            ResultSet result = state.executeQuery();
            if (result != null) {
                arrayPenyewa = new ArrayList<>();
                
                while (result.next()) {
                    Penyewa penyewa = new Penyewa();
                    penyewa.setIdPenyewa(result.getInt(1));
                    penyewa.setNamaPenyewa(result.getString(2));
                    penyewa.setJenisKelamin(result.getString(3));
                    penyewa.setAlamat(result.getString(4));
                    penyewa.setNoTelp(result.getString(5));
                    
                    arrayPenyewa.add(penyewa);
                }
            }
            
            result.close();
        } catch (SQLException ex) {
            Logger.getLogger(PenyewaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) {
                try {
                    state.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PenyewaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        return arrayPenyewa;
    }
    
}
