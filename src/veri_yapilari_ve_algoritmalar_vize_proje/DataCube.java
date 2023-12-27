
package veri_yapilari_ve_algoritmalar_vize_proje;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author furka
 */
public class DataCube {
    
    private String cubeName;
    private List<TableD> values;

    
    public DataCube(String name) {
        cubeName = name;
        values = new ArrayList<>();
    }

    public void addDimension(String musteri, String urun, String zaman, String fiyat) {
        TableD tableD = new TableD(musteri, urun, zaman, fiyat);
        values.add(tableD);
        
            }
    
        
    public String getValue(String musteri, String urun, String zaman) {
        List<String> fiyatlar = new ArrayList<>();
        for (TableD tableD : values) {
            if(zaman!=null){
                if(tableD.getMusteri().equals(musteri)
                        && tableD.getUrun().equals(urun)
                        && tableD.getZaman().equals(zaman)) {
                    return tableD.getFiyat();

                }
                
            }
            else{
                    
                    if(tableD.getMusteri().equals(musteri) &&
                    tableD.getUrun().equals(urun)){
                        fiyatlar.add(tableD.getFiyat());
                        
                    }

                }
        }
        if(fiyatlar.size() > 0){
            return fiyatlar.toString();    
        }
        
        return null;
    }
       
        public String getValue(String musteri, String urun) {
            for (TableD tableD : values) {
                if(tableD.getMusteri().equals(musteri)
                        && tableD.getUrun().equals(urun)
                        ) {
                return tableD.getUrun();
            }
        }
        return null; 
    }
        public String getValue(String musteri) {
            for (TableD tableD : values) {
                if (tableD.getMusteri().equals(musteri)
                        ){
                return tableD.getMusteri();
            }
        }
        return null;
        }
}
