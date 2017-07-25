package com.company;

import com.sun.tools.javah.Gen;

public class Main {

    public static void main(String[] args) {
	// write your code here
        General general = new General("Sherman","Five Star General","1865",23);
        System.out.println(general.eat());
        System.out.println(general.march());
        System.out.println(general.useKnife());

    }
}
