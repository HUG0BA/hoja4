package uvg;

public class DLList<T> implements  UVGList<T> {

    DoubleNode<T> head;
    DoubleNode<T> tail;

    public DLList(){
        this.head = null;
        this.tail = null;
    }

    public void addLast(T value){
        DoubleNode<T>  doubleNode = new DoubleNode<T>(value);

        if(head == null && tail == null){
            this.head = doubleNode;
            this.tail = doubleNode;
        }else{
            tail.setNext(doubleNode);
            doubleNode.setPrev(tail);
            tail = doubleNode;
        }

    }

    public UVGNode<T> getLast(){
        return tail;
    }

    public void removeLast(){
        if(tail != head){

            tail.getPrev().setNext(null);
            tail = tail.getPrev();
        }else{
            tail = null;
            head = null;
        }
    }

    public boolean isEmpty(){
        return head == null;
    }
    

    private class DoubleNode<E> implements UVGNode<T>{
        private T data;
        private DoubleNode<T> prev;
        private DoubleNode<T> next;


        public DoubleNode(T data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }


        public T getData(){
            return data;
        }

        @SuppressWarnings("unused")
        public DoubleNode<T> getNext(){
            return next;
        }

        public void setNext(DoubleNode<T> node){
            this.next = node;
        }

        public DoubleNode<T> getPrev(){
            return prev;
        }

        public void setPrev(DoubleNode<T> node){
            this.prev = node;
        }
    }
}
