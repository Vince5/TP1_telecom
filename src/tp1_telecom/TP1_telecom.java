/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1_telecom;

/**
 *
 * @author Vincent
 */
public class TP1_telecom {

    /**
     * @param args the command line arguments
     */
    
    static int[] tabA = {1,2,3,4,5};
    static int[] tabB = {1,-2,3,-4,5};
    static int[] tabC = {1,3,5,7,9};
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //double[] voltC = calculVA(3);
        double[] fs = calculAV(tabC);
        
        
        for(int i = 0; i < 5; i++){
           System.out.println(fs[i]);
           
        }
        
        
    }
    
    public static double[] calculVA( double v ) {
        double volt[] = new double[5];
        
        
        for(int i = 0; i < 5; i++ ){
            volt[i] = (2 * v)/(Math.PI * tabA[i]);
        }
        
        return volt;
    }
    
    public static double[] calculVB( double v ) {
        double volt[] = new double[5];
        
        
        for(int i = 0; i < 5; i++ ){
            volt[i] = (2 * v)/(Math.PI * tabB[i]);
        }
        
        return volt;
    }
    
    public static double[] calculVC( double v ) {
        double volt[] = new double[5];
        
        for(int i = 0; i < 5; i++ ){
            volt[i] = (4 * v)/(Math.PI * tabC[i]);
        }
        
        return volt;
    }
    
    public static int[] calculF(int tab[]) {
        int f[] = new int[5];
        
        for(int i = 0; i < 5; i++){
            f[i] = tab[i] * 455;
        }
        
        return f;
    }
    
    public static double[] calculAV(int tab[]) {
        int f[] = calculF(tab);
        double av[] = new double[5];
        
        for(int i = 0; i < 5; i++){
            av[i] = 1/Math.sqrt( 1 + (( f[i]/455 )*( f[i]/455 )) );
        }
        
        return av;
    }
}
