/**
 * Martin MacDonald
 * 08/05/24
 */
public class TestMyStack {
    public void test() throws Exception {
        MyLinkedStack aStack = new MyLinkedStack( );

        System.out.println("testing Stack");

        System.out.println("testing is empty " + aStack.isEmpty( ));

        for(int i = 1; i < 6; i++)

            aStack.push(i);

        System.out.println("num values in stack: " +aStack.size( ) );

        aStack.display( );

        System.out.println("popping value " + aStack.pop( ));

        System.out.println("value 5 should have been removed");

        aStack.display();

    }

}
