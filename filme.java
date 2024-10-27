public class filme {
    String nome;
    int anoLancamento;
    boolean pertencePlano;
    double SomaDasAvaliacoes;
    int totalAvaliacao;
    int duracaoMinuto;


    void exibrFichaTecnica(){
        System.out.println("Nome: " + nome);
        System.out.println("Ano: " + anoLancamento);

    }
    void avalia(double nota){
        SomaDasAvaliacoes += nota;

        totalAvaliacao ++;
    }

    double mediaDasAvaliacoes(){
        return SomaDasAvaliacoes / totalAvaliacao;
    }
}
