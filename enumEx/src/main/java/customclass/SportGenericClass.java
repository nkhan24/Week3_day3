package customclass;

public class SportGenericClass <P,R> {

    public void sportGenerics (P p, R r) {
        System.out.println("The P type is: " + p.getClass());
        System.out.println("THe R type is: " + r.getClass());

    }
}
