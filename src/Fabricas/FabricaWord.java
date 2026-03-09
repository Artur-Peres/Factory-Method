package Fabricas;

import Documentos.Doc;
import Documentos.Word;

public class FabricaWord extends FabricaDoc {
    @Override
    public Doc criarDoc() {
        return new Word();
    }
}
