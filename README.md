# Estrutura de Dados - Atividade 3 - Universidade Anhembi Morumbi -
Nas estruturas de dados pedidas no enunciado temos os seguintes conceitos de ordenação:

A Lista é ordenada, portanto a ordem em que insiro os elementos será mantida ao usar um laço para iterar sobre os elementos.

Na Pilha temos o conceito LIFO (Last In First Out - Último a entrar, Primeiro a Sair), portando as iterações irão seguir esse conceito.

E na Fila usamos o FIFO (First In First Out - Primeiro a entrar, Primeiro a Sair), o que também será respeitado ao iterar sobre está estrutura.

Portanto, na nossa ordem primeiro passamos por uma Lista, depois colocamos os elementos dessa Lista em ordem em uma Pilha, esvaziando a Lista e depois os colocamos em uma Fila, esvaziando a Pilha. 

No final a Fila terá 10 celulas com a sua saida nessa ordem:
>5, 4, 3, 2, 1, 10, 9, 8, 7, 6. 

Isso ocorre porque primeiro foram inseridos na Fila na ordem de saída da Pilha os números de 1 a 5 e depois na ordem de saída da Pilha os números de 6 a 10. Ou seja, foram inseridos os números invertidos de 1 a 5, e depois de novamente inverter os números de 6 a 10, foram inseridos estes números depois do último elemento da primeira inserção que era o 1.

segue a impressão do codigo:

```
Número de celulas da lista: 5
Números na lista: 
1 2 3 4 5 

Número de celulas da pilha e removendo dados anteriores: 5
Números na pilha: 
5 4 3 2 1 

Número de celulas da fila e removendo dados anteriores: 5
Números na fila: 
5 4 3 2 1 

Número de celulas da lista: 5
Números na lista: 
6 7 8 9 10 

Número de celulas pilha e removendo dados anteriores: 5
Números na pilha: 
10 9 8 7 6 

O tamanho final da minha fila será de: 10
Números na fila em ordem depois de todas as inserções: 
5 4 3 2 1 10 9 8 7 6 
```

**REFERENCIAS/FONTES:**

[Como criar métodos GET e SET](https://www.devmedia.com.br/criando-metodos-get-e-set-em-java/24623#:~:text=Os%20m%C3%A9todos%20GET%20e%20SET,usado%20para%20acesso%20ao%20atributo.)

[Trabalhando com filas em Java](https://www.dio.me/articles/trabalhando-com-filas-em-java)

[Aula 20 - Pilha - Estruturas de Dados com Java](https://www.youtube.com/watch?v=9Brb1ef1_N4)
