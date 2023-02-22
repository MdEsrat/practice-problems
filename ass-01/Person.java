public class Person {
    String name;
    int age;
    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "Tanjid";
        p1.age = 22;
        p2.name = "Sefat";
        p2.age = 21;
        System.out.println("First person name is:"+p1.name);
        System.out.println("First person age is:"+p1.age);
        System.out.println("Second person name is:"+p2.name);
        System.out.println("Second person age is:"+p2.age);


    }
}
