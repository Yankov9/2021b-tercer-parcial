package oop.exams.generator;

import java.util.Random;

public class EastLicensePlateGenerator implements LicensePlateGenerator {
    private int i;
    String matricula = "3";

    @Override
    public String generate(String state) {

        Random aleatorio = new Random();

        for (i = 0; i < 2; i++) {
            matricula+= aleatorio.nextInt(10);
            if(i == 1) {
                matricula+="Z";
            }
        }
        return matricula;
    }
}
