package com.company;

public abstract class CommonSoldier implements GunSlinger, KnifeFighter, PunchThrower {
    String name;
    String rank;
    String ID;
    int yearsOfService;

    public CommonSoldier(String name, String rank, String ID, int yearsOfService){
        this.name = name;
        this.rank = rank;
        this.ID = ID;
        this.yearsOfService = yearsOfService;
    }

    public abstract String speak();

    public abstract String eat();

    public abstract String march();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }
}










