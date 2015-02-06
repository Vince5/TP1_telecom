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
     * @param FV est la valeur de la fréquance
     * @param v est le voltage utiliser pour la frequence
     * @param tab est la liste des coéfficiant des composantes
     * La fonction calculV est utiliser pour calculer les harmoniques sans filtre
     * @return la liste des frequence harmonique sans filtre
     */
    public double[] calculV(int FV, double v, int[] tab){
        double volt[] = new double[5];
        for(int i = 0; i < 5; i++ ){
            volt[i] = (FV * v)/(Math.PI * tab[i]);
        }
        
        return volt;
    }
    /**
    * @param tab est la liste des coéfficiant des composantes
    * La fonction calculF est utiliser pour calculer les valeur de fréquence de coupure
    * @return la liste des frequence de coupure
    */
    public int[] calculF(int tab[]) {
        int f[] = new int[5];
        
        for(int i = 0; i < 5; i++){
            f[i] = tab[i] * 455;
        }
        
        return f;
    }
    /**
    * @param tab est la liste des coéfficiant des composantes
    * La fonctionAV calcul le gain Av pour le filtre.
    * @return la liste des gains par rapport aux coupure.
    */
    public double[] calculAV(int tab[]) {
        int f[] = calculF(tab);
        double av[] = new double[5];
        
        for(int i = 0; i < 5; i++){
            av[i] = 1/Math.sqrt( 1 + (( f[i]/455 )*( f[i]/455 )) );
        }
        
        return av;
    }
    /**
    * @param tabHam est la liste des Harmonie sans le filtre
    * @param tabAV est la liste des gain Av
    * La calculFinal est utiliser pour calculer la fréquence harmonique avec le filtre.
    * @return la liste des fréquence harmonique avec le filtre.
    */    
    
    public double[] calculFinal(double tabHam[], double tabAV[]){
        double ham[] = new double[5];
        
        for(int i = 0; i < 5; i++){
            ham[i] = tabHam[i]*tabAV[i];
        }
        
        return ham;
    }
    /**
    * @param valeur est la valeur a arrondir.
    * La fonction arrondir arrondi la valeur a 2 nombre après la virgule.
    * @return valeur avec 2 chiffre après la virgule.
    */
    public double arrondir(double valeur){
        
        long facteur = (long)Math.pow(10, 2);
        valeur = valeur * facteur;
        long temp = Math.round(valeur);
        
        return (double)temp/facteur;
    }

}
