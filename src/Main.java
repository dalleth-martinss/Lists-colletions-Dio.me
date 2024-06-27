public class Main {
    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("tarefa 3");
        listaTarefa.adicionarTarefa("Tarefa 4");
        listaTarefa.adicionarTarefa("Tarefa 5");
        listaTarefa.adicionarTarefa("tarefa 6");
        listaTarefa.adicionarTarefa("Tarefa 7");
        listaTarefa.adicionarTarefa("Tarefa 8");
        System.out.println("Agora o números de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removertarefa("Tarefa 1");
        System.out.println("Depois da remoção das tarefas 1, ficamos com: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricaoTarefas();

    }
}