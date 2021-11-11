package oop.exams.generator;

import java.util.Random;

public class DefaultLicensePlateGenerator implements LicensePlateGenerator {
    private int i;
    String matricula = "5";

    @Override
    public String generate(String state) {

       Random aleatorio = new Random();

        for (i = 0; i < 7; i++) {
            matricula+= aleatorio.nextInt(10);
        }
        return matricula;
    }
}


