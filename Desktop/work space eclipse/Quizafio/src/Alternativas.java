

import java.util.*;

/**
 * Classe que representa as alternativas de resposta para uma pergunta do quiz.
 * Armazena uma lista de opções de resposta.
 */
public class Alternativas {
    private List<String> opcoes; // Lista de opções de resposta

    /**
     * Construtor que cria um novo conjunto de alternativas com as opções fornecidas.
     * 
     * @param opcoes Uma lista de strings representando as opções de resposta.
     */
    public Alternativas(List<String> opcoes) {
        this.opcoes = new ArrayList<>(opcoes);
    }

    /**
     * Retorna a lista de opções de resposta.
     * 
     * @return Uma lista de strings com as opções de resposta.
     */
    public List<String> getOpcoes() {
        return new ArrayList<>(opcoes);
    }
}