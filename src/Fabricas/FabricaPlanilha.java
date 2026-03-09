package Fabricas;

import Documentos.Doc;
import Documentos.Planilha;

public class FabricaPlanilha extends FabricaDoc {
    @Override
    public Doc criarDoc() { return new Planilha(); }
}
