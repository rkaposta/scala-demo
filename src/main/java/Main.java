/**
 * Created by Rob on 2017. 05. 16..
 */
public class Main {

    static class IntSet {
        public String type() { return "int set" ; }
    }
    static class NonEmptyIntSet extends IntSet {
        public String type() { return "non-empty int set" ; }
    }


    public static void main(String[] args) {

        NonEmptyIntSet[] nonEmptyArr = { new NonEmptyIntSet() };
        IntSet[] intSetArr = nonEmptyArr;
        intSetArr[0] = new IntSet();
        NonEmptyIntSet set = nonEmptyArr[0];

        System.out.println(set.type());
    }

}
