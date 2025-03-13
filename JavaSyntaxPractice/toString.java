package JavaSyntaxPractice;

class Animal {

    String name; //类的实例变量name和type
    String type;

    public Animal (String name, String type) {
        this.name = name; //类的构造函数（constructor），用于初始化类的实例变量
        this.type = type;
    }
    public String toString() {  //重写Object类的toString()方法
        return "Name: " + name + ", Type: " + type;
    }
}

public class toString {  //System.out.println(a) 打印的是 Object 类的 toString() 方法的返回值。如果希望输出对象的内容，应该重写 toString() 方法。
    public static void main(String[] args) {
        Animal a = new Animal("Dog", "Mammal"); 
        System.out.println(a);
    }
}

//sout
//main

