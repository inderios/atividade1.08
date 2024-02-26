package br.ufpb.dcx.ayla.quiz;

public class PerguntaDissertativa extends Pergunta {
    public PerguntaDissertativa() {
        super("", "");
    }
    public PerguntaDissertativa(String enunciado, String respostaCorreta) {
        super(enunciado, respostaCorreta);
    }
    @Override
    public boolean estahCorretaResposta(String resposta) {
        if (getRespostaCorreta().equalsIgnoreCase(resposta)) {
            return true;
        }
        return false;
    }
}
