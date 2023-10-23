/*
 * Class definition to model the workings of an alarm clock.
 * This is called a "business class" or "system class," as it contains
 * business things (attributes and methods).
 * This class definition does NOT have a main() method - most don't.
 */
class AlarmClock {
    // shared static variables - only one copy of these, live in the class-wide common area
    public static final int MIN_TERMINAL =1;
    public static final int MAX_INTERVAL =20;

    private static int nextId =1;
    private int id;
    private int snoozeInterval;

    // properties or attributes - in Java, we call these "instance variables" or "fields"
    // business constraint: must be between 1 and 20 (inclusive)
   // private int snoozeInterval = 5;  // default value for when client doesn't specify one (instead of 0)

    public AlarmClock(){
        // no-op
    }
    public AlarmClock(int snoozeInterval){
        setSnoozeInterval(snoozeInterval);
        this.id = nextId++;

    }


    /*public String toString() {
        return "AlarmClock: id = " + getId() + ", snoozeInterval = " + snoozeInterval;
    }*/

    // functions or operations - in Java, we call these "methods"
    public void snooze() {
        System.out.println("Snoozing " + getSnoozeInterval() + " minutes");
    }

    // accessor methods - provide "controlled" access to the object's fields
    // this allows us to do things like data validation, i.e., enforcing constraints
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    // TODO: enforce the data constraint (if-else) -> must be between 1 and 20 (inclusive)
    public void setSnoozeInterval(int snoozeInterval) {
       // this.snoozeInterval = snoozeInterval;

        //if (1 <= snoozeInterval <= 20) {
        if (snoozeInterval >=1 && snoozeInterval <= 20) {
            this.snoozeInterval = snoozeInterval;
        }
        else {
            System.out.println("Invalid snoozeInterval: " + snoozeInterval + ". " + "Must be between " + MIN_TERMINAL + " and " + MAX_INTERVAL);
        }
    }

   /* public void setSnoozeInterval(int snoozeInterval) {

        if (snoozeInterval < minInterval || snoozeInterval > maxInterval) {
            System.out.println("Invalid snoozeInterval: " + snoozeInterval + ". " + "Must be between " + minInterval + " and " + maxInterval);
        }
        else {
            this.snoozeInterval = snoozeInterval;
        }
    }

    public String toString() {
        return "AlarmClock: snoozeInterval=" + getSnoozeInterval();
    }*/


}