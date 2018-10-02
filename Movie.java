package my.movies;

public class Movie 
{
	String moviename;
	String certificate;
	double budget;
	double duration;
	String typeofmovie;
	public String[] cast_crew;
	
	public void start()
	{
		
	}
	
	public void stop()
	{
		
	}
	
		
	public Movie(String moviename, String certificate, double budget, double duration, String typeofmovie,
			String[] cast_crew) 
	{
		super();
		this.moviename = moviename;
		this.certificate = certificate;
		this.budget = budget;
		this.duration = duration;
		this.typeofmovie = typeofmovie;
		this.cast_crew = cast_crew;
	}

	public void display()
	{
		System.out.println("Name: "+moviename);
		System.out.println("certificate: "+certificate);
		System.out.println("budget: "+budget);
		System.out.println("duration: "+duration);
		System.out.println("typeofmovie: "+typeofmovie);
		for(int i=0;i<cast_crew.length;i++)
		{
			System.out.println(cast_crew[i]);
		}
		System.out.println();
	}
}