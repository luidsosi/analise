package visitor;

public class ExibirPreOrderVisitor implements ArvoreVisitor{

	@Override
    public void visitar(No no) {
        if (no == null)
            return;
        System.out.println(no);
        this.visitar(no.getEsquerdo());
        this.visitar(no.getDireito());
    }

}
