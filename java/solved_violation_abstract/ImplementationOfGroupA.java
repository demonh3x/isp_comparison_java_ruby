package solved_violation_abstract;

public class ImplementationOfGroupA implements GroupA {
    @Override
    public void method1UsedInGroupA() {
        System.out.println("Method 1 of group A!");
    }

    @Override
    public void method2UsedInGroupA() {
        System.out.println("Method 2 of group A!");
    }
}
