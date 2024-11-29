public class ExecMusica {
    public static void main(String[] args) {
        Musica dadosMusica = new Musica();
        dadosMusica.avaliaSom(10);
        dadosMusica.avaliaSom(5);
        dadosMusica.anoLancamento = 2005;
        dadosMusica.tituloArtista = "Guns n Roses";

        dadosMusica.calculaMedia();
        dadosMusica.exibeFichaTecnica();
        System.out.println(dadosMusica.calculaMedia());
    }
}
