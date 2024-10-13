import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4  = sc.nextInt();

        ArrayList<Integer> list  = new ArrayList<Integer>();

        list.add(num);
        list.add(num2);
        list.add(num3-num);
        list.add(num4-num2);

        int min = Collections.min(list);
        System.out.print(min);
    }
}
