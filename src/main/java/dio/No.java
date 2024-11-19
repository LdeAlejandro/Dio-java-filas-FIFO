package dio;

// Classe genérica que representa um nó em uma estrutura encadeada
public class No<T> {

    // Armazena o conteúdo do nó (genérico, pode ser qualquer tipo)
    private T object;

    // Referência para o próximo nó
    private No<T> refNo;

    public No() {
    }

    public No(T object) {
        this.refNo = null; // Por padrão, o próximo nó é nulo
        this.object = object;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    public Object getObject() {
        return object;
    }

    // Define o objeto armazenado no nó
    public void setObject(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object + // Mostra o conteúdo armazenado
                ", refNo=" + refNo + // Mostra a referência do próximo nó
                '}';
    }
}
