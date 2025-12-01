package DynamicDispatch;

public class Gamer {String username = "Anonymous";
    void play() {
        System.out.println(username + " is playing a casual game.");
    }
}
class ProGamer extends Gamer {
    int rank = 1;
    @Override
    void play() {
        System.out.println(username + " is streaming a ranked match at rank " + rank + "!");
    }

    void stream() {
        System.out.println(username + " is live on Twitch with rank " + rank + "!");
    }
}
