
package ico.fes.listasdoblementesligadas;
import ico.fes.unam.edd1358.Doublelinkedlist;
public class ListasdoblementelgadasADT {
    public static void main(String[] args) {
        Doublelinkedlist ldl = new Doublelinkedlist();
        ldl.append(10);
        ldl.append(20);
        ldl.append(30);
        ldl.transversal();
    
    }   
}