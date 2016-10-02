package com.udacity.gradle;

import java.util.Random;

public class JavaJoke {

    final String[] jokes = {
            "Hold still, Carl!...Don't...move...an...inch!",
            "Egad!...Sounds like the farmer's wife has really flipped out this time!",
            "Now stay calm...Let's hear what they said to Bill.",
            "Well that's how it happened, Sylvia...I kissed this frog, he turns into a prince," +
                    "we get married and wham!...I'm stuck at home with a bunch of pollywogs.",
            "So!...Out bob bob bobbing along again!",
            "It's still hungry...and I've been stuffing worms into it all day.",
            "Thanks God, Sylvia! We're alive!",
            "So!...The little sweethearts were going to carve their initials on me, eh?",
            "And I've only one thing to say about all these complaints I've been hearing about...venison!",
            "Say, honey...didn't I meet you last night at the feeding-frenzy?",
            "Okay, buddy. Then how 'bout the right arm?",
            "Through the hoop, Bob! Through the hoop!",
            "Big Bob says he's getting tired of you saying he doesn't really exists.",
            "Yeah Sylvia...my set too...and in the middle of 'Laverne and Shirley.'",
            "Andrew, go out an dget your grandfather...the squirrels have got him again.",
            "Thank God!... THose blasted crickets have finally stopped!",
            "Okay... On the count of three everybody rattles.",
            "So then Carl says to me, 'Look... Let's invite over the new neighbors and check'em out.",
            "One of the nicest evenings I've ever spent at the Wilson's...and then you had to go " +
                    "and do that on the rug!",
            "The herring's nothing'...I'm going for the whole shmeer!",
            "We've made it, Warren!...The moon!",
            "I like it...I like it.",
            "Yoo-hoo! Oh, yoo-hoo!...I think I'm getting a blister.",
            "You imbecile!... We flew 12,000 miles for THIS?",
            "Oh, brother!...Not hamsters again!",
            "Well, we're back!",
            "Andrew! So that's where you've been! And good heavens!...There's my old hairbrush, too!",
            "This is a test. For the next thirty seconds, this station will conduct a test of the" +
                    "emergency broadcast system...",
            "Dear Henry:Where were you? We waited and waited but finally decided that...",
            "So!...You STILL won't talk, eh?",
            "Hello, I'm Clarence Jones from Bill's office and...Oh! Hey! Mistletoe!",
            "This is just not effective...We need to get some chains.",
            "Ho! Just like every time,you'll get about 100 yeards out before you start heading back.",
            "Wouldn't you know it!...There goes our market for those things!",
            "You meathead! Now watch!...The rabbit goes through the hole, around the tree five or" +
                    "six times...",
            "Excuse me, Harold, while I go slip into something more comfortable.",
            "We've got the murder weapon and the motive...now if we can just establish time-of-death",
            "The Claw! The Claw is back! Where are the children?",
            "Rejected again, huh Murray?...Have you heard about this new breath-refreshening toothpaste?",
            "Well I'll be! Eggbeater must have missed that one.",
            "Okay, Bob! Go! Go!",
            "You idiots!...We'll never get that thing down the hole!",
            "Look...You wanna try putting him back together again?",
            "Gad, I hate walking through this place at night.",
            "...and then the second group coms in - 'row, row, row your boat'...",
            "Aphids! Aphids! Henry!...Aphids are loose in the garden!",
            "Big one, Thag!...We caught biiiiig one!",
            "Listen...this party's a drag. But later on, Floyd, Warren, and myself are going over" +
                    "to Farmer Brown's and slaughter some chickens.",
            "You're kidding!...I was struck twice by lightning too!",
            "All units prepare to move in!...He's givin' him the duck now!",
            "Still won't talk, huh?...Okay, no more Mr. Nice Guy.",
            "On the other hand, gentlemen, what if we gave a war and EVERYBODY came?",
            "I could have guessed...my freinds all warned me that this breed will sometimes turn on you.",
            "Go get'em brother.",
            "See, Frank? Keep the light in their eyes and you can bag them without any trouble at all.",
            "An Excellent specimen...symbol of beauty, innocence, and fragile life...hand me the " +
                    "the jar of ether.",
            "Wait! Wait!...Cancel that. I guess it says 'helf.'",
            "I'm afraid youve got cows, Mr. Farnsworth.",
            "Look, I just don't feel the relationship is working out.",
            "We're almost free, everyone!...I just felt the first drop of rain."
    };

    public String jokesGenerate() {
        Random jokesRandom = new Random();
        int randomJokes = jokesRandom.nextInt(60);
        return jokes[randomJokes];
    }

}
