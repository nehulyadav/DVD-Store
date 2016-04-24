package project;

/**
 * Created by zodyac on 4/23/2016.
 */
public class DVD {

    // ------------------------------------------------------------------------
    // Variables and Properties ===============================================
    // ------------------------------------------------------------------------
    private String movieName, stars, producers, director, productionCompany;
    private int numCopies;

    // ------------------------------------------------------------------------
    // Constructors ===========================================================
    // ------------------------------------------------------------------------
    // Minimum required constructor
    public DVD(String movieName) {
        super();
        this.movieName = movieName;
        this.stars = null;
        this.producers = null;
        this.director = null;
        this.productionCompany = null;
        this.numCopies = 0;
    }

    // Complete Constructor
    public DVD(String movieName, String stars, String producers,
               String director, String productionCompany, int numCopies) {
        super();
        this.movieName = movieName;
        this.stars = stars;
        this.producers = producers;
        this.director = director;
        this.productionCompany = productionCompany;
        this.numCopies = numCopies;
    }

    // ------------------------------------------------------------------------
    // Utility Methods ========================================================
    // ------------------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DVD dvd = (DVD) o;

        return movieName.equals(dvd.movieName);

    }

    @Override
    public int hashCode() {
        return movieName.hashCode();
    }

    @Override
    public String toString() {
        return "DVD{" +
                "movieName='" + movieName + '\'' +
                ", stars='" + stars + '\'' +
                ", producers='" + producers + '\'' +
                ", director='" + director + '\'' +
                ", productionCompany='" + productionCompany + '\'' +
                ", numCopies=" + numCopies +
                '}';
    }

    // ------------------------------------------------------------------------
    // Getters and Setters ====================================================
    // ------------------------------------------------------------------------
    public String getMovieName()                                {return movieName;}
    public void setMovieName(String movieName)                  {this.movieName = movieName;}

    public String getStars()                                    {return stars;}
    public void setStars(String stars)                          {this.stars = stars;}

    public String getProducers()                                {return producers;}
    public void setProducers(String producers)                  {this.producers = producers;}

    public String getDirector()                                 {return director;}
    public void setDirector(String director)                    {this.director = director;}

    public String getProductionCompany()                        {return productionCompany;}
    public void setProductionCompany(String productionCompany)  {this.productionCompany = productionCompany;}

    public int getNumCopies()                                   {return numCopies;}

    public void setNumCopies(int numCopies)                     {this.numCopies = numCopies;}

}

