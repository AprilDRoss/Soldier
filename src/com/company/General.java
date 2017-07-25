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
        return "All we have are rations. Eat up!";
    }

    public String usePrimaryWeapon(){
     return "I used my AK-47.";
    }

    public String useSecondaryWeapon(){
        return "I used my platinum 9mm.";
    }

    public String useKnife(){
        return "I used my knife when I ran out of bullets.";
    }

    public String usePunch(){
        return "I used a 1-2 combo when I punch.";
    }

}
