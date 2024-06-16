/**
 * Classe que representa um jogador no quiz.
 * Mantém o nome e a pontuação do jogador durante o jogo.
 * 
 * @author lucas, gabriel, carol, camila e otavio
 */
public class Jogador {
    private String nome; // Nome do jogador
    private int pontuacao; // Pontuação atual do jogador

    /**
     * Construtor que cria um novo jogador com um nome especificado.
     * A pontuação inicial é definida como zero.
     * 
     * @param nome O nome do jogador.
     */
    public Jogador(String nome) {
        this.nome = nome;
        this.pontuacao = 0;
    }

    /**
     * Incrementa a pontuação do jogador em um ponto.
     */
    public void incrementarPontuacao() {
        pontuacao++;
    }

    /**
     * Retorna a pontuação atual do jogador.
     * 
     * @return A pontuação do jogador.
     */
    public int getPontuacao() {
        return pontuacao;
    }

    /**
     * Retorna o nome do jogador.
     * 
     * @return O nome do jogador.
     */
    public String getNome() {
        return nome;
    }
}
