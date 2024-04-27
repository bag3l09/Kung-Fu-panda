import java.util.*;
public class Showing {
    private Map<String, Boolean> movieShowing = new HashMap<>();

    Showing(){
        int rowNum = 1;
        for (int i=1; i<=30; i++){
            if (rowNum > 10) { rowNum = 1; }
            if (i <= 10) { 
                movieShowing.put("A" + rowNum, false); 
            }
            else if (i <= 20 && i > 10) { 
                movieShowing.put("B" + rowNum, false); 
            }
            else { 
                movieShowing.put("C" + rowNum, false); 
            }
            rowNum+=1;
        }
    }

    public Map<String, Boolean> getMovieShowing() {
        return this.movieShowing;
    }

    public void setMovieShowing(Map<String, Boolean> movieShowing) {
        this.movieShowing = movieShowing;
    }

    public void occupySeat(String seat){
        movieShowing.put(seat, true);
    }
    
    public void deoccupySeat(String seat) {
    	movieShowing.put(seat, false);
    }

    @Override
    public String toString() {
        return "Showing [movieShowing=" + movieShowing + "]";
    }

    

    
}
