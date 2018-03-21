


public class NoClassDefFoundErrorDemo {
    public static void main(String[] args) {
        try {
            // The following line would throw ExceptionInInitializerError
            SimpleCalculator calculator1 = new SimpleCalculator();
        } catch (Throwable t) {
            System.out.println(t);
        }
        
        try {
        // The following line would cause NoClassDefFoundError
        SimpleCalculator calculator2 = new SimpleCalculator();
        } catch (Throwable t) {
            System.out.println(t);
        }
    }

}