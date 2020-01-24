package visitor;

public class ArvoreBinaria {
	No raiz;
    int quantidadeDeElementos;
 
    public ArvoreBinaria(int chaveRaiz) {
        raiz = new No(chaveRaiz);
        quantidadeDeElementos = 0;
    }
 
    public void inserir(int chave) {
    	inserir(raiz, chave);
    }
    
    private void inserir(No no, int chave) {
    	if (no.chave > chave) {
			if(no.getEsquerdo() == null) no.setEsquerdo(new No(chave)); 
			else inserir(no.getEsquerdo(), chave); 
		} else {
			if(no.getDireito() == null) no.setDireito(new No(chave)); 
			else inserir(no.getDireito(), chave);
		}
    	quantidadeDeElementos++;
    }
 
    public void aceitarVisitante(ArvoreVisitor visitor) {
        visitor.visitar(raiz);
    }
}
