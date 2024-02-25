package uvg;

public class IntegerStackFactory {

    public static UVGStack<Integer> create(String stackType){
        switch (stackType) {
            case "Vector":
                return new VectorStack<Integer>();

            case "ArrayList":
                return new ArrayListStack<Integer>();
        
            default:
                return null;
                
        }
    }

    public static UVGStack<Integer> create(String stackType, String listType){
        switch (stackType) {
            case "List":
                return new LinkedListStack<>(listType);
        
            default:
                return null;
                
        }
    }
}
