public abstract class CommonSoldier implements gunFight, knifeFight, handToHandCombat {
    private String name;
    private String rank;
    private String ID;
    private int yearsOfService;

    abstract void speak(String);


public void higherRankingOfficer () {
    System.out.println("Sir! Yes, Sir!");
}

    public void sameRankingOfficer (){
    System.out.println("Hey, dude.");
    }

    public void primaryWeapon (){
        System.out.println("Used primary weapon to neutralize threat.");
    }

    public void secondaryWeapon (){
        System.out.println("Primary weapon was empty.Used secondary weapon to neutralize threat.");
    }

    public void onlyKnife (){
        System.out.println("Both weapons were empty.Used knife to neutralize threat.");
    }

    public void punches (){
        System.out.println("Used punches to neutralize threat.");
    }








}










