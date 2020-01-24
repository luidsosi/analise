package visitor;

public class ExibirPostOrderVisitor implements ArvoreVisitor{

	@Override
    public void visitar(No no) {
        if (no == null)
            return;
        this.visitar(no.getEsquerdo());
        this.visitar(no.getDireito());
        System.out.println(no);
    }
}
