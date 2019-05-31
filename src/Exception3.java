public class Exception3 {
    public static void Exc3 (int a) throws ArithmeticException, ArrayIndexOutOfBoundsException{
        if(a >= 0 && a < 10)
            throw new ArithmeticException("Исключение №1: " + "["+a+"]");
        if(a >= 10 && a < 15)
            throw new ArrayIndexOutOfBoundsException("Исключение №2: " + "["+a+"]");
    }
}
