package list;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList nonGenericList = new ArrayList();

        nonGenericList.add(1);
        nonGenericList.add("String");
        nonGenericList.add(new SportTeam());


        Object object = nonGenericList.get(1);
        SportTeam sportTeam = (SportTeam) object;

        sportTeam.sportMethod();

        ArrayList<SportTeam>sportTypeOnly = new ArrayList<>();

        sportTypeOnly.add(new SportTeam());

    }
}
