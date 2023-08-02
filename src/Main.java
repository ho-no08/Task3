import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "田中");
        studentMap.put(2, "斉藤");
        studentMap.put(3, "渡辺");

        System.out.print("生徒IDを入力してください>>");
        int id = new Scanner(System.in).nextInt();

        String result;
        result = studentMap.get(id);

        try {
            if(result != null){
                System.out.println("名前：" + result);
            } else {
                throw new ArrayIndexOutOfBoundsException();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("こちらの生徒IDは存在しません");
        } finally {
            System.out.println("検索を終了します");
        }
    }

}

