public class ConsolaWalk<V> implements IWalk<V>{

    @Override
    public void doWalk(V actualValue) {
        Word palabra = (Word)actualValue;
        System.out.println(palabra.toString());
    }
    
}

