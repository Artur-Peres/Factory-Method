package Fabricas;

import Documentos.Doc;
import Documentos.PDF;

public class FabricaPDF extends FabricaDoc {
    @Override
    public Doc criarDoc() {
        return new PDF();
    }
}
