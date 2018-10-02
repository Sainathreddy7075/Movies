package my.movies;

public class HollyWoodMovies extends Movie
{
	String movie_id;
	String language;
	
	public void start()
	{
		
	}
	
	public void stop()
	{
		
	}
		
	public HollyWoodMovies(String moviename, String certificate, double budget, double duration, String typeofmovie,
			String[] cast_crew, String movie_id, String language) 
	{
		super(moviename, certificate, budget, duration, typeofmovie, cast_crew);
		this.movie_id = movie_id;
		this.language = language;
	}

	public void display()
	{
		System.out.println("HOLLYWOOD MOVIE");
		System.out.println("Name: "+moviename);
		System.out.println("certificate: "+certificate);
		System.out.println("budget: "+budget);
		System.out.println("duration: "+duration);
		System.out.println("typeofmovie: "+typeofmovie);
		System.out.println("movie_id: "+movie_id);
		System.out.println("language: "+language);
		for (int i=0;i<cast_crew.length;i++)
		{
			System.out.println(cast_crew[i]);
		}
		System.out.println();
	}
}
