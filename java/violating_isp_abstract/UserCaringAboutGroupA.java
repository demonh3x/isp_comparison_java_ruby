package violating_isp_abstract;

public class UserCaringAboutGroupA {
    public UserCaringAboutGroupA(PublicAPI publicAPI){
        publicAPI.method1UsedInGroupA();
        publicAPI.method2UsedInGroupA();
    }
}
