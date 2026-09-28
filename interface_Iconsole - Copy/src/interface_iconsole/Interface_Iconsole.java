/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interface_iconsole;

/**
 *
 * @author Student
 */
public class Interface_Iconsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        interface IConsole{
            String getConsoleType();
            String getStore();
            int getTotalSales();
        }
        
        abstruct class Console impliments IConsole{
            
            private String consoleType;
            private String store;
            private int totalSales;
        }
        
        public String getStore(){
            return store;
        }
        
        public String TotalSales{
            return totalSales;
        }
        
        public String getConsoleType(){
            return getConsoleType;
        }
    }
    
}

class ConsoleSales extends Console(){
    
    public ConsoleSales(String consoleType, String store, int totalSales){
        super(consoleType, store,totalSales());
    }
    
    public void printReport(){
        System.out.println("Console type: " + getConsoleType());
        System.out.println("Store name: " +getStore());
        System.out.println("Total Sales: " +getTotalSales());

    }
    
}

public class RunAppliton{
     public static void main(String[] args) {
         ConsoleSales sales = new ConsoleSales("PlayStation5", "GameWorld", 25000);
         
     }
        
}