package pkg;

public class Movie{
    private String movieName;
    private double rating;
    private int numRatings;
    private int revenue;
    
    public Movie(){
        movieName = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }
    
    public Movie(String movieName, double rating, int numRatings, int revenue){
        this.movieName = movieName;
        this.rating = rating;
        this.numRatings = numRatings;
        this.revenue = revenue;
    }
    
    public void movieToString(){
        System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRatings);
        System.out.println("Revenue: " + revenue);
        System.out.println();
    }
    
    public String getMovieName(){
        return movieName;
    }
    public int getRevenue(){
        return revenue;
    }
    
    public void addRating(double rating){
        this.rating = ((this.rating*numRatings) + rating)/(numRatings + 1);
        numRatings = numRatings + 1;
    }
    
    public boolean compareRatings(Movie a){
        return rating> a.rating;
    }
    
    public String revenueToString(){
        int ml = (int)(revenue/1000000);
        int rev = revenue - ml*1000000;
        int tsd = (int)(rev/1000);
        rev = rev - tsd*1000;
        int ones = rev;
        String stringRevenue = ml + "," + tsd + "," + ones;
        return stringRevenue;
    }
    
    public Movie pirateMovie(){
        Movie pirate = new Movie(movieName, rating, numRatings, revenue);
        return pirate;
    }
}
