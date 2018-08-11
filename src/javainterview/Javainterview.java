/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterview;

/**
 *
 * @author Omausom Global Ltd
 */
public class Javainterview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a[] = {1,3, 6,4, 1, 2}; 
        
        smallestIntger(a);
    }
    
    public static void smallestIntger(int a[]){
        
        
        int previous = 0;
        int final_number = 0;
        int next_integer = 0; 
        for(int b = 0; b < a.length; b++){
            
            
            if(previous < a[b]){
                
                final_number = a[b];
            }
            
            previous = final_number;
        }
        
        System.out.print(final_number);
    }
    
}
