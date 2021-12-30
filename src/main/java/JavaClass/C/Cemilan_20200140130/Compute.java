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
}
