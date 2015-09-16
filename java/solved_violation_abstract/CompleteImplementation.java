package solved_violation_abstract;

public class CompleteImplementation implements PublicAPI {
    @Override
    public void method1UsedInGroupA() {
        System.out.println("Method 1 of group A!");
    }

    @Override
    public void method2UsedInGroupA() {
        System.out.println("Method 2 of group A!");
    }

    @Override
    public void method1UsedInGroupB() {
        System.out.println("Method 1 of group B!");
    }

    @Override
    public void method2UsedInGroupB() {
        System.out.println("Method 2 of group B!");
    }
}
