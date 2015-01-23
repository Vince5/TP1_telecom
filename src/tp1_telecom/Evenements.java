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
public class Evenements {
    
    private int[] tabA = {1,2,3,4,5};
    private int[] tabB = {1,-2,3,-4,5};
    private int[] tabC = {1,3,5,7,9};
    
    
    
    Evenements(int v, int formule, boolean graphChoisi) {
        
        TP1_telecom tel = new TP1_telecom();
        double [] tabH = new double[5]; 
        double [] tabAV = new double[5];
        double [] tabFinal = new double[5];
        
        switch(formule){
            case 0:
                tabH = tel.calculV(2, v, tabA);
                tabAV = tel.calculAV(tabA);
                tabFinal = tel.calculFinal(tabH, tabAV);
                
                if(graphChoisi){
                    for(int i = 0; i < 5; i++ ){
                    
                        tabH[i] = tel.arrondir(tabH[i]);
                    }
                    
                    for(int i=0; i<5; i++){
                      if(!tel.verifMesure(tabH[i])){
                          System.out.print(tabH[i]*1000 + " mVpk ");
                      }else{
                          System.out.print(tabH[i] + " Vpk ");
                      }

                    }
                }else{
                    for(int i = 0; i < 5; i++ ){
                    
                        tabFinal[i] = tel.arrondir(tabFinal[i]);
                    }
                    
                    for(int i=0; i<5; i++){
                      if(!tel.verifMesure(tabFinal[i])){
                          System.out.print(tabFinal[i]*1000 + " mVpk ");
                      }else{
                          System.out.print(tabFinal[i] + " Vpk ");
                      }

                    }  
                }
                
                
                break;
            case 1:
                tabH = tel.calculV(2, v, tabB);
                tabAV = tel.calculAV(tabB);
                tabFinal = tel.calculFinal(tabH, tabAV);
                
                if(graphChoisi){
                    for(int i = 0; i < 5; i++ ){
                    
                        tabH[i] = tel.arrondir(tabH[i]);
                    }
                    
                    for(int i=0; i<5; i++){
                      if(!tel.verifMesure(tabH[i])){
                          System.out.print(tabH[i]*1000 + " mVpk ");
                      }else{
                          System.out.print(tabH[i] + " Vpk ");
                      }

                    }
                }else{
                    for(int i = 0; i < 5; i++ ){
                    
                        tabFinal[i] = tel.arrondir(tabFinal[i]);
                    }
                    
                    for(int i=0; i<5; i++){
                      if(!tel.verifMesure(tabFinal[i])){
                          System.out.print(tabFinal[i]*1000 + " mVpk ");
                      }else{
                          System.out.print(tabFinal[i] + " Vpk ");
                      }

                    }  
                }
                
                break;
            case 2:
                tabH = tel.calculV(4, v, tabC);
                tabAV = tel.calculAV(tabC);
                tabFinal = tel.calculFinal(tabH, tabAV);
                
                if(graphChoisi){
                    for(int i = 0; i < 5; i++ ){
                    
                        tabH[i] = tel.arrondir(tabH[i]);
                    }
                    
                    for(int i=0; i<5; i++){
                      if(!tel.verifMesure(tabH[i])){
                          System.out.print(tabH[i]*1000 + " mVpk ");
                      }else{
                          System.out.print(tabH[i] + " Vpk ");
                      }

                    }
                }else{
                    for(int i = 0; i < 5; i++ ){
                    
                        tabFinal[i] = tel.arrondir(tabFinal[i]);
                    }
                    
                    for(int i=0; i<5; i++){
                      if(!tel.verifMesure(tabFinal[i])){
                          System.out.print(tabFinal[i]*1000 + " mVpk ");
                      }else{
                          System.out.print(tabFinal[i] + " Vpk ");
                      }

                    }  
                }
                
                break;
        }
    }
    
}
