package customclass;

import list.SportTeam;
import org.Sport.Sport;

public class Main {
    public static void main(String[] args) {

       SportGenericClass<SportTeam,String> genericClassRefVariable = new SportGenericClass<>();

       genericClassRefVariable.sportGenerics(new SportTeam(), "");

    }
}
