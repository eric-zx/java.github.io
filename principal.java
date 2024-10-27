public class principal {
    public static void main(String[]args){
        filme meuFilme = new filme();
        meuFilme.nome = "A lenda";
        meuFilme.anoLancamento = 2015;
        meuFilme.duracaoMinuto = 180;
        meuFilme.exibrFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Soma das notas: "+ meuFilme.SomaDasAvaliacoes);
        System.out.println("Número de avaliações: "+ meuFilme.totalAvaliacao);
        System.out.println("A média do filme foi de: "+ meuFilme.mediaDasAvaliacoes());

    }
}
