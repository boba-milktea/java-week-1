/**
 * This example demonstrates the use of a switch statement in Java.
 * -----------------------------------------------------------
 */

public class SwitchStatement
{

    public enum Day { SUNDAY, MONDAY, TUESDAY,
        WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }

    public static void main(String[] args)
    {
        Day day = Day.MONDAY;

        int myDay = switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY                -> 7;
            case THURSDAY, SATURDAY     -> 8;
            case WEDNESDAY              -> 9;
            default -> throw new IllegalStateException("Invalid day: " + day);
        };
        System.out.println(myDay);

    }
}
