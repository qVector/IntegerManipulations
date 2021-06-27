public class IntegerManipulations {
    public static void main(String[] args) {
        int allSecond = 126;
        int days = allSecond / (60 * 60 * 24);
        int hours = (allSecond - (days * (60 * 60 * 24))) / 60 / 60;
        int minutes = (allSecond - (days * (60 * 60 * 24)+hours * 60 * 60)) / 60;
        int second = allSecond -(days * (60 * 60 * 24)+(hours * 60 * 60) + (minutes * 60)) ;

        System.out.println("Days = " + days);
        System.out.println("Hours = " + hours);
        System.out.println("Minutes = " + minutes);
        System.out.println("Second = " + second);
    }
}
