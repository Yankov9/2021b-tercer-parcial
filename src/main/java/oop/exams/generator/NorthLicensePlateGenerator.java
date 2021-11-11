package oop.exams.generator;

import java.util.Random;

public class NorthLicensePlateGenerator implements LicensePlateGenerator{
    private int i;


    @Override
    public String generate(String state) {
        String matricula = "1"+state;

        Random aleatorio = new Random();

        for (i = 0; i < 3; i++) {
            matricula+= aleatorio.nextInt(10);
        }
        return matricula;
    }
}
