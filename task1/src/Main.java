import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static void main(String[] args) {
        int[] array = {5, 13, 19, 23, 54};
        System.out.println("Массив:" + Arrays.toString(array));
        System.out.println("Введите 1(добавить элемент) или 2(удалить элемент)");
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        if (a == 1) {
            System.out.println("Введите число");
            int b;
            b = in.nextInt();
            int[] newArray = Arrays.copyOf(array, array.length + 1);
            newArray[newArray.length-1] = b;
            array = newArray;
            System.out.println(Arrays.toString(array));
        }
        if (a == 2){
            System.out.println("Введите индекс элемента:");
            int index;
            index = in.nextInt();
            if (index < 0 || index >= array.length){
                System.out.println("Индекс выходит за границы массива");
            } return;

        }
    }
}
