class Movie {
    // fields or instance variables (properties / attributes)
    private String title;
    private int releaseYear;
    private double revenue;

    // constructor
   /* public Movie() {
        // no-op
    }*/
    public Movie(String title){
        setTitle(title);
    }
    public Movie(String title, int releaseYear) {
        this(title);
        setReleaseYear(releaseYear);
    }
    public Movie(String title, int releaseYear, double revenue) {
        this(title, releaseYear);
        setRevenue(revenue);
    }

/*    public Movie() {
        // no-op
    }
    public Movie(String title){
        setTitle(title);
    }
    public Movie(int releaseYear) {
        setReleaseYear(releaseYear);
    }
    public Movie(double revenue) {
        setRevenue(revenue);
    }
    public Movie(String title, int releaseYear, double revenue) {
       this(title);
       this(releaseYear);
       this(revenue);
    }*/

    //  business or action methods - not shown
    // pause(); play(); rewind(); fastForward90; skipTo();

    // accessor methods - provide " controlled acces" to the object's fields
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

   /* public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", revenue=" + revenue +
                '}';
    }*/
    public String toString() {
        return "Movie: title = " + getTitle() + ", releaseYear = " + getReleaseYear() +
                 ", revenue = " + getRevenue();
    }
}