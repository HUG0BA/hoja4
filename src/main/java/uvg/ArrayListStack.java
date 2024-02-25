package uvg;

import java.util.ArrayList;

public class ArrayListStack<T> implements UVGStack<T> {
        private ArrayList<T> arrayList;

    public ArrayListStack(){
        arrayList = new ArrayList<T>();
    }

    
    /** 
     * @param val
     * @description Añadir elemento al final del vector con su método predeterminado de Vector.add()
     */
    @Override
    public void push(T val) {
        arrayList.add(val);
    }

    
    /** 
     * @return T
     * @description Obtener una copia del valor del últime elemento ingresado con método predeterminado de Vector.lastElement(), eleminar el elemento y devolver la copia
     * 
     */
    @Override
    public T pop() {
        T temp = arrayList.get(arrayList.size() - 1);
        arrayList.remove(arrayList.indexOf(temp));
        return temp;
        
    }

    
    /** 
     * @return T
     * @description Devolver el valor del último elemeto ingresado sin eliminarlo
     */
    @Override
    public T top() {
        return arrayList.get(arrayList.size() - 1);

    }

    
    /** 
     * @return boolean
     * @description Devolver true si el vector esta vacio y false de lo contrario con método predeterminado Vector.isEmpty()
     */
    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }
}
