package dio;

// Classe genérica
public class Fila<T> {

    // Referência genérica para o nó de entrada da fila
    private No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null; //inicializa a fila como vazia
    }

    // Método para adicionar um elemento na fila
    public void enqueue(T object) {

        No novoNo = new No(object); // Cria um novo nó com o objeto recebido

        novoNo.setRefNo(refNoEntradaFila); // O novo nó aponta para o nó de entrada atual

        refNoEntradaFila = novoNo; // Atualiza a referência de entrada para o novo nó
    }

    // Método para obter o primeiro elemento da fila sem removê-lo
    public T first() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila; // Começa do nó de entrada com a referencia

            while (true) {// Iterar até encontrar o último nó (primeiro da fila)
                if (primeiroNo.getRefNo() != null) { // Verificar se o nó atual possui um próximo nó
                    primeiroNo = primeiroNo.getRefNo(); // Avança para o próximo nó
                } else {
                    break; // Sai do loop ao chegar no último nó
                }
            }
            return (T) primeiroNo.getObject(); // Retorna o conteúdo do primeiro nó
        }

        return null; // Retorna null se a fila estiver vazia
    }

    // Método para remover e retornar o primeiro elemento da fila
    public T dequeue() {
        if (!this.isEmpty()) {
            // Começa do nó de entrada com a referencia
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;

            while (true) {// Itera até encontrar o último nó (primeiro da fila)
                if (primeiroNo.getRefNo() != null) { // Verificar se o nó atual possui um próximo nó

                    noAuxiliar = primeiroNo;// Atualiza o nó auxiliar
                    primeiroNo = primeiroNo.getRefNo();// Avançar para o próximo nó
                } else {
                    noAuxiliar.setRefNo(null);// Define a referência do nó auxiliar como null, removendo a referencia do próximo nó
                    break;
                }
            }

            return (T) primeiroNo.getObject(); // Retorna o conteúdo do nó removido
        }

        return null; // Retorna null se a fila estiver vazia
    }

    public boolean isEmpty() {

        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";

        No noAuxiliar = refNoEntradaFila; // Começa do nó de entrada
        if (noAuxiliar != null) {

            while (true) { // Itera sobre todos os nós até o final da fila

                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->"; // Adicionar o conteúdo do nó à string de retorno
                if (noAuxiliar.getRefNo() != null) {

                    noAuxiliar = noAuxiliar.getRefNo(); // Avança para o próximo nó
                } else {

                    stringRetorno += "null"; // Finaliza a string com "null"
                    break;
                }
            }
        } else {

            stringRetorno = "null"; // Se a fila estiver vazia, retorna "null"
        }
        return stringRetorno;
    }
}
