package com.mycompany.main;

public class Celula implements Imprimivel {

    private String nuvem = "oOo";
    private String conteudo;
    private boolean tiro;

    public String getNuvem() {
        return nuvem;
    }

    public void setNuvem(String nuvem) {
        this.nuvem = nuvem;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public boolean isTiro() {
        return tiro;
    }

    public void setTiro(boolean tiro) {
        this.tiro = tiro;
    }
    
    

    public Celula() {
	setTiro(false);
	setConteudo("~~~");
    }

    
    public void imprimir() {
	System.out.print(getConteudo());
    }

    public void imprimirAuxiliar() {
	if (tiro)
            System.out.print(getConteudo());
	else
            System.out.print(getNuvem());
	}
}