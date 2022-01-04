/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaClass.C.Cemilan_20200140130;

/**
 *
 * @author Abian
 */
public class Compute {
    // Harga Setelah Diskon
    public int getdiskon(int hargaBarang,int jumlah){
        int total = hargaBarang * jumlah;
        int diskon;
        
        if(total < 16000){
            diskon = total - (total * 0);
        }
        else if ((total > 16000) && (total < 25000)){
            diskon = total - (total * 10/100);
        }
        else{
            diskon = total - (total * 15/100);
        }
        return diskon;
    }
    
    // Diskon
    public int getharga(int hargaBarang,int jumlah){
        int total = hargaBarang * jumlah;
        int hasil_diskon;
        
        if(total < 16000){
            hasil_diskon = 0;
        }
        else if ((total > 16000) && (total < 25000)){
            hasil_diskon = 10;
        }
        else{
            hasil_diskon = 15;
        }
        return hasil_diskon;
    }
    
    public int getKembalian(int getBayar,int Compute){
        int kembalian = getBayar-Compute;
        
         int hasil;
        
        if(kembalian < Compute ){
            hasil = getBayar - Compute;
        }
        else{
            hasil = getBayar - Compute;
        }
        return hasil;
    }
    
    public void getData(int getBayar,int Compute){
        
        int kembalian = getBayar - Compute;
        
        String hasil;
        
        if(kembalian < Compute){
            hasil = "Uang anda tidak Cukup : " + kembalian;
        }
        else{
            hasil = "Kembalian : " + kembalian;
        }
    }
}
