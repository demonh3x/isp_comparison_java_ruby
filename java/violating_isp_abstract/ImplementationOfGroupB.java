package violating_isp_abstract;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ImplementationOfGroupB implements PublicAPI {
    @Override
    public void method1UsedInGroupA() {
        throw new NotImplementedException();
    }

    @Override
    public void method2UsedInGroupA() {
        throw new NotImplementedException();
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
