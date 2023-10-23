class MovieClient {

    public static void main(String[] args) {
        Movie movie1 = new Movie("Akira");
        movie1.setReleaseYear(1998);
        movie1.setRevenue(240_000_000.0);
        System.out.println(movie1); // toString automatically called;



        Movie movie2 = new Movie("Iron Man", 2008, 29_000_000_000.0);
      /*  movie2.setTitle("Iron Man");
        movie2.setReleaseYear(2008);
        movie2.setRevenue(29_000_000_000.0);*/
        System.out.println(movie2); // toString automatically called;

        Movie movie3 = new Movie("Jay 2 Jay");
        System.out.println(movie3);

        Movie movie4 = new Movie("13213");
        System.out.println(movie4);
    }

}