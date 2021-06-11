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
