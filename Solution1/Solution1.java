package Task2.Solution1;
class Solution1Demo {
    public String name="Unknown";
    public int age=18;
    Solution1Demo (){
    }
    Solution1Demo (String name, int age){
        this.name=name;
        this.age=age;
    }
    public String print() {
        return "NAME : " + name + "\nAGE  : " + age;
    }
}
public class Solution1 {
    public static void main(String[] args) {
        Solution1Demo s1 = new Solution1Demo ();
        Solution1Demo s2 = new Solution1Demo ("Sam", 36);
        System.out.println(s1.print());
        System.out.println();
        System.out.println(s2.print());
    }
}