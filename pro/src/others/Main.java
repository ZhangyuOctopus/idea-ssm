package others;
public class Main {
    public static void main(String[] args) {
        /*正则表达式匹配任意多个字符*/
        /*在学习SSM框架的时候自定义转换器的时候出现了日期转换*/
        System.out.println("zhangyu".matches(".+"));
        String str = "2018/02/02";
        System.out.println(str.matches("^[0-9]{4}/[0-9]{2}/[0-9]{2}$"));
        String str2 = "2018/02/02";
        System.out.println(str2.matches(".+/.+/.+"));
        String str3 = "2018/";
        System.out.println(str3.matches("^[0-9]{4}/"));
    }
}
