import java.util.ArrayList;

public class SaveIn<V> implements IWalk<V>{

    private ArrayList<V> listado;

    public SaveIn(){
        listado = new ArrayList<V>();
    }

    @Override
    public void doWalk(V actualValue) {
       listado.add(actualValue);
    }

    public ArrayList<V> getListado() {
        return listado;
    }

}