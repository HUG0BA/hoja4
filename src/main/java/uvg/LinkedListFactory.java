package uvg;

public class LinkedListFactory<T> {
    public UVGList<T> create(String linkeListType){
        switch (linkeListType) {
            case "Single":
                return new SLList<T>();
            
            case "Double":
                return new DLList<T>();    
            default:
                return null;
        }
    }
}
