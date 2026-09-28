/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package number_1_electronics;

/**
 *
 * @author Student
 */
public class Number_1_Electronics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] cities = {"Cape Town", "Port Elizabeth","Pretoria"};
        String[] consoles ={"PS5","XBOX","SWITCH"};
        
        int[][] sales ={
            {1000,2000,3000},
            {2000,3000,4000},
            {1500,1100,1200}
        };
        
        System.out.println("Gaming console report");
        
      for(int i = 0; i <cities.length; i++){
          System.out.printf("%-18s %-10d %-10d %-10d%n",
                  cities[i],
                  sales[i][0],
                  sales[i][1],
                  sales[i][2]);
                          
      }
        System.out.println();
        
        System.out.println("Console totals for each city");
        
        System.out.println();
        
        int[] cityTotals = new int[cities.length];
        
        for(int i = 0; i<cities.length; i++){
            cityTotals[i] = sales[i][0] + sales[i][1] +  sales[i][2];
            
            System.out.println(cities[i] + " " + cityTotals[i]);
            
            if(cityTotals[i]>highestSales ){
                highestSales = cityTotals[i];
                highestCity = cities[i];
            }

        }
        
        System.out.println();
        System.out.println("City with the most sales " + highestCity);
        System.out.println("Total sales: " + highestSales);
        

        
    }
    
}
