public class Test18 {
    //(封装)已知一个类 Student 代码如下：
    //class Student{
    //	String name;
    //	int age;
    //	String address;
    //	String zipCode;
    //	String mobile;
    //}
    //要求：
    //	1、把Student 的属性都作为私有，并提供get/set 方法以及适当的构造方法。
    //	2、为Student 类添加一个getPostAddress 方法，要求返回Student 对象的地址和邮编。
    public static void main(String[] args) {
        Student student = new Student("张三",18,"江西赣州","1000000","123456");
        student.getPostAddress();
    }


}

class  Student{
    private String name;
    private int age;
    private String address;
    private String zipCode;
    private String mobile;

    public Student() {
    }

    public Student(String name, int age, String address, String zipCode, String mobile) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.zipCode = zipCode;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public void getPostAddress() {
        System.out.println(this.getName() + "的地址是：" + this.getAddress());
        System.out.println(this.getName() + "的邮编是：" + this.getZipCode());
    }
}
