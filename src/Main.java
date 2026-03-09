import Documentos.Doc;
import Fabricas.FabricaDoc;
import Fabricas.FabricaPDF;
import Fabricas.FabricaPlanilha;
import Fabricas.FabricaWord;

public class Main {
    public static void main(String[] args) {
        FabricaDoc fabricaPDF= new FabricaPDF();
        FabricaDoc fabricaWord= new FabricaWord();
        FabricaDoc fabricaPlanilha= new FabricaPlanilha();

        Doc doc1= fabricaPDF.criarDoc();
        System.out.println("== TESTE: PDF ==");
        doc1.gerar();

        Doc doc2= fabricaWord.criarDoc();
        System.out.println("== TESTE: Word ==");
        doc2.gerar();

        Doc doc3= fabricaPlanilha.criarDoc();
        System.out.println("== TESTE: Planilha ==");
        doc3.gerar();
    }
}
