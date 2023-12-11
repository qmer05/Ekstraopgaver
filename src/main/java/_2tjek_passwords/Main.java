package _2tjek_passwords;

import _1beregning_af_areal.Shape;

public class Main {
    public static void main (String [] args){

        PasswordValidator pv = new PasswordValidator(4,20,true, true,true);

        String password = "IDERP3222d";

        System.out.println("Is password valid: " + pv.isValid(password));

    }
}
