package violating_isp_abstract;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ImplementationOfGroupA implements PublicAPI {
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
        throw new NotImplementedException();
    }

    @Override
    public void method2UsedInGroupB() {
        throw new NotImplementedException();
    }
}
