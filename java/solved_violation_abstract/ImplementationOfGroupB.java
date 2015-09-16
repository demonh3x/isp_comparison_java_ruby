package solved_violation_abstract;

public class ImplementationOfGroupB implements GroupB {
    @Override
    public void method1UsedInGroupB() {
        System.out.println("Method 1 of group B!");
    }

    @Override
    public void method2UsedInGroupB() {
        System.out.println("Method 2 of group B!");
    }
}
