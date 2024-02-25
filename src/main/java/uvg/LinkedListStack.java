package uvg;

public class LinkedListStack<T> implements UVGStack<T> {
    
    private UVGList<T> linkedList;

    public LinkedListStack(String linkedListType){
        LinkedListFactory<T> linkedListFactory = new LinkedListFactory<>();
        linkedList = linkedListFactory.create(linkedListType);
    }

    public void push(T val){
        linkedList.addLast(val);
    }

    public T pop(){
        UVGNode<T> temp = linkedList.getLast();
        linkedList.removeLast();
        return temp.getData();
    }

    public T top(){
        return linkedList.getLast().getData();
    }

    public boolean isEmpty(){
        return linkedList.isEmpty();
    }
}
