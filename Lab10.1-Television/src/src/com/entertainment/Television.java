package src.com.entertainment;

/*
    Business class to model the working of television
 */
    public class Television {
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private DisplayType display = DisplayType.LED;
    //public static boolean verifyInternetConnection = false;
    private static int instanceCount = 0;

    public static int getInstanceCount() {
        //boolean isConnected = verifyInternetConnection();
        return instanceCount;
    }


        // vars for brand and volume
    private String brand = "Toshiba";
    int volume;
    private  boolean isMuted;
    private int oldVolume;

    // constructor
    public Television(){
       // no-arg ctor
        instanceCount++;
    }
    public Television(String brand) throws InvalidBrandException {
        this();
        setBrand(brand);
    }
    public Television(String brand, int volume)
            throws IllegalArgumentException, InvalidBrandException {
        this(brand);
        setVolume(volume);
    }
    public Television(String brand, int volume, DisplayType display)
            throws IllegalArgumentException, InvalidBrandException {
        this(brand, volume);
        setDisplay(display);
    }

    // business "action" methods

    public void mute(){
        if(!isMuted()) {     // not muted, emitting sound
            oldVolume = getVolume();
            // or:  oldVolume = volume
            setVolume(0); // or use static final mute volume value
            isMuted = true;
        }
        else{
            setVolume(oldVolume);
            isMuted = false;
        }
    }
    public void turnOn(){
        boolean isConnected = verifyInternetConnection();
    //    System.out.println("Turning on your " + brand + " TV to volume " + volume);
        System.out.println("Turning on your " + getBrand() + " TV to volume " + getVolume());
    };
    public void turnOff(){
        System.out.println("Shutting down....goodbye");
    };



    // accessor methods

    public boolean isMuted() {
        return isMuted;
    }
    public String getBrand() {
        return brand;
    }

 /*   public void setBrand(String brand) {
        switch (brand) {
            case "Samsung" -> this.brand = brand;
            case "LG" -> this.brand = brand;
            case "Sony" -> this.brand = brand;
            default -> System.out.println("The brand provided is not supported or does not exist");
        }
    }*/
/* public void setBrand(String brand) {
     if(brand.equals("Samsung") || brand.equals("LG") || brand.equals("Sony" )){
         this.brand = brand;
     }
     else {
             System.out.println("The brand provided is not supported or does not exist");
     }
 }*/


    public void setBrand(String brand) throws InvalidBrandException{
        switch (brand){
            case "Samsung":
                this.brand = brand;
                break;
            case "LG":
                this.brand = brand;
                break;
            case "Sony":
                this.brand = brand;
                break;
            default:
                throw new InvalidBrandException ( "The brand provided is not supported or does not exist");
        }
    }

    public int getVolume() {
        return volume;
    }


    public void setVolume(int volume) throws IllegalArgumentException{
        if(volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
        }
        else {
        //    System.out.println("Invalid input, try another value in this range: " + MIN_VOLUME + " - " + MAX_VOLUME);
        //    String.format("Invalid input, try another value in this range: %s - %s", MIN_VOLUME,  MAX_VOLUME);
            throw new IllegalArgumentException(
                    String.format("Invalid input, try another value in this range: %s - %s\n",
                            MIN_VOLUME,  MAX_VOLUME));
        }
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    // EXPERT JAVA level: KEEP OUT


    private boolean verifyInternetConnection(){
        return true; // fake implementation (obviously)
    }

    public String toString() {
        return "Television{" +
                "display=" + display +
                ", brand='" + brand + '\'' +
                ", volume=" + volume +
                ", isMuted=" + isMuted +
                ", oldVolume=" + oldVolume +
                '}';
    }
}