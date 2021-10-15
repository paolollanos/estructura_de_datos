package ico.fes.unam.edd1358;

public class LinkedListADT {

    private class Nodo<T> {

        T data;
        Nodo next;

        public Nodo(T valor) {
            this.data = valor;

        }

        public Nodo(T valor, Nodo siguiente) {

            this.data = valor;
            this.next = siguiente;

        }

    }

    private Nodo head;

    public LinkedListADT() {
        this.head = null;
    }

    public boolean isempty() {
        return this.head == null;
    }

    public Nodo gettail() {
        Nodo currnode = this.head;
        
        if(!this.isempty()){
            while (currnode.next != null) {
            currnode = currnode.next;      
            }      
        }
        return currnode;
    }
    
    public void append(Object valor){
    
        if (this.isempty()){
             this.head = new Nodo(valor);
        }else{
            this.gettail().next=new Nodo(valor);
        }
        
    }
    
    public void transversal(){
        Nodo currnode = this.head;
        while (currnode!=null){
            System.out.print(currnode.data + "--->");
            currnode = currnode.next;
        }
        System.out.println(" ");
    }
    
}
