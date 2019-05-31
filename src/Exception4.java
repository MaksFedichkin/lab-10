import java.util.Date;

public class Exception4{
    static class MyException extends Exception{
        private  int  id;
        Date time = new Date();
        MyException(int а) {
            id = а;
        }
        public String toString(){
            return "MyException ["+ id + "] "+ time;
        }
    }
    public static void my_exc(int a) throws MyException {
        System.out.println("Вызван метод my_exc (" + a + ")");
        if (a >= 5)
            throw new MyException(a);
        System.out.println("Нормально");
    }
}
