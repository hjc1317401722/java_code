public class HellWorld {
    //  单行注释
    /*
    多行注释
    方法快捷键main回车
    打印快捷键sout回车
    注释添加Ctrl + 或Ctrl -
    */
    /**
     * 文档注释，描述方法的作用
     * @param args 参数说明
     */
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println(10); // 输出一个整数
        System.out.println(5.5); // 输出一个小数
        System.out.println('a'); // 输出一个字符
        System.out.println(true); // 输出boolean值true
        System.out.println("欢迎来到黑马程序员"); // 输出字符串


        //定义变量
        //数据类型 变量名 = 值
        int age = 18;
        System.out.println(age);


        //算数运算符
        System.out.println(1 + 99 + "年黑马"); // 输出：100年黑马
    }
}
/*
Java中的常量分类：
字符串常量：用双引号括起来的多个字符（可以包含0个、一个或多个），例
如"a"、"abc"、"中国"等
整数常量：整数，例如：-10、0、88等
小数常量：小数，例如：-5.5、1.0、88.88等
字符常量：用单引号括起来的一个字符，例如：'a'、'5'、'B'、'中'等
布尔常量：布尔值，表示真假，只有两个值true和false
空常量：一个特殊的值，空值，值为null
除空常量外，其他常量均可使用输出语句直接输出
 */
/*
存储单元
1B（字节） = 8bit
1KB = 1024B
1MB = 1024KB
1GB = 1024MB
1TB = 1024GB
 */
/*
数据类型：基本数据类型和引用数据类型
基本数据类型：数值型和非数值型  数值型：整数（byte,short,int(默认）,long) 浮点数（float,double（默认）)字符（char)
            非数值型：布尔（char)
引用数据类型：类（class)  接口（interface) 数组（[]）
 */


// 变量
/*
变量的定义格式
方法1：数据类型 变量名 = 初始化值; // 声明变量并赋值
int age = 18;
System.out.println(age);

方法2：先声明，后赋值（使用前赋值即可）
数据类型 变量名;
变量名 = 初始化值;
double money;
money = 55.5;
System.out.println(money);

 */



//标识符
/*
标识符是用户编程时使用的名字，用于给类、方法、变量、常量等命名。
Java中标识符的组成规则：
由字母、数字、下划线“_”、美元符号“$”组成
不能以数字开头
不能使用java中的关键字作为标识符
标识符对大小写敏感（区分大小写）
Java中标识符的命名约定：
小驼峰式命名：变量名、方法名
首字母小写，从第二个单词开始每个单词的首字母大写
示例：name、firstName
大驼峰式命名：类名
每个单词的首字母都大写
示例：Student、GoodsClass
提示：标识符的命名最好可以做到见名知意，例如：username、studentNumber等。
 */

//算数运算符
/*
+ 加
- 减
* 乘
/ 乘
% 取余

 */



//赋值运算符
/*
=  赋值
+= 加后赋值
-= 减后赋值
*= 乘后赋值
/= 除后赋值
%= 取余后赋值


 */


//自增自减运算符
/*
++ 自增
-- 自减
 */



//关系运算符  关系运算符有6种关系，分别为等于、不等于、大于、大于等于、小于、小于等于


//逻辑运算符   & 与   |逻辑或   ^逻辑异或   ! 逻辑非
/*
短路逻辑运算符&&  短路与    ||  短路或
注意事项：
逻辑与&，无论左边真假，右边都要执行。
短路与&&，如果左边为真，右边执行；如果左边为假，右边不执行。
逻辑或|，无论左边真假，右边都要执行。
短路或||，如果左边为假，右边执行；如果左边为真，右边不执行
 */



//三元运算符  关系表达式 ? 表达式1 : 表达式2;
/*
计算规则：
首先计算关系表达式的值
如果值为true，表达式1的值就是运算结果
如果值为false，表达式2的值就是运算结果
 */
