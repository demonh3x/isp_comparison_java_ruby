package violating_isp_abstract;

public interface PublicAPI {
    void method1UsedInGroupA();
    void method2UsedInGroupA();

    void method1UsedInGroupB();
    void method2UsedInGroupB();
}
