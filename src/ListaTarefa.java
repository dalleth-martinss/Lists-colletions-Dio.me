import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList; //Atribute
                                                            //toda vez que eu intanciar o objeto ListaTarefa - vou ter automaticamente 1 atributo taferaList
                                                            // e uma lista vazia.
    public ListaTarefa() {
        this.tarefaList = new ArrayList< >();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }


    public void removertarefa(String descricao){             // Metodo remove =>Vai remover uma tarefa a partir a descrição da mesma e Essa tarefa está dentro da Lista de tarefaList;
        List<Tarefa> tarefasParaRemover = new ArrayList<>(); // lista vazia=> recebe as tarefas que vao ser removidas;
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);

            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){                      //Nos retorna o tamanho da lista;
        return tarefaList.size();
    }
    public void obterDescricaoTarefas(){                       //Nos retorno a descrição das Tarefas;
        System.out.println(tarefaList);

    }
}
