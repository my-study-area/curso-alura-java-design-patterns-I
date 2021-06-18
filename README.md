# curso-alura-java-design-patterns-I
Curso de Design Patterns em Java I: Introdução às boas práticas de programação

## Módulo 01 - Strategy

### Aula 01.01 - Apresentação
- Padrão de Projeto é uma soução para um problema recorrente ao utilizar o paradigma da orientação a objetos.
- Design Patterns: Elements of reusable Object-Oriented Software (1994) é o livro de referência do curso. Foi escrito por quatro autores, conhecidos por GoF (Gang of Four).
- Os padrões de projetos, no livro, são divididos em 3 categorias: `criacionais`, `estruturais` e `comportamentais`.
- No curso serão apresentados alguns padrões da categoria `comportamental`: `Strategy`, `Chain of Reposability`, `Template Method`, `State`, `Command` e `Observer`.

### Aula 01.02 - Criando o projeto

### Aula 01.03 - Calculando impostos

### Aula 01.04 - Aplicando o pattern Strategy

### Aula 01.05 - Propósito do pattern Strategy
Todos os padrões de projeto definidos pela **Gang of Four (GoF)** possuem uma motivação: resolver um problema recorrente.

Que tipo de problema o padrão Strategy visa resolver?

`R:` A existência de diversos algoritmos para uma ação, resultando na possibilidade de vários ifs. Este padrão pode ser utilizado quando há diversos possíveis algoritmos para uma ação (como calcular imposto, por exemplo). Nele, nós separamos cada um dos possíveis algoritmos em classes separadas.

### Aula 01.06 - Para saber mais: Strategy

Todo padrão de projeto possui sua explicação teórica com motivação, aplicação, seus participantes, consequências, etc.

O livro Padrões de Projeto - Soluções reutilizáveis de software orientado a objetos é um catálogo para todos estes padrões, com todas as explicações necessárias.

