package Factory;

public class Flutter {
    public void createTheme(){
        System.out.println("Creating Theme");
    }

    public void setRefreshRate(){
        System.out.println("Setting Refresh Rate");
    }

    public UIFactory createUIFactory(SupportedPlatforms params){
        return UIFactoryFactory.getUIFactoryFromPlatform(params);
    }
}
