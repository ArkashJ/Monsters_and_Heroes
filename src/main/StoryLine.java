package main;
import java.util.concurrent.TimeUnit;

import static main.Colors.colors.colorText;
// Class to initialize a story line with time delays to increase the impact of the story
public class StoryLine {
    public static void startStory(){
        System.out.println( colorText("In a mystical world, sorcers, paladins and warrior clans kept fighting amongst themselves for dominance.", "red"));
        delay(2);
        System.out.println(colorText("The world was in imbalance until one day ......" +
                "They came!" +
                "", "red"));
        delay(2);
        System.out.println(colorText("These monster - dragons, spirits and exoskeletons - the likes of whom were never seen below came to conquer this world." + '\n' +
                "All hope isn't lost yet because these heroes are the only ones strong enough to stop them."
        , "blue"));
        delay(2);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println(colorText("You have been chosen to protect this planet from this evil doers. You are to pick a team of 3, should you choose to accept," + '\n' +
                "to go on a quest to fight these monsters. The all knowing oracle will be floating around the world with you as the symbol i, standing for intelligence, " + '\n' +
                "Intransigence and intrepid.", "green"));
        System.out.println(colorText("Before you were dragged into this war, clan merchants and citizens collected ancient items like armors, potions" + '\n' +
                "and spells to help you in your quest. As you go through the world, you will find your kin in markets where you can buy those materials" +'\n' +
                "to beat those monsters", "purple"));
        System.out.println(colorText("NOW GO AHEAD AND RECLAIM THIS WORLD", "black"));
        delay(2);
    }

    public static void endStory(){
        System.out.println(colorText("You have defeated the monsters and saved the world. You are now a legend. You are now a hero. You are now a champion", "blue"));
        delay(2);
        System.out.println(colorText("Thank you for playing!", "gray"));
    }

    public static void delay(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
