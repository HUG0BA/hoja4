package uvg;

public class SLList<T> implements UVGList<T> {

    public SingleNode<T> head;

    public SLList(){
        this.head = null;
    }

    public void addLast(T value){
        SingleNode<T>  singleNode = new SingleNode<T>(value);
        if(head == null){
            this.head = singleNode;
        }else{
            SingleNode<T> curr = head;
            while(curr.getNext() != null){
                curr = curr.getNext();
            }
            curr.setNext(singleNode);
        }

    }

    public void removeLast(){
        SingleNode<T> prev = null;
        SingleNode<T> curr = head;

        while(curr.getNext() != null){
            prev = curr;
            curr = curr.getNext();
        }
        if(prev == null){
            head = null;
        }else{
            prev.setNext(null);
        }
        

    }

    public UVGNode<T> getLast(){
        SingleNode<T> curr = head;

        while(curr.getNext() != null){
            curr = curr.getNext();
        }
        return curr;

    }

    public boolean isEmpty(){
        return head == null;
    }


    

    private class SingleNode<E> implements UVGNode<T>{
        private T data;
        private SingleNode<T> next;

        public SingleNode(T data){
            this.data = data;
            this.next = null;
        }


        public T getData(){
            return data;
        }

        public SingleNode<T> getNext(){
            return next;
        }

        public void setNext(SingleNode<T> node){
            this.next = node;
        }
    }
}
