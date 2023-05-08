package model;

import java.lang.reflect.Array;
import java.util.Arrays;

public abstract class Tratamento {

    String semanaOne [];
    String semanaTwo [];
    String semanaTree [];
    String semanaFor [];

    public Tratamento() {
    }

    public abstract void setCronograma();

    @Override
    public String toString() {
        return "Tratamento " +
                "\nsemanaOne: " + Arrays.toString(semanaOne) +
                ",\nsemanaTwo: " + Arrays.toString(semanaTwo) +
                ",\nsemanaTree: " + Arrays.toString(semanaTree) +
                ",\nsemanaFor: " + Arrays.toString(semanaFor) +
                '}';
    }
}
