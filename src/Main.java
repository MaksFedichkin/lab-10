public class Main {
    public static void main (String[] args) {
        Exception1.Exc1();
        Exception2.Exc2();
        try {
            Exception3.Exc3(11);
        } catch (ArithmeticException e) {
            System.out.println("Исключение: " + e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Исключение: " + e);
        }
        try {
            Exception4.my_exc(2);
            Exception4.my_exc(7);
        }catch (Exception4.MyException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
    }
}
