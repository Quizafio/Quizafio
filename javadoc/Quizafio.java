import java.util.*;
/**
 * Classe principal do jogo de quiz sobre o universo de Harry Potter.
 * Permite ao jogador responder perguntas e acumular pontos.
 * 
 * @author lucas, gabriel, carol, camila e otavio
 */
public class Quizafio {

    /**
     * Método principal que executa o jogo.
     * 
     * Inicializa o scanner, cria perguntas e processa respostas do jogador.
     * 
     * @param args Argumentos de linha de comando (não utilizados).
     */

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in, "ISO-8859-1")) {
            // Jogador escolhe o nome
            System.out.print("Digite o nome do jogador: ");
            String nomeJogador = scanner.nextLine();
            Jogador jogador = new Jogador(nomeJogador);
            
            List<Pergunta> perguntas = new ArrayList<>();
            // Lista de Perguntas

            List<String> opcoes1 = new ArrayList<>();
            // Primeira pergunta e suas opções
            opcoes1.add("a) Empurrar um objeto");
            opcoes1.add("b) Congelar uma pessoa");
            opcoes1.add("c) Abrir uma porta");
            opcoes1.add("d) Acender uma luz");
            Alternativas alternativas1 = new Alternativas(opcoes1);
            perguntas.add(new Pergunta("Para que se usa o feitico Alohomora?", alternativas1, 3));
            
            List<String> opcoes2 = new ArrayList<>();
            opcoes2.add("a) A mulher gorda");
            opcoes2.add("b) O Barao Sangrento");
            opcoes2.add("c) O frade gordo");
            opcoes2.add("d) A dama Cinzenta");
            Alternativas alternativas2 = new Alternativas(opcoes2);
            perguntas.add(new Pergunta("Quem guarda a entrada da sala comunal de Griffinoria?", alternativas2, 1));
             // Segunda pergunta e suas opções
            List<String> opcoes3 = new ArrayList<>();
            opcoes3.add("a) Dumbledore");
            opcoes3.add("b) Olho-Tonto Moody");
            opcoes3.add("c) Professor Snape");
            opcoes3.add("d) Dobby");
            Alternativas alternativas3 = new Alternativas(opcoes3);
            perguntas.add(new Pergunta("Quem deu a Harry Potter a capa da Invisibilidade?", alternativas3, 1));
            
            List<String> opcoes4 = new ArrayList<>();
            opcoes4.add("a) Nagini, Capa da Invisibilidade, Varinha das Varinhas");
            opcoes4.add("b) Capa da Invisibilidade, Nagini, Diadema de Ravenclaw");
            opcoes4.add("c) Varinha das Varinhas, Pedra da Ressurreicao, Capa da Invisibilidade");
            opcoes4.add("d) Diario de Tom Riddle, Pedra da Ressurreicao, Varinha das Varinhas");
            Alternativas alternativas4 = new Alternativas(opcoes4);
            perguntas.add(new Pergunta("Quais sao as tres reliquias da morte?", alternativas4, 3));
            
            List<String> opcoes5 = new ArrayList<>();
            opcoes5.add("a) Oito e um quarto");
            opcoes5.add("b) Nove e tres quartos");
            opcoes5.add("c) Cinco e meio");
            opcoes5.add("d) Onze");
            Alternativas alternativas5 = new Alternativas(opcoes5);
            perguntas.add(new Pergunta("De qual plataforma de Kings Cross sai o Expresso de Hogwarts?", alternativas5, 2));
            
            List<String> opcoes6 = new ArrayList<>();
            opcoes6.add("a) Patronia Paternus");
            opcoes6.add("b) Expelliarmus Patronica");
            opcoes6.add("c) Expecto Patronum");
            opcoes6.add("d) Accio Patronum");
            Alternativas alternativas6 = new Alternativas(opcoes6);
            perguntas.add(new Pergunta("Como voce invoca um Patrono? ", alternativas6, 3));
            
            List<String> opcoes7 = new ArrayList<>();
            opcoes7.add("a) Ravenclaw");
            opcoes7.add("b) Grifinoria");
            opcoes7.add("c) Sonserina");
            opcoes7.add("d) Lufa-Lufa");
            Alternativas alternativas7 = new Alternativas(opcoes7);
            perguntas.add(new Pergunta("Qual casa valoriza a bravura, a ousadia e o cavalheirismo?", alternativas7, 2));
            
            List<String> opcoes8 = new ArrayList<>();
            opcoes8.add("a) Um meio-gigante");
            opcoes8.add("b) Uma cabeca encolhida");
            opcoes8.add("c) Um cavalo alado invisivel");
            opcoes8.add("d) Uma duende");
            Alternativas alternativas8 = new Alternativas(opcoes8);
            perguntas.add(new Pergunta("O que e um testralio?", alternativas8, 3));
            
            List<String> opcoes9 = new ArrayList<>();
            opcoes9.add("a) A cozinha de Hogwarts");
            opcoes9.add("b) A sala precisa");
            opcoes9.add("c) A Sala Comunal da Grifinoria");
            opcoes9.add("d) O banheiro da Geme Murta");
            Alternativas alternativas9 = new Alternativas(opcoes9);
            perguntas.add(new Pergunta("Onde Hermione prepara seu primeiro lote de Pocao Polissuco?", alternativas9, 4));
            
            List<String> opcoes10 = new ArrayList<>();
            opcoes10.add("a) Reducto");
            opcoes10.add("b) Crucio");
            opcoes10.add("c) Confrigo");
            opcoes10.add("d) Diffindo");
            Alternativas alternativas10 = new Alternativas(opcoes10);
            perguntas.add(new Pergunta("Qual feitico e uma das Maldicoes Imperdoaveis? ", alternativas10, 2));
            
            List<String> opcoes11 = new ArrayList<>();
            opcoes11.add("a) Sirius Black");
            opcoes11.add("b) Remo Lupin");
            opcoes11.add("c) Severo Snape");
            opcoes11.add("d) Hagrid");
            Alternativas alternativas11 = new Alternativas(opcoes11);
            perguntas.add(new Pergunta("Quem e o padrinho de Harry Potter?", alternativas11, 1));
            
            List<String> opcoes12 = new ArrayList<>();
            opcoes12.add("a) Dobby");
            opcoes12.add("b) Kreacher");
            opcoes12.add("c) Winky");
            opcoes12.add("d) Hokey");
            Alternativas alternativas12 = new Alternativas(opcoes12);
            perguntas.add(new Pergunta("Qual e o nome do elfo domestico que serve a familia Malfoy?", alternativas12, 1));
            
            List<String> opcoes13 = new ArrayList<>();
            opcoes13.add("a) 3");
            opcoes13.add("b) 7");
            opcoes13.add("c) 9");
            opcoes13.add("d) 6");
            Alternativas alternativas13 = new Alternativas(opcoes13);
            perguntas.add(new Pergunta("Quantas Horcruxes Voldemort criou?", alternativas13, 2));
            
            List<String> opcoes14 = new ArrayList<>();
            opcoes14.add("a) Um javali");
            opcoes14.add("b) Uma fenix");
            opcoes14.add("c) Um tigre");
            opcoes14.add("d) Um cervo");
            Alternativas alternativas14 = new Alternativas(opcoes14);
            perguntas.add(new Pergunta("Qual o patrono de Harry Potter?", alternativas14, 4));
            
            List<String> opcoes15 = new ArrayList<>();
            opcoes15.add("a) Draco Malfoy");
            opcoes15.add("b) Bellatrix Lestrange");
            opcoes15.add("c) Severo Snape");
            opcoes15.add("d) Lord Voldemort");
            Alternativas alternativas15 = new Alternativas(opcoes15);
            perguntas.add(new Pergunta("Quem matou Dumbledore?", alternativas15, 3));
             
            // Embaralha a lista de perguntas para aleatoriedade
            Collections.shuffle(perguntas);

            // Itera sobre cada pergunta da lista
            for (Pergunta pergunta : perguntas) {
                // Exibe a pergunta e as opções de resposta
                System.out.println(pergunta.getTextoPergunta());
                for (String alternativa : pergunta.getAlternativas().getOpcoes()) {
                    System.out.println(alternativa);
                }
                
                // Solicita ao jogador para escolher uma alternativa correta ou desistir
                System.out.print("Escolha a alternativa correta ou digite 'desistir': ");
                String resposta = scanner.next().toLowerCase();

                // Verifica se o jogador desistiu
                if (resposta.equals("desistir")) {
                    System.out.println("Voce desistiu!");
                    break;
                }
                
                // Verifica se a resposta está correta e atualiza a pontuação do jogador
                char respostaChar = resposta.charAt(0);
                if (respostaChar == 'a' + pergunta.getResposta() - 1) {
                    System.out.println(pergunta.getRespostaC());
                    jogador.incrementarPontuacao();
                } else {
                    System.out.println(pergunta.getRespostaE());
                }
            }

            // Exibe a pontuação final do jogador
            System.out.println("Pontuacao final de " + jogador.getNome() + ": " + jogador.getPontuacao());

            // Determina se o jogador é um 'bruxo' ou um 'trouxa' com base na pontuação
            if (jogador.getPontuacao() >= 11) {
                System.out.println("Parabéns! Você é um(a) verdadeiro(a) bruxo(a)!");
            } else {
                System.out.println("Você é apenas mais um(a) trouxa!");
            }
        }
    }
}