Caso não possa (ou não queira) ler o livro, existem sites que resumem cada um dos padrões. [ Aqui está um que é bastante utilizado, já na página específica sobre o Strategy](https://refactoring.guru/design-patterns/strategy).

### Aula 01.07 - Faça como eu fiz

### Aula 01.08 - O que aprendemos?
- Padrões de projeto são soluções genéricas para problemas recorrentes do desenvolvimento de software orientado a objetos;
- Existem três principais categorias de padrões de projeto:
  - Comportamentais (que serão vistos neste treinamento)
  - Estruturais
  - Criacionais
-  Como diminuir a complexidade do nosso código, trocando múltiplas condicionais por classes: esta técnica é chamada de `Strategy`, que é um dos padrões de projeto.

## Módulo 02 - Chain of Resonsability

### Aula 02.01 - Projeto da aula anterior

### Aula 02.02 - Calculando descontos

### Aula 02.03 - Calculando descontos

### Aula 02.04 - Muitos ifs
Em diversas ocasiões, o instrutor cita que ter diversos if pode ser um problema, e que ter uma classe que "pode crescer para sempre" também é um problema.

Qual o problema real deste cenário, onde uma classe tem muitos if ou pode crescer para sempre?

`R:` Se eu precisar editar um pedaço de código, para implementar uma nova funcionalidade, as chances de quebrar funcionalidades existentes são grandes. Sempre que uma nova funcionalidade for implementada, o ideal é que possamos criar código novo e editar o mínimo possível de código já existente. Este é um dos principais pontos do princípio Aberto-Fechado (Open-Closed Principle) do SOLID. Ao editar código existente, podemos acabar quebrando funcionalidades já implementadas e funcionais.

### Aula 02.05 - Aplicando o pattern Chain of Responsibility

### Aula 02.06 - Entendendo o pattern Chain of Responsibility

### Aula 02.07 - Para saber mais: Chain of Responsibility
Assim como qualquer outro conceito em computação, existe mais de uma forma de implementar o padrão de projeto Chain of Responsibility.

Para saber mais sobre a parte teórica deste padrão, e analisar diferentes implementações, você pode conferir este link:

[https://refactoring.guru/design-patterns/chain-of-responsibility](https://refactoring.guru/design-patterns/chain-of-responsibility).

### Aula 02.08 - Faça como eu fiz

### Aula 02.09 - O que aprendemos?
- A diferenciar casos onde padrões semelhantes podem ser aplicados;
- Como criar uma cadeia de possíveis algoritmos como `Chain of Responsibility`;
- A utilizar o padrão para aplicar um desconto dentro de uma cadeia de possíveis descontos.

## Módulo 03 - Template Method

### Aula 03.01 - Projeto da aula anterior

### Aula 03.02 - Aplicando o pattern Template Method

### Aula 03.03 - Pattern Template Method
Aplicamos o pattern Template Method com a criação de um método concreto na classe “mãe”, que chama métodos abstratos implementados nas classes _“filhas”_

Qual a principal vantagem da utilização desse padrão?

`R:` Reaproveitar trechos de códigos comuns, evitando duplicações. O padrão `Template Method` favorece o reaproveitamento de códigos comuns entre classes, evitando assim duplicações de códigos.

### Aula 03.04 - Entendendo o pattern Template Method

### Aula 03.05 - Para saber mais: Template Method
As aplicações do padrão `Template Method` são muitas, mas além de entender a parte prática, é muito importante ler sobre a teoria por trás do padrão.

Para entendê-lo melhor, você pode conferir este link: [https://refactoring.guru/design-patterns/template-method](https://refactoring.guru/design-patterns/template-method).

### Aula 03.06 - Faça como eu fiz

### Aula 03.06 - O que aprendemos?
- Reforçamos a ideia de que repetição de código é problemática;
- Criamos um template de algoritmo que estava sendo replicado em mais de uma classe e utilizamos herança para reaproveitar esse código:
  - Aprendemos que a esta técnica foi dado o nome de Template Method;
- Vimos que é possível aplicar mais de um padrão no mesmo código.

## Módulo 04 - State

### Aula 04.01 - Projeto da aula anterior

### Aula 04.02 - Adicionando a situação do orçamento

### Aula 04.03 - Aplicando o pattern State

### Aula 04.04 - Pattern State
Vimos que o padrão State resolve um problema muito parecido com um problema resolvido por outro padrão.

Que outro padrão seria esse?

`R:` O padrão `State`, assim como o padrão `Strategy`, resolve o problema de muitos ifs no código.

### Aula 04.05 - Entendendo o pattern State

### Aula 04.06 - Para saber mais: State
Para que você entenda melhor como aplicar o padrão State em outras situações, é interessante conhecer toda sua parte teórica, como motivação, aplicações, etc.

Para isso, você pode conferir este link: [https://refactoring.guru/design-patterns/state](https://refactoring.guru/design-patterns/state).

### Aula 04.07 - Faça como eu fiz

### Aula 04.08 - O que aprendemos?
- Que é possível que um objeto se comporte de formas diferentes, dependendo do seu estado;
- Que, se o resultado de uma chamada de método depende do estado, podemos delegar esta ação para uma classe específica do estado atual.
- Aprendemos que a esta técnica foi dado o nome de `State`.

## Módulo 05 - Command

### Aula 05.01 - Projeto da aula anterior

### Aula 05.02 - Gerando um pedido

### Aula 05.03 - Aplicando o pattern Command

### Aula 05.04 - Problemas com o código
O código criado até aqui é comumente encontrado em sistemas reais. A diferença é que, ao invés de estar em um arquivo rodado na CLI, está em algum Controller ou algo do tipo.

Qual o problema de ter um código arquitetado assim, recebendo os dados e executando todas as tarefas no mesmo local?

`R:` Se fosse necessário executar o mesmo fluxo de outro lugar (web, API, filas), o código precisaria ser duplicado. Da forma como o código foi organizado, se precisássemos, além de executar a geração de pedido através da CLI, também executar através de um formulário web, uma API e/ou mensagens de uma fila, precisaríamos duplicar todo este código em vários lugares.

### Aula 05.05 - Command Handlers

### Aula 05.06 - Para saber mais: Command
O padrão de projetos **Command** é, provavelmente, um dos que mais gera confusão, principalmente no mundo de desenvolvimento web em geral, já que alguns conceitos mais específicos pro mundo da web surgiram.

Para você entender melhor sobre o padrão _Command_ "original" (definido no livro da **GoF**), você pode dar uma olhada nesse link: [https://refactoring.guru/design-patterns/command](https://refactoring.guru/design-patterns/command).

Também é muito interessante o estudo de alguns padrões de arquitetura de software, como **Domain Driven Design** e **Clean Architecture**, pois você vai esbarrar no padrão de _Command Handlers_ (que foi aplicado de forma bem simples nesta aula).

### Aula 05.07 - Faça como eu fiz

### Aula 05.08 - O que aprendemos?
- Que um caso de uso em nossa aplicação pode ter várias ações (salvar no banco, enviar e-mail, etc);
- Que um caso de uso deve ser extraído para uma classe específica, ao invés de estar no arquivo da CLI, controller ou algo do tipo;
- Que a técnica de extração do caso de uso para uma classe específica pode ser chamada de padrão _Command_;
- A diferença do padrão _Command_ da GoF para o padrão que utiliza _Command Handler_ (muito utilizado no padrão de arquitetura Domain Driven Design).

## Módulo 06 - Observer

### Aula 06.01 - Projeto da aula anterior

### Aula 06.02 - Ações após gerar um pedido

### Aula 06.03 - Muitas responsabilidades
Um **Command Handler** tem como responsabilidade, normalmente, apenas orquestrar as tarefas a serem executadas, ou seja, chamar as classes necessárias que realizam as tarefas desejadas. No nosso caso, o **Command Handler** tinha todo o código do fluxo em seu corpo.

Por quais motivos separar cada uma das tarefas em classes distintas é benéfico?

`R:` Porque, com classes menores e mais concisas, é mais fácil encontrar possíveis problemas. Se em algum momento uma das tarefas parar de funcionar, nós sabemos que há uma classe específica para este propósito e podemos começar a depuração por ela.

`R:` Porque a implementação de cada tarefa pode mudar com o tempo e o Command Handler não deve precisar saber disso. Imagine que a ferramenta utilizada para enviar e-mails mude depois de alguns anos. O nosso Command Handler não precisa saber deste detalhe específico, então é interessante que cada classe seja responsável apenas por uma pequena tarefa.
