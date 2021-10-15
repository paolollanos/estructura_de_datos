/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasligadasadt;

//import ico.fes.unam.edd1358.LinkedListADT;

import ico.fes.unam.edd1358.LinkedListADT;

/**
 *
 * @author paolo
 */
public class ListasligadasADT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedListADT lsl = new LinkedListADT();
        lsl.append(new String("Jose"));
        lsl.append(new String("pedro"));
        lsl.append("jueam");
        lsl.append("bellako");
        lsl.transversal();
        
    }
    
}
