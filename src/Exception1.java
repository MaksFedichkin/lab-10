public class Exception1 {
    public static void Exc1() {
        try {
            int a = 0;
            int b = 36 / a;
        }catch (ArithmeticException e){
            System.out.println("Деление на нуль: "+e);
        }
    }
}
