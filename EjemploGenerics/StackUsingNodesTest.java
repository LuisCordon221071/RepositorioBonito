import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StackUsingNodesTest {
    @Test
    public void testCount() {
        StackUsingNodes<Integer> miStack = new StackUsingNodes();
        assertEquals(0, miStack.count());
        miStack.push(30);
        assertEquals(1, miStack.count());
        miStack.pop();
        assertEquals(0, miStack.count());
    }

    @Test
    public void testIsEmpty() {
        StackUsingNodes miStack = new StackUsingNodes();
        assertEquals(true, miStack.count());
        miStack.push(30);
        assertEquals(false, miStack.count());
        miStack.pop();
        assertEquals(true, miStack.count());
    }

    @Test
    public void testPeek() {
        StackUsingNodes<Integer> miStack = new StackUsingNodes();
        miStack.push(30);
        assertEquals(30, miStack.pop());
        miStack.push(35);
        miStack.push(50);
        assertEquals(50, miStack.pop());
        assertEquals(35, miStack.pop());
    }

    @Test
    public void testPop() {

    }

    @Test
    public void testPush() {

    }
}
