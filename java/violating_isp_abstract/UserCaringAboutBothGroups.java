package violating_isp_abstract;

public class UserCaringAboutBothGroups {
    public UserCaringAboutBothGroups(PublicAPI publicAPI) {
        publicAPI.method1UsedInGroupA();
        publicAPI.method2UsedInGroupA();
        publicAPI.method1UsedInGroupB();
        publicAPI.method2UsedInGroupB();
    }
}
