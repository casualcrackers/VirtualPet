import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
public class Interactions {
    Scanner scan = new Scanner(System.in);
    stats s = new stats();
    Timer t = new Timer();
    boolean menu = true;
    long starttime=System.currentTimeMillis();
    long seconds = starttime / 1000;



    public void Instructions() throws InterruptedException {
        System.out.println(" ( ͡o ͜ʖ ͡o) " + "\n" + "Hi, im lenny and Ill be your virtual pet!");
        System.out.println("\uD83C\uDF2Dԅ( ͒ \u06DD ͒ )");
            System.out.println("Would you like to interact with me? ");
            String YesNo = scan.nextLine().toLowerCase();
            if (YesNo.equals("no")) {
                System.out.println("(╬≖_≖)" + "\n" + "fuck u too then knobhead");
                System.exit(0);
            }

        while (menu = true) {
            Wellness();

            if (YesNo.equals("yes")) {
                System.out.println("＼( ^o^ )／");
                System.out.println("press 1 to feed , 2 to put me asleep, 3 to talk to me and 4 to check my how im doing and 5 to do some exercise! ");
                String actions = scan.nextLine();
                if (!actions.equals("1") && !actions.equals("2") && !actions.equals("3") && !actions.equals("4") && !actions.equals("5")){
                    System.out.println("(╬≖_≖)");
                    System.out.println("u need to answer with yes or no");
                }
                if (actions.equals("1")) {
                    s.negateHunger();
                    System.out.println("\uD83C\uDF2Dԅ( ͒ \u06DD ͒ )" + "\n" + "( ★^O^★ )");
                    System.out.println("wow! very tasty!!");
                }
                if (actions.equals("2")) {
                    s.negateTiredness();
                    System.out.println("(-.-)zzZZ" + "\n" + "ᕙ(⇀‸↼ ‶)ᕗ" + "\n" + "٩(´Д` ;)۶.:*");
                    System.out.println("that was a good sleep!!");
                }
                if (actions.equals("3")) {
                    System.out.println("choose 1-3 for a wacky statement from your loveable Pet!!");
                    String Phrases = scan.nextLine().toLowerCase();
                    if (Phrases.equals("1")) {
                        System.out.println("(○｀ε´○)");
                        System.out.println("I don't enjoy killing, but when done righteously, it's just a chore, like any other");
                    }
                    if (Phrases.equals("2")) {
                        System.out.println("(⩺_⩹)");
                        System.out.println("I survived because the fire inside burned brighter than the fire around me. " +
                                "I fell down into that dark chasm, but the flame burned on and on");
                    }
                    if (Phrases.equals("3")) {
                        System.out.println("(T＿T)");
                        System.out.println("By the rivers of Babylon, there we sat down, yea, we wept, when we remembered Zion. " + "\n" +
                                "Remember, O Lord, The Children of Edom in the day of Jerusalem who said, Raze it, raze it, " + "\n" +
                                "even to the foundation.\" O daughter of Babylon, who art to be destroyed. How happy shall he be" + "\n" +
                                ", that rewardeth thee as thou hast served us. Happy shall he be, that taketh and dasheth thy " + "\n" +
                                "little ones against the stones");
                    }


                    if (!Phrases.equals("3") && !Phrases.equals("2") && !Phrases.equals("1") && !Phrases.equals("4") && !Phrases.equals("5")) {
                        System.out.println("（・∩・）");
                        System.out.println("incorrect input!!");
                    }


                }
                if (actions.equals("4")){
                    Wellness();
                }
                if (actions.equals("5")) {
                    System.out.println("ᕕ( ಠ‿ಠ)ᕗ");
                    System.out.println("┌( ಠ_ಠ)┘");
                    System.out.println("ᕕ(ಥʖ̯ಥ)ᕗ");
                    System.out.println("（；￣д￣）");
                    System.out.println("that was very tiring!");
                    s.addHunger();
                    s.addTiredness();

                }
            }
            if (!YesNo.equals("yes") && !YesNo.equals("no")) {
                System.out.println("(╯°□°)╯︵uᴉoɹǝɥ " + "\n" + "Looks like someones too smacked up to type properly!!!");
            }
            System.out.println("would you like to continue interacting with lenny?");
            String continueInteraction = scan.nextLine();
            if (continueInteraction.equals("yes")) {
                menu = true;
            }
            if (continueInteraction.equals("no")) {
                System.out.println("( *・∀・)ノ゛");
                System.out.println("thanks for having fun with lenny!");
                menu = false;
                System.exit(0);
            }
            if (!continueInteraction.equals("yes")) {

                System.out.println("(╬≖_≖)");
                System.out.println("u need to answer with yes or no");
            }

        }

    }




    public void Wellness(){
        if(s.getHunger()<20){
            System.out.println("im starving!!");
            System.out.println("(ᗒᗣᗕ)՞");
        }
        if(s.getTiredness()<20){
            System.out.println("im drained!!");
            System.out.println("(◞‸◟；)");
        }
        if(s.getHealth()<20){
            System.out.println("im feeling rotten!!");
            System.out.println("_(´ཀ`」 ∠)_");
        }
        if(s.getHunger()<35 && s.getHunger()>=20){
            System.out.println("im hungry");
            System.out.println("(￣﹃￣)");
        }
        if(s.getTiredness()<35 && s.getTiredness()>=20){
            System.out.println("im tired");
            System.out.println("（´＿｀;）");
        }
        if(s.getHealth()<35 && s.getHealth()>=20){
            System.out.println("im feeling queasy!!");
            System.out.println("( ⊙_◎ )");
        }
        if(s.getHunger() >= 35){
            System.out.println("im not hungry");
            System.out.println("(⍟^‿^⍟)");
        }
        if(s.getTiredness() >= 35){
            System.out.println("im well rested");
            System.out.println("＼( ^o^ )／");
        }
        if(s.getHealth() >= 35){
            System.out.println("im feeling energetic!!");
            System.out.println("( ◉‿◉ )");
        }

    }
    //for every multiple of 10 that is printed as a second the hunger/tiredness lowers by 2

    public void changingStatsOverTime() throws InterruptedException {
        for(long i = 0; i == t.PerfectTimer(); i++ ){
            s.addHunger();
            s.addTiredness();
        }
    }


}
