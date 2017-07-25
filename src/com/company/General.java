package com.company;

public class General extends CommonSoldier implements UseWeapon, UseKnife, UseHandToHandCombat {

    public General(String name, String rank, String ID, int yearsOfService){
        super(name, rank ="General", ID, yearsOfService);
    }

    public String march(){
        return "I've marched over one hundred miles";
    }

    public String speak(){
        return "To die in battle is the greatest honor.";
    }

    public String eat (){
        return "All we have are rations. Eat up..munch..munch";
    }

    public String usePrimaryWeapon(){
     return "Rit-tat-rit-tat-rit";
    }

    public String useSecondaryWeapon(){
        return "Pop,pop,pop,pop.";
    }

    public String useKnife(){
        return "Ugh! Ugh!";
    }

    public String usePunch(){
        return "Jab jab jab jab.";
    }

}
