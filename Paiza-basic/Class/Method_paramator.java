import java.util.ArrayList;

public class Method_paramator {
    public static void main(String... args) {
        UmaClass o1 = new UmaClass();

        //実引数
        o1.printDoubleValue(10.5);

        int i = o1.doubleValue(3, 5);
        System.out.println(i);

        ArrayList<String> list = new ArrayList<>();
        o1.addString(list);
        System.out.println(list);

        int i2 = 0;
        o1.addInt(i2);
        System.out.println(i2);
   }
}

class UmaClass {
    void printDoubleValue(double i) {
        System.out.println(i);
    }

    int doubleValue(int i1, int i2) {
        return i1 * i2;
    }

    void addString(ArrayList<String> l) {
        l.add("add");
    }

    void addInt(int i) {
        i++;
    }
}  