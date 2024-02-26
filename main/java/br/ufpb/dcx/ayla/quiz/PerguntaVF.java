package br.ufpb.dcx.ayla.quiz;

public class PerguntaVF extends Pergunta {
    private String afirmativa;
    public PerguntaVF(String enunciado, String afirmativa, String respostaCorreta) {
        super(enunciado, respostaCorreta);
        this.afirmativa = afirmativa;
    }
    public PerguntaVF(){
        super("", "");
        this.afirmativa = "";
    }
    @Override
    public boolean estahCorretaResposta(String resposta) {
        if (resposta.equalsIgnoreCase(this.afirmativa)) {
            return true;
        }
        return false;
    }
}
