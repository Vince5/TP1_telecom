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
    
    
    
    public double[] calculV(int FV, double v, int[] tab){
        double volt[] = new double[5];
        for(int i = 0; i < 5; i++ ){
            volt[i] = (FV * v)/(Math.PI * tab[i]);
        }
        
        return volt;
    }
    
    public int[] calculF(int tab[]) {
        int f[] = new int[5];
        
        for(int i = 0; i < 5; i++){
            f[i] = tab[i] * 455;
        }
        
        return f;
    }
    
    public double[] calculAV(int tab[]) {
        int f[] = calculF(tab);
        double av[] = new double[5];
        
        for(int i = 0; i < 5; i++){
            av[i] = 1/Math.sqrt( 1 + (( f[i]/455 )*( f[i]/455 )) );
        }
        
        return av;
    }
    
    public double[] calculFinal(double tabHam[], double tabAV[]){
        double ham[] = new double[5];
        
        for(int i = 0; i < 5; i++){
            ham[i] = tabHam[i]*tabAV[i];
        }
        
        return ham;
    }
    
    public double arrondir(double valeur){
        
        long facteur = (long)Math.pow(10, 2);
        valeur = valeur * facteur;
        long temp = Math.round(valeur);
        
        return (double)temp/facteur;
    }
    
    public boolean verifMesure(double valeur){
        if(valeur < 1 && valeur > -1){
            return false;
        }
        
        return true;
    }
}
