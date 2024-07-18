public class example1 {
    public static void main(String[] args) {
        person p =new person();
        p.name = " Asit kumar";
        p.hungary();
        p.name();
    }
    
}
class person{
    int weight;
    String name;
    void run(){
        System.out.println("the person are run");
    }
    void hungary(){
        System.out.println("person are hungraery");
    }
    void name (){
        System.out.println(name);
    }
}
class Student extends person{
    int rollnumber;
    String schoolname;
    void schoolname(){
        System.out.println("bbdit");
    }
}