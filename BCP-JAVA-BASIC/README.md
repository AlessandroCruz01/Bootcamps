# JAVA BASIC
## ABSTRAÇÃO
> Na abstração temos a ideia de pegar objetos do mundo real para usálos. EXEMPLO - Quando temo o objeto VENDEDOR, é algo abstrato pois nao temos a informação sobre o que ele vende ou quando ele vende. Mas temos atributos genericos que sao comuns a todos os vendedores. Ou seja, todos os vendedores recebem salario, todos os vendedores tem uma idade ou todos os vendedores tem um nome

## ENCAPSULAMENTO
> Resumidamente é quando colocamos um metodo em uma classe especifica onde faz sentido, para que quem o chame nao saiba quais regras esse metodo segue, ele apenas chama e ver o resultado sem conhecimento da logica seguida. Delegamos as regras para classe de direito onde a classe "cliente" nao tem acesso a nada referente a regras ou logica seguida.

## HERANÇA
> Na Programação Orientada a Objetos o significado de herança tem o mesmo significado para o mundo real. Assim como um filho pode herdar alguma característica do pai, na Orientação a Objetos é permitido que uma classe herde atributos e métodos da outra, tendo apenas uma restrição para a herança. Os modificadores de acessos das classes, métodos e atributos só podem estar com visibilidade public e protected para que sejam herdados.

## POLIMORFISMO
> São diferentes formas de fazer algo, ou seja, apenas declaramos uma função, onde sua implementação serão usados de diversas formas. Seguindo o contexto necessario naquela classe. Exemplo, calculo de ferias, temos apenas uma necessidade: "Calcular as ferias" mas dependendo do funcionario, da senioridade, do cargo e do setor do mercado esse calculo deve seguir outras logicas e meios para se chegar ao calculo final.

## VARIAVEIS COM TIPOS PRIMITIVOS X REFERENCIA
- **Tipos Primitivos:**
    > São valores simples armazenados diretamente na memória.
    > Não têm métodos associados a eles.
- **Tipos por Referência:**
    > São instâncias de classes armazenadas em áreas de memória mais complexas.
    > Têm métodos associados a eles.

## ESTRUTURA DE CONTROLES DE FLUXO
> Serve para ter o controle em que os processos serão executados. Ex: If-Else, for, while;
>> If-else = se - se não

>> for - laço de repetição

>> while - laço de repetição (enquanto)

>> switch - Valida caso a caso

## Objetos, Classs e métodos:
> Objetos - Se caracteriza por ter atributos e caracteristicas;
> Classe - Se caracteriza poor nao ter atributos e sim métodos;
> Métodos - Sao ações que retornam algum resultado;

## Arrays e coleções
> Array - Estrutura de dados que armazena dados do mesmo tipo que por padrão inicia a partir do indicie 0;
>> Ex: [1,2,3,4] ou ["a", "b", "c"];

> Collection - Collections Framework é um conjunto bem definido de interfaces e classes para representar e tratar grupos de dados como uma única unidade;
>> Ex: No ArrayList ele estende uma collection que nos da a capacidade de criar listas mais dinamicas; 

>> tendo tambem a capacidade de termos metodos disponiveis que facilitam na tratativa desta estrutura de dados; Ex: .size(); .add();

## Manipulação de excecoes
> Sao quando tratamos os  possiveis erros para retornar uma mensagem mais amigavel para o usuario - Try Catch