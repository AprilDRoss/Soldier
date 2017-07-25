package com.company;

import com.sun.tools.javah.Gen;

public class Main {

    public static void main(String[] args) {
	// write your code here
        General general = new General("Sherman","Five Star General","1865",23);
        System.out.println("My name is General" + general.name + " " + "my rank is" + general.rank + " " + "and I have" + " " + general.yearsOfService + "years of service.");
        System.out.println(general.eat());
        System.out.println(general.speak());
        System.out.println(general.march());
        System.out.println(general.usePrimaryWeapon());
        System.out.println(general.useSecondaryWeapon());
        System.out.println(general.useKnife());
        System.out.println(general.usePunch());
    }
}
