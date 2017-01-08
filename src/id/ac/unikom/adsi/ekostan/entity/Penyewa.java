/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unikom.adsi.ekostan.entity;

/**
 *
 * @author Zmart D3viL
 */
public class Penyewa {
    private Integer idPenyewa;
    private String namaPenyewa;
    private String jenisKelamin;
    private String alamat;
    private String noTelp;

    public Integer getIdPenyewa() {
        return idPenyewa;
    }

    public void setIdPenyewa(Integer idPenyewa) {
        this.idPenyewa = idPenyewa;
    }

    public String getNamaPenyewa() {
        return namaPenyewa;
    }

    public void setNamaPenyewa(String namaPenyewa) {
        this.namaPenyewa = namaPenyewa;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    
    
}
