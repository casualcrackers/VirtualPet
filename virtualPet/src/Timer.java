import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
public class Timer{



    public long PerfectTimer() throws InterruptedException{


        boolean x=true;
        long displayMinutes=0;
        long starttime=System.currentTimeMillis();



            TimeUnit.SECONDS.sleep(1);
            long timepassed=System.currentTimeMillis()-starttime;
            long secondspassed=timepassed/1000;
            if(secondspassed==60)
            {
                secondspassed=0;
                starttime=System.currentTimeMillis();
            }
            if((secondspassed%60)==0)
                displayMinutes++;

           System.out.println(displayMinutes+"::"+secondspassed);


    return displayMinutes;
    }
}