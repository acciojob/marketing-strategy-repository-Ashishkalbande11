package com.driver;

public class MarketingStrategy {
    private String name;
    private String description;
    private String targetAudience;
    private double budget;
    private double potentialROI;

    public MarketingStrategy(String name, String description, String targetAudience, double budget, double potentialROI) {
        this.name = name;
        this.description = description;
        this.targetAudience = targetAudience;
        this.budget = budget;
        this.potentialROI = potentialROI;
    }

    // Getters and Setters

    public String getName() {
    	//your code goes here
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getDescription() {
    	//your code goes here
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public String getTargetAudience() {
    	//your code goes here
        return targetAudience;
    }
    public void setTargetAudience(String targetAudience){
        this.targetAudience = targetAudience;
    }

    public double getBudget() {
    	//your code goes here
        return budget;
    }
    public void setBudget(double budget){
        this.budget = budget;
    }

    public double getPotentialROI() {
    	//your code goes here
        return potentialROI;
    }
    public void setPotentialROI(double potentialROI){
        this.potentialROI = potentialROI;
    }
    

    @Override
    public String toString() {
    	//your code goes here
        return "MarketingStrategy{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", targetAudience='" + targetAudience + '\'' +
                ", budget=" + budget +
                ", potentialROI=" + potentialROI +
                '}';
    }
}

