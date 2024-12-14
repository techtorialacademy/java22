package Encapsulation;

public class GamingProfile {
    // Exercise the Encapsulation
    private String username;
    private int level;
    private String secretAchievement;
    private boolean isAchievementUnlocked;

    // Constructor to Initialize username and level
    public GamingProfile(String username){
        if(username.isEmpty() || username == null){
            this.username = "PlayerUnknown";
        }else{
            this.username = username;
        }
        this.level = 1;
        this.secretAchievement = "Ultimate Gamer";
        this.isAchievementUnlocked = false;
    }
    // Get achivement method with our logic
    public String getSecretAchievement(){
        // Get the achivement only if it is unlocked
        if(isAchievementUnlocked){
            return secretAchievement;
        }
        return "No achivement unlocked yet!! Please continue to play to unlock achievement...";
    }

    // let's create a method for level up
    public void levelUp(){
        // increase the level of user by 1.
        level++;
        if(level >= 10 && !isAchievementUnlocked){
            isAchievementUnlocked = true;
            System.out.println(getSecretAchievement());
        }
    }

    // Let's overload the levelUp method, so when user gives it user name correctly it will jump 9 levels
    public void levelUp(String username){
       if(username.equals(this.username)){
           level = level + 9;
           if(level >= 10 && !isAchievementUnlocked){
               isAchievementUnlocked = true;
               System.out.println(getSecretAchievement());
           }
       }else{
           System.out.println("Wrong username!! No level up, please try again.");
       }
    }

    public int getLevel(){
        System.out.println("Your are at level " + this.level + ".");
        return this.level;
    }




}
