public class Exception2 {
    public static void Exc2() {
        try {
            int[] c = new int[5];
            c[20] = 70;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка индексации вне границ массива: " + e);
        }
    }
}
