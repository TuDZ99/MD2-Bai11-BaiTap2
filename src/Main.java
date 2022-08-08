import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String input = scanner.nextLine();
        String[] arr = input.toLowerCase().split(" ");
        for (int i = 0; i < arr.length;i++){
            if (treeMap.containsKey(arr[i])) {
                int value = Integer.parseInt(treeMap.get(arr[i]));
                treeMap.remove(arr[i]);
                treeMap.put(value +1, arr[i]);
            } else {
                treeMap.put(1, arr[i]);
            }
        }
        System.out.println("so lan xuat hien trong chuoi la: "+treeMap);
    }
}