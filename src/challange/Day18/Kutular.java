package challange.Day18;

import java.util.ArrayList;
import java.util.List;

public class Kutular {

    private List<Kutu> kutuListesi=new ArrayList<>();

    public void kutuEkle(Kutu gelenKutu){
        kutuListesi.add(gelenKutu);
    }
    public int kalanKutuSayisiniAl(){
        return kutuListesi.size();
    }
    public int kutulardakiToplamParaMiktari(){
        int toplamPara=0;
        for(Kutu kutu : kutuListesi){
            toplamPara+=kutu.getParaMiktari();
        }
       return toplamPara;
    }
    public void kendiKutumuKaldir(int kutuNumarasi){
        for(Kutu kutu : kutuListesi){
            if(kutuNumarasi==kutu.getKutuNumarasi()){
                kutuListesi.remove(kutu);
                break;
            }
        }
    }
    public String acilmamisKutulariGoster(){
        String acilmamislar="";
        for(Kutu kutu : kutuListesi){
            acilmamislar+=" "+kutu.getKutuNumarasi();
        }
        return acilmamislar;
    }
    public void kutuActir(int kutuNumarasi){
        for(Kutu kutu : kutuListesi){
            if(kutuNumarasi==kutu.getKutuNumarasi()){
                System.out.println("Kutudaki Para Miktarı :"+kutu.getParaMiktari());
                kutuListesi.remove(kutu);
                break;
            }
        }
    }
    public int teklifAl(){
        return kutulardakiToplamParaMiktari()/4;
    }

}
