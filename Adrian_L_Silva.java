package Atividade_a3;
import java.util.*;

public class Adrian_L_Silva {

	public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();
        Stack<Integer> pilhaNumeros = new Stack<>();
        Queue<Integer> filaNumeros = new LinkedList<>();
        int i;

        //Inserindo os n�meros [1,2,3,4 e 5] na lista
        for (i = 1; i <= 5; i++) {
            listaNumeros.add(i);

        }
        System.out.println("N�mero de celulas da lista: " + listaNumeros.size());
        System.out.println("N�meros na lista: ");
        while(!listaNumeros.isEmpty()){
            //Removendo o pr�ximo elemento da lista e dando para uma vari�vel tempor�ria para armazenar os dados
            int elementoLista = listaNumeros.remove(0);
            //Imprimindo o n�mero da lista na ordem
            System.out.printf("%d ", elementoLista);
            //Adicionando o elemento da lista � pilha na ordem
            pilhaNumeros.push(elementoLista);
        }
        
        
        System.out.println("\n\nN�mero de celulas da pilha e removendo dados anteriores: " + pilhaNumeros.size());

        System.out.println("N�meros na pilha: ");
        while(!pilhaNumeros.isEmpty()) {
            //Removendo o elemento da pilha e dando para uma vari�vel tempor�ria para armazenar os dados
            int elementoPilha = pilhaNumeros.pop();
            //Imprimindo o n�mero da pilha na ordem
            System.out.printf("%d ", elementoPilha);
            //Adicionando o n�mero da piljha � fila na ordem
            filaNumeros.add(elementoPilha);
        }

        //Verificando o n�mero de elementos na Fila
        System.out.println("\n\nN�mero de celulas da fila e removendo dados anteriores: " + filaNumeros.size());
        System.out.println("N�meros na fila: ");

        for(Integer numeroFila: filaNumeros){
            System.out.printf("%d ", numeroFila);
        }

        //Repetindo passos 2 e 3 com os n�meros [6,7,8,9 e 10];
        for (i = 6; i <= 10; i++) {
            listaNumeros.add(i);

        }
        System.out.println("\n\nN�mero de celulas da lista: " + listaNumeros.size());
        System.out.println("N�meros na lista: ");
        while(!listaNumeros.isEmpty()){
            //Removendo o pr�ximo elemento da lista e dando para uma vari�vel tempor�rio
            int elementoLista = listaNumeros.remove(0);
            //Imprimindo o n�mero da lista na ordem
            System.out.printf("%d ", elementoLista);
            //Adicionando o elemento da lista � pilha na ordem
            pilhaNumeros.push(elementoLista);
        }

        System.out.println("\n\nN�mero de celulas pilha e removendo dados anteriores: " + pilhaNumeros.size());
        System.out.println("N�meros na pilha: ");
        while(!pilhaNumeros.isEmpty()) {
            //Removendo o elemento da pilha e dando para uma vari�vel tempor�ria
            int elementoPilha = pilhaNumeros.pop();
            //Imprimindo o n�mero da pilha na ordem
            System.out.printf("%d ", elementoPilha);
            //Adicionando o n�mero da piljha � fila na ordem
            filaNumeros.add(elementoPilha);
        }
        //Imprimindo tamanho da Fila e os elementos da Fila
        System.out.println("\n\nO tamanho final da minha fila ser� de: " + filaNumeros.size());
        System.out.println("N�meros na fila em ordem depois de todas as inser�es: ");
        for(Integer numeroFila : filaNumeros){
            System.out.printf("%d ", numeroFila);
        }

    }
}

