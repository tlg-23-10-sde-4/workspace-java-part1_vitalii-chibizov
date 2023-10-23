/*
    Client - side main - class focused on validation
    We only going to check 0; 1; 20; 21
 */
class AlarmClockValidationTest {

    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();

        clock.setSnoozeInterval(1); // should stick -> accepted
        System.out.println(clock.toString()); // why we use toString here

        clock.setSnoozeInterval(20); // should stick -> accepted
        System.out.println(clock.toString());

        clock.setSnoozeInterval(0); // should not stick -> declined
        System.out.println(clock.toString());

        clock.setSnoozeInterval(21); // should not stick -> declined
        System.out.println(clock.toString());
    }

}