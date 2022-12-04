
import java.util.Scanner;

public class Test01Scanner {
    public static void main(String[] args) {
        //定义变量快捷键：alt + 回车
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = sc.next();   //next 获取下一个字符串
        System.out.println(name);
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println(age);
    }
}


