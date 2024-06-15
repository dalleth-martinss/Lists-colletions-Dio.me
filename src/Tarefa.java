public class Tarefa {
    //Atribute
    private String descricao;

    // constructor => inicia o objto
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}