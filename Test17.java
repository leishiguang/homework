public class Test17 {
    //定义丈夫类 Husband 和妻子类 Wife，
    //丈夫类的属性包括：身份证号，姓名，出生日期，妻子。
    //妻子类的属性包括：身份证号，姓名，出生日期，丈夫。
    //分别给这两个类提供构造方法（无参数构造方法和有参数构造方法都要提供），
    //编写测试程序，创建丈夫对象，然后再创建妻子对象，丈夫对象关联妻子对象，
    //妻子对象关联丈夫对象，要求能够输出这个“丈夫对象”的妻子的名字，
    //或者能够输出这个“妻子对象”的丈夫的名字。要求能够画出程序执行过程的内存图。
    //并且要求在程序中演示出空指针异常的效果。
    public static void main(String[] args) {
        Husband husband = new Husband(123, "张三","2021.1.1 ");
        Wife wife = new Wife(124,"李四","2021.1.1");
        husband.wife = wife;
        wife.husband = husband;
        System.out.println(husband.name + "的妻子是" + wife.name);
        System.out.println(wife.name + "的丈夫是" + husband.name);
    }
}


class Husband{
    int id;
    String name;
    String birth;
    Wife wife;

    public Husband() {
    }

    public Husband(int id, String name, String birth, Wife wife) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.wife = wife;
    }

    public Husband(int id, String name, String birth) {
        this.id = id;
        this.name = name;
        this.birth = birth;
    }

}




class Wife{
    int id;
    String name;
    String birth;
    Husband husband;

    public Wife() {
    }

    public Wife(int id, String name, String birth) {
        this.id = id;
        this.name = name;
        this.birth = birth;
    }

    public Wife(int id, String name, String birth, Husband husband) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.husband = husband;

    }
}