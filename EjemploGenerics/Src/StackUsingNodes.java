public class StackUsingNodes implements IStack {

    private int size;
    private Node head;

    public StackUsingNodes(){
        size = 0;
        head = null;
    }

    @Override
    public int count() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void push(int value) {
        Node newNode = new Node(value);

        if (isEmpty()){
            head = newNode;
            size++;
        } else{

        }
    }

    @Override
    public int pop() {

    }

    @Override
    public int peek() {
        
    }

    
}
