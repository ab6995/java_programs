package com.ashish;

public class Vipcustomer {
    private String name;
    private double limit;
    private String emailadd;

    public Vipcustomer(){
        this("default name",1500,"ab@abc.com");
        System.out.println("default construsctor called");

    }

    public Vipcustomer(String name, double limit) {
       this(name, limit, "unknown@email.com");
    }

    public Vipcustomer(String name, double limit, String emailadd){
        this.emailadd =emailadd;
        this.limit =limit;
        this.name = name;
        System.out.println("Name:" + this.name + "limit for account" + this.limit + "email add " + emailadd);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public void setEmailadd(String emailadd) {
        this.emailadd = emailadd;
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmailadd() {
        return emailadd;
    }
}
