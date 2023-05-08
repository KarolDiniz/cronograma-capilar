package model;

import enums.Estado;

public class AnaliseCapilar {

	private Cabelo cabelo;
	private Tratamento tratamento;
	private int nutricao = 0, hidratacao = 0, reconstrucao = 0;

    public AnaliseCapilar(Cabelo cabelo) {
        this.cabelo = cabelo;
        this.analise();
        this.cronograma();
    }

    public void analise(){


        if(cabelo.getElastico()) { reconstrucao += 1; }

        switch (cabelo.getOleosidade()){
            case SECO:
                nutricao += 1;
                break;
            case MISTO:
                hidratacao += 1;
                break;
        }

        if (cabelo.getEstado().equals(Estado.ARMADO) || cabelo.getEstado().equals(Estado.SEM_BRILHO) || cabelo.getEstado().equals(Estado.RESSECADO)) {
            hidratacao += 1; }
        if (cabelo.getEstado().equals(Estado.FRIZ) || cabelo.getEstado().equals(Estado.DESALINHADO) || cabelo.getEstado().equals(Estado.QUEDA)){
            nutricao += 1; }
        if (cabelo.getEstado().equals(Estado.PONTAS_DUPLAS) || cabelo.getEstado().equals(Estado.QUEBRADICO) || cabelo.getEstado().equals(Estado.RALO)){
            reconstrucao += 1;}

        switch (cabelo.getPorosidade()){
            case BAIXA:
                hidratacao += 1;
                break;
            case MÉDIA:
                nutricao += 1;
                break;
            case ALTA:
                reconstrucao += 1;
        }
    }

    public void cronograma(){

            if (nutricao > reconstrucao && nutricao > hidratacao){
               tratamento = new TratamentoCabeloPoucoDanificado();
            } else if (hidratacao > reconstrucao && hidratacao > nutricao) {
                tratamento = new TratamentoCabeloPoucoDanificado();
            } else {
                tratamento = new TratamentoCabeloPoucoDanificado();

            }
    }

	public Tratamento getTratamento() {
		return tratamento;
	}    
    
}
