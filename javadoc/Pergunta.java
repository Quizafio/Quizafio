/**
 * Classe que representa uma pergunta no quiz.
 * Armazena o texto da pergunta, as alternativas e a resposta correta.
 */
public class Pergunta {
    private String textoPergunta; // O texto da pergunta
    private Alternativas alternativas; // As alternativas de resposta
    private int respostaCorreta; // O índice da resposta correta

    /**
     * Construtor que cria uma nova pergunta com texto, alternativas e resposta correta.
     * 
     * @param textoPergunta O texto da pergunta.
     * @param alternativas As alternativas de resposta.
     * @param respostaCorreta O índice da resposta correta.
     */
    public Pergunta(String textoPergunta, Alternativas alternativas, int respostaCorreta) {
        this.textoPergunta = textoPergunta;
        this.alternativas = alternativas;
        this.respostaCorreta = respostaCorreta;
    }

    /**
     * Retorna o texto da pergunta.
     * 
     * @return O texto da pergunta.
     */
    public String getTextoPergunta() {
        return textoPergunta;
    }

    /**
     * Retorna as alternativas de resposta para a pergunta.
     * 
     * @return As alternativas de resposta.
     */
    public Alternativas getAlternativas() {
        return alternativas;
    }

    /**
     * Retorna o índice da resposta correta para a pergunta.
     * 
     * @return O índice da resposta correta.
     */
    public int getResposta() {
        return respostaCorreta;
    }
    
    /**
     * Retorna uma mensagem indicando que a resposta está correta.
     * 
     * @return Uma mensagem de sucesso.
     */
    public String getRespostaC(){
        return "Resposta correta!";
    }
    
    /**
     * Retorna uma mensagem indicando que a resposta está incorreta.
     * 
     * @return Uma mensagem de erro.
     */
    public String getRespostaE(){
        return "Resposta incorreta!";
    }
}
