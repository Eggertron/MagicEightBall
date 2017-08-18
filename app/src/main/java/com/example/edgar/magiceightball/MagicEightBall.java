package com.example.edgar.magiceightball;

import java.util.Random;

/**
 * Created by edgar on 8/17/17.
 */

public class MagicEightBall {
    private int MAXRESPONSE = 20;
    private String answers[] = {
            "It is certain",
            "It is decidedly so",
            "Wightout a doubt",
            "Yes definitely",
            "You may rely on it",
            "As I see it, yes",
            "Most likely",
            "Outlook good",
            "Yes",
            "Signs point to yes",
            "Reply hazy try again",
            "Ask again later",
            "Better not tell you now",
            "Cannot predict now",
            "Concentrate and ask again",
            "Don't count on it",
            "My reply is no",
            "My sources say no",
            "Outlook not so good",
            "Very doubtful"
    };

    Random random = new Random();

    public String getResponse() {
        return answers[random.nextInt(MAXRESPONSE)];
    }
}
