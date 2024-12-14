package Encapsulation;

public class TestGaming {
    public static void main(String[] args) {
        GamingProfile profile1 = new GamingProfile("gamemaster4357");
        profile1.levelUp();
        profile1.getLevel();
        profile1.levelUp("GameMaster4325");

        profile1.levelUp("gamemaster4357");


    }
}
