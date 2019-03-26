import Core.Core;

public class GameStarter {

    public static void main(String[] args) {
        Core core = new Core();
        core.load();
        core.run();
    }
}
