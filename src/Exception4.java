import java.util.Date;

public class Exception4{
    static class MyException extends Exception{
        private  int  id;
        Date time = new Date();
        MyException(int �) {
            id = �;
        }
        public String toString(){
            return "MyException ["+ id + "] "+ time;
        }
    }
    public static void my_exc(int a) throws MyException {
        System.out.println("������ ����� my_exc (" + a + ")");
        if (a >= 5)
            throw new MyException(a);
        System.out.println("���������");
    }
}
