public class Exception3 {
    public static void Exc3 (int a) throws ArithmeticException, ArrayIndexOutOfBoundsException{
        if(a >= 0 && a < 10)
            throw new ArithmeticException("���������� �1: " + "["+a+"]");
        if(a >= 10 && a < 15)
            throw new ArrayIndexOutOfBoundsException("���������� �2: " + "["+a+"]");
    }
}
