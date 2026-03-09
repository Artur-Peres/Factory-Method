package Documentos;

public class PDF implements Doc {
    @Override
    public void gerar() {
        System.out.println("Gerando documento PDF ...");
    }
}
