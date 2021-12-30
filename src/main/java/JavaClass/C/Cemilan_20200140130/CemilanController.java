/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaClass.C.Cemilan_20200140130;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Abian
 */
@Controller
public class CemilanController {
    
    Compute Proses = new Compute();
    
    @RequestMapping("/input")
//    
    public String getHasil(HttpServletRequest data, Model model){
        
        
        String getNama = data.getParameter("namaSayuran");
        int getHarga = Integer.parseInt(data.getParameter("hargaBarangPerKilo"));
        int getJumlah = Integer.parseInt(data.getParameter("jumlahBarang"));
        int getBayar = Integer.parseInt(data.getParameter("bayar"));
        
        int compute = Proses.getdiskon(getHarga, getJumlah);
        int diskon = Proses.getharga(getHarga, getJumlah);
        
        model.addAttribute("name", getNama);
        model.addAttribute("harga", ("Rp "+ getHarga));
        model.addAttribute("item", getJumlah);
        model.addAttribute("total", ("Rp "+(getHarga*getJumlah)));
        model.addAttribute("diskon", "Rp "+compute);
        model.addAttribute("bayar", "Rp "+getBayar);
        model.addAttribute("kembalian", "Rp "+(getBayar-compute));
        model.addAttribute("hsldiskon", diskon + " %");
        
        
        return "view";
    }
}
