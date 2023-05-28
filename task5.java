package week_03;

public class task5 {
/*
Aşağıda, Java programlama dili ile dakikaların yıl ve gün cinsinden ifade edilmesi örneği verilmiştir:
write a Java program to convert minutes into a number of years and days.

     Input the number of minutes: 3456789
     Expected Output :
     3456789 minutes is approximately 6 years and 210 days
 */
    public static void main(String[] args) {
        int GivenMinute=3456789;


        int HowManyMinutesHaveInYear=60*24*365;
        System.out.println(GivenMinute/HowManyMinutesHaveInYear);
        int years=GivenMinute/HowManyMinutesHaveInYear;

        int leftMinutes = GivenMinute % HowManyMinutesHaveInYear;
        System.out.println(leftMinutes);


        int HowManyMinutesGivenInDay=24*60;
        System.out.println(leftMinutes/HowManyMinutesGivenInDay);

        int HowManyDaysWeLeft= leftMinutes/HowManyMinutesGivenInDay;
        System.out.println( GivenMinute + " minutes is approximately " + years + " years and " + HowManyDaysWeLeft + " days. " );
        System.out.println("ERayMeriç");












    }
}
