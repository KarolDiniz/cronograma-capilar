package model;

public class TratamentoCabeloPoucoDanificado extends Tratamento{

    public TratamentoCabeloPoucoDanificado(){
        setCronograma();
        System.out.println(super.toString());
    }
    public void setCronograma(){
        super.semanaOne = new String[]{"Hidratação", "Nutrição", "Hidratação"};
        super.semanaTwo = new String[]{"Hidratação", "Hidratação", "Nutrição"};
        super.semanaTree = new String[] {"Hidratação", "Nutrição", "Hidratação"};
        super.semanaFor = new String[]{"Hidratação", "Nutrição", "Reconstrução"};
    }
}

