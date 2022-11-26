###Creational Pattern

São implementações que tratam sobre construção de algum objeto. Esse grupo sustenta o princípio do SOLID que diz para
programar para interfaces e não para implementações.

###Strutural Pattern  

Esse grupo vai tratar de estrtuturas que tem uma relação de como os objetos interagem entre si, no caso do Factory
Method que é um objeto principal que conversa com subobjetos que são utilizados dentro do principal, formando assim
uma complexidade que se torna abstrata e fácil para o usuário.

###Behavioral Pattern  

Bahavioral é a comunicação entre objetos, a maneira como os objetos se relacionam entre si, utilizando como exemplo
o Strategy que gera interfaces e implementções que facilita e encapsula a criação de novos objetos.

###Strategy - Behavioral Pattern

O código proposto nessa APS mostra uma implementação do Strategy, onde possuímos um problema: um imposto que diverge
de estado para estado que será resolvido com um propósito. A princípio a construção seria feita utilizando um if else
para verificarmos qual estado estamos utilizando e assim verificar qual o valor do imposto, porém com o crescimento vem
o problema: a cada nova inclusão de estado será acrescentado um novo if else no final, fazendo o código ficar cada vez
maior, gerando uma espécie de "super classe".
O padrão citado consiste em Strategy: uma interface que servirá como molde para todas as outras, ConcreteStrategy:
implementa a interface e ser como classe abstrata, Context: acessa a implementação das interfaces e acessa seus métodos.
Portanto, nesse caso ao implementarmos um novo imposto criaríamos uma classa que implementaria a interface e apenas
passaríamos essa class para o Context, que por sua vez implementaria isso. Com isso, mesmo com crescimento alto
conseguimos manter o controle e apenas aumentaríamos o número de classes e não de métodos if else.


###Factory Method - Creational Pattern

Nesse Pattern igualmente ao Strategy temos 3 passos, o primeiro é composto pela criação dos Produtos (abstratos e
concretos) que no nosso exemplos seriam o VeiculoProdutoAbstrato e o CarroProdutoConcreto respectivamente. O segundo
passo consiste na criação da Factory, ela será resposável pela gestão dos objeto e ela que decide qual objeto, por
exemplo, será instanciado. No nosso caso é decidido qual objeto é instaciado utilizando o TipoVeiculo, assim limitamos
as escolhas do usuário.
As vantagens dessa implementação é a abstração da criação dos objetos, apenas ProdutosConcretos que herdam da classe
abstrata são reconhecidas pelas factory, encapsulandos os métodos de criação e evitar mudanças. Além disso toda a
sujeira que ficaria na classe principal do programa fica dentro do factory, deixando o código principal mais limpo,
evitando duplicação de informações e centralizando as informações pertencentes a cada classe, facilitando assim a
manuntenção.


###Facade - Strutural Pattern

O Facade de todos os Patterns utilizados é o mais simples de entender, ele é uma abstração de algum método muito
complicado ou que possua muitos passos. Vamos supor que possuímos um classe chamada "maquinaDeLava" que contém os
métodos "adicionarSabao" e "ligarMaquina", ao lavarmos roupar precisaríamos desses dois métodos sendo chamado na classe
main e ai que entra o Facade, ele encapsula um novo método chamado "baterRoupa" onde conterá a chamada dos outros
métodos "adicionarSabao" e "baterRoupa", gerando uma espécie de interface de utilização.
O exemplo mais fácil que podemos dar é uma API, ao criarmos uma API em java fazemos nosso endpoints onde cada vez que
são chamado uma série de classes e subclasses são chamadas na sequência, porém quem faz a chamada do endpoint não vê
quantos métodos e classes são chamados, apenas é processado e retornado o resultado.
A vantagem aqui é a abstração de chamada de submétodos de subclasses que são chamadas pela classe principal, além de
facilitar o uso por reduzir muito o número de chamadas aos mesmos recursos.


####Alunos responsáveis:
Arthur Enrique Teixeira de Souza - 125111361579  
Elias Victor Silva Santana - 125111361348  
Thiago Torres de Sousa - 125111369885  
Nicollas Yan Canuto Neves - 125111377415  
Guilherme Anacleto Ferreira - 125111354764  
Luiz Felipe Cruz Borges - 125111373822