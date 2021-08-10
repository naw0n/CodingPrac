import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour,minute;
        hour = sc.nextInt();
        minute = sc.nextInt();

        int NewHour, NewMinute;
        NewHour= (hour*60+minute-45)/60;
        NewMinute = (hour*60+minute-45)%60;

        if(NewMinute<0){
            NewHour = 23;
            NewMinute = (24*60+NewMinute)%60;
        }
        System.out.print(NewHour + " " + NewMinute);
    }
}
