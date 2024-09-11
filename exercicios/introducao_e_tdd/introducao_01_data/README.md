# Enunciado - Classe Data

Utilizando testes unitários com JUnit e a metodologia de TDD, desenvolva uma classe Data que possua os seguintes métodos:

```java
public Data(int ano, int mes, int dia)
public Data()                      // hoje
public int getDia(), getMes(), getAno()
public void adicionaDias(int dias) // avanca a data em dias
public int diasNoMes()
public String diaDaSemana()        // ex. "Segunda-feira"
public boolean eAnoBisexto()
public void proximoDia()           // avanca um dia
public String porExtenso()         // exibe a data por extenso
```

*   Obedeça ao princípio da ocultação de informações.
*   Desenvolva uma classe **Aplicacao** para ilustrar o funcionamento da classe **Data**.
*   Desenhe a classe Data na notação **UML**.
*   A lógica dos métodos deve ser desenvolvida por você e não deve ser utilizada a API do Java.
*   Faça o uso adequado de atributos estáticos e finais.