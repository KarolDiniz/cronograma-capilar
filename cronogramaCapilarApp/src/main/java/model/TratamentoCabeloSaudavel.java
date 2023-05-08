package model;

public class TratamentoCabeloSaudavel extends Tratamento{

    public TratamentoCabeloSaudavel(){
        setCronograma();
        System.out.println(super.toString());
    }
    public void setCronograma(){
        super.semanaOne = new String[]{"Hidratação", "Hidratação", "Nutrição"};
        super.semanaTwo = new String[]{"Hidratação", "Nutrição", "Hidratação"};
        super.semanaTree = new String[] {"Hidratação", "Hidratação", "Nutrição"};
        super.semanaFor = new String[]{"Hidratação", "Nutrição", "Reconstrução"};
    }
}

