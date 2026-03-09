package Documentos;

public class Word implements Doc {
    @Override
    public void gerar() {
        System.out.println("Gerando documento Word ...");
    }
}
