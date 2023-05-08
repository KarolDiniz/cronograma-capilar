package model;

public class TratamentoCabeloDanificado extends Tratamento{
    public TratamentoCabeloDanificado(){
        setCronograma();
        System.out.println(super.toString());
    }
    public void setCronograma(){
        super.semanaOne = new String[]{"Hidratação", "Nutrição", "Reconstrução"};
        super.semanaTwo = new String[]{"Nutriçao", "Hidratação", "Nutrição"};
        super.semanaTree = new String[] {"Hidratação", "Nutrição", "Reconstrução"};
        super.semanaFor = new String[]{"Hidratação", "Hidratação", "Nutrição"};
    }
}
