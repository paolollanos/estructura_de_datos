
package ico.fes.unam.edd1358;


public class Doublelinkedlist {

    private class NodoDoble<T>{
        T data;
        NodoDoble next;
        NodoDoble prev;
        
        public NodoDoble(){
        }
        
        public NodoDoble(T data, NodoDoble next, NodoDoble prev){
            this.data =data;
            this.next = next;
            this.prev = prev;
            
        }

    }
    private NodoDoble head;
    private NodoDoble tail;
    private int size;
    
    public Doublelinkedlist(){
    head = null;
    tail = null;
    this.size = 0;
    }
    
    public boolean isempty(){
        return this.head == null;
    }
    
    public void append(Object valor){
        if(this.tail == null){
            this.tail = new NodoDoble(valor, null, null);
            this.head = this.tail;
        }else{
            this.tail.next = new NodoDoble(valor, null, this.tail);
            this.tail = this.tail.next;
        }
        this.size ++;
    }

    public int getSize() {
        return size;
    }
    
    
    public void transversal(){
        NodoDoble currNode = this.head;
        while(currNode != null){
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("");
    }
    
}
