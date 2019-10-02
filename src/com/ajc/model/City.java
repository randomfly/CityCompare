package com.ajc.model;

public class City {

    private String name;
    private String country;
    private double population;
    private String category;
    private boolean capital;

    public City(String n, String c, double p, boolean b)
    {
        this.name = n;
        this.country = c;
        this.population = p;
        this.capital = b;
        this.setCategory();
    }

    public String makeCompare(City c)
    {
        String str = "The city " + this.name;
        if (this.population > c.getPopulation())
        {
            str += " is bigger than ";
        } else if (this.population < c.getPopulation()) {
            str += " is smaller than ";
        } else {
            str += " is equal to ";
        }
        str += c.getName();
        return str;
    }

    private void setCategory()
    {
        if(this.capital)
        {
            if(this.population > 7)
                this.category = "Big";
            else
                this.category = "Small";
        } else {
            if(this.population > 3)
                this.category = "Big";
            else
                this.category = "Small";
        }
    }

    private double getPopulation() { return this.population; }
    private String getName() { return this.name; }

}
