public class a3q3 {
    private static String staticString = "I am a static string in the OuterClass.";
    private String nonStaticString = "I am a non-static string in the OuterClass.";

    // Static inner class
    public static class StaticInnerClass {
        public void printStaticString() {
            System.out.println("Printing static string from static inner class: " + staticString);
        }
    }

    // Non-static inner class
    public class NonStaticInnerClass {
        public void printNonStaticString() {
            System.out.println("Printing non-static string from non-static inner class: " + nonStaticString);
        }
    }

    public static void main(String[] args) {
        // Accessing static members using static inner class
        a3q3.StaticInnerClass staticInnerObj = new a3q3.StaticInnerClass();
        staticInnerObj.printStaticString();
        a3q3 outerObj = new a3q3();
        a3q3.NonStaticInnerClass nonStaticInnerObj = outerObj.new NonStaticInnerClass();
        nonStaticInnerObj.printNonStaticString();
    }
}