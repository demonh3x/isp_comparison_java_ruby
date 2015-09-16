package violating_isp_abstract;

public class Main {
    public static void main(String[] args) {
        new UserCaringAboutGroupA(new ImplementationOfGroupA());
    }
}
