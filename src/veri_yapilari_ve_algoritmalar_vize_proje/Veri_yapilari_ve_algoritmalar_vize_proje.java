
package veri_yapilari_ve_algoritmalar_vize_proje;


/**
 *
 * @author furka
 */
public class Veri_yapilari_ve_algoritmalar_vize_proje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        DataCube dataCube = new DataCube("Müşteri-Ürün-Zaman");
       
        dataCube.addDimension("Ayşe", "Laptop", "2022", "30000");
        dataCube.addDimension("Mehmet", "Telefon", "2022", "8000");
        dataCube.addDimension("Hasan", "Araba", "2023", "500000");
        dataCube.addDimension("Hasan", "Araba", "2022", "4000000");
        dataCube.addDimension("Hasan", "Araba", "2022", "7000000");
        
       
        
        System.out.println(dataCube.getValue("Ayşe", "Laptop", "2022"));
        System.out.println(dataCube.getValue("Mehmet", "Telefon", "2022"));
        System.out.println(dataCube.getValue("Ali", "Telefon", "2021"));
        System.out.println(dataCube.getValue("Ayşe", "Laptop"));
        System.out.println(dataCube.getValue("Ayşe"));
        System.out.println(dataCube.getValue("Hasan", "Araba", null)); 
        
        
            
        }
    }

