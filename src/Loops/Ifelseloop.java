package Loops;

public class Ifelseloop {
    public static void leapyear(int year){
/* regularly in the year 365 days while in the leap year 364 days
it will be coming every 4 year
so i need to do modules by 4
 */

        if(  (year%400==0) || (year%4==0 && year%100 !=0) )
            /* '||' meaning of this sign is or    and  '!=' = not equal to
             i put the first thing bcz of the leap year is coming every 4 year
             other think is year%4 is not equal to 0 than It's directly going to else loop */
        {
            System.out.println("its leap year " + year);
        }
        else
            System.out.println("its not leap year " + year);
    }

    public static void main(String[] args) {
        leapyear(2016);
        leapyear(2019);
        leapyear(2023);
        leapyear(20256);
    }
}
