
public class Main {
    public static void main(String[] args) {
        ComplexNumber obj = new ComplexNumber(5.21, 6.4);
        ComplexNumber obj2 = new ComplexNumber(5.21, 6.66);

        System.out.println(obj.equals(obj2));
        System.out.println("Obj1 = " + obj.hashCode() + "\nObj2 = " + obj2.hashCode());
    }
}
