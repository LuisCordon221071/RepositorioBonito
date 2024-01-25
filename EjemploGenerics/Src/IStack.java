public interface IStack{
    /* Devuelve la cantidad de elementos que posee el stack */
    int count();
    boolean isEmpty();
    void push (int value);
    int pop();
    int peek();
}