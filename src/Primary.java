public class Primary {
    int number = 234;
    String name = "able to have childs";

    class InnerPrimary{
        public void myMethod(){
            System.out.println("Inner class of Primary class "+number);
        }
    }

    static class InnerStatic{
        int x = 8;
    }
}

