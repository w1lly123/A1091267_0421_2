import java.util.Scanner;

public class A1091267_0421_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入日期（YYYY/MM/DD 或 MM/DD/YYYY）：");
        String input = scanner.nextLine();
        String[] parts = input.split("/");
        if (parts.length != 3) {
            System.out.println("輸入格式錯誤！");
            return;
        }
        int year, month, day;
        if (parts[0].length() == 4) {
            year = Integer.parseInt(parts[0]);
            month = Integer.parseInt(parts[1]);
            day = Integer.parseInt(parts[2]);
        } else {
            year = Integer.parseInt(parts[2]);
            month = Integer.parseInt(parts[0]);
            day = Integer.parseInt(parts[1]);
        }
        System.out.printf("您輸入的日期為 %d 年 %d 月 %d 日。\n", year, month, day);
    }
}