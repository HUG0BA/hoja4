package uvg;

import java.util.Vector;

public class VectorStack<T> implements UVGStack<T> {

    private Vector<T> vector;

    public VectorStack(){
        vector = new Vector<T>();
    }

    
    /** 
     * @param val
     * @description Añadir elemento al final del vector con su método predeterminado de Vector.add()
     */
    @Override
    public void push(T val) {
        vector.add(val);
    }

    
    /** 
     * @return T
     * @description Obtener una copia del valor del últime elemento ingresado con método predeterminado de Vector.lastElement(), eleminar el elemento y devolver la copia
     * 
     */
    @Override
    public T pop() {
        T temp = vector.lastElement();
        vector.remove(vector.indexOf(temp));
        return temp;
        
    }

    
    /** 
     * @return T
     * @description Devolver el valor del último elemeto ingresado sin eliminarlo
     */
    @Override
    public T top() {
        return vector.lastElement();

    }

    
    /** 
     * @return boolean
     * @description Devolver true si el vector esta vacio y false de lo contrario con método predeterminado Vector.isEmpty()
     */
    @Override
    public boolean isEmpty() {
        return vector.isEmpty();
    }
}
