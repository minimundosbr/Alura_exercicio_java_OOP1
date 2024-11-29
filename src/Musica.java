public class Musica {
    String tituloArtista;
    int anoLancamento = 0;
    double somaAvaliacao = 0;
    int numAvaliacao = 0;

    void exibeFichaTecnica(){
        System.out.println("O ano de lançamento é: " + anoLancamento);
        System.out.println("O título do artista é: " + tituloArtista);
    }
    void avaliaSom(double nota){
        somaAvaliacao += nota;
        numAvaliacao++;
    }

    double calculaMedia(){
        return somaAvaliacao / numAvaliacao;
    }

}
