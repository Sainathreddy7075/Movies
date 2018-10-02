package my.runmovies;

import my.movies.Movie;
import my.movies.TollyWoodMovies;
import my.movies.BollyWoodMovies;
import my.movies.HollyWoodMovies;

public class Main 
{
	public static void main(String[] args) 
	{
		/*Movie mo = new Movie("Bahuballi", "U/A", 180, 195.0, "war", args);
		mo.cast_crew = new String[] {"hero:prabhas","heroine:anushka","director:rajamouli"};
		mo.display();*/
		
		TollyWoodMovies tw = new TollyWoodMovies("Legend", "U/A", 15, 150, "familyentertainer", args, "TW-123", "Telugu");
		tw.cast_crew = new String[] {"hero:balakrishna","heroine:radhikaapthe","director:boyapatisreenu"};
		tw.display();
		
		BollyWoodMovies bw = new BollyWoodMovies("Aashiqui2", "U/A", 15, 134, "familyentertainer", args, "BW-123", "Hindi");
		bw.cast_crew = new String[] {"hero:adityaroykapur","heroine:shraddhakapoor","director:mohitsuri"};
		bw.display();
		
		HollyWoodMovies hw = new HollyWoodMovies("Titanic", "U/A", 20, 195, "loveentertainer", args, "HW-123", "English");
		hw.cast_crew = new String[] {"hero:leonardodicaprio","heroine:katewinslet","director:jamescameron"};
		hw.display();
	}
}
