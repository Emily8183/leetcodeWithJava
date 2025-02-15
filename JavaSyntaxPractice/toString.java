package JavaSyntaxPractice;

class Animal {

    public Animal (String name, String type) {
        this.name = name; //类的构造函数（constructor），用于初始化类的实例变量
        this.type = type;
    }

    String name; //类的实例变量name和type
    String type;

    public String toString() {  //重写Object类的toString()方法
        return "Name: " + name + ", Type: " + type;
    }
}

public class toString {
    public static void main(String[] args) {
        Animal a = new Animal("Dog", "Mammal");
        System.out.println(a);
    }
}