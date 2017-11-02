package Model;

public class Movie {

    private int movieID;
    private String movieTitle;


    public Movie(int movieID, String movieTitle) {
        this.movieID = movieID;
        this.movieTitle = movieTitle;
    }


    public int getMovieID() {
        return movieID;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }


    @Override
    public String toString() {
        return movieTitle;

}
  }


