package violating_isp_abstract;

public class UserCaringAboutGroupB {
    public UserCaringAboutGroupB(PublicAPI publicAPI){
        publicAPI.method1UsedInGroupB();
        publicAPI.method2UsedInGroupB();
    }
}
