package Factory;

public class Client {
    public static void main(String[] args){
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.createUIFactor(SupportedPlatforms.ANDROID);

        uiFactory.createButton();
        uiFactory.createMenu();
    }
}
