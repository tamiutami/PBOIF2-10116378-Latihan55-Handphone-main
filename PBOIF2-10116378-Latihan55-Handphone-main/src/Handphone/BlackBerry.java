/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handphone;

/**
 *
 * @author Sri Utami Ningsih
 * Kelas : IF-2 / PBO-IF2
 * Nim   : 10116378
 * Deskripsi : Program ini berisi program yang menampilkan manufaktur dari sebuah handphone
 */
public class BlackBerry extends Handphone{
   private String pinBB;

    public BlackBerry(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }

    public String getPinBB() {
        return pinBB;
    }

    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }
}
