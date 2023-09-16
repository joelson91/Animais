# Hora do Café com Java do Professor Allan
## Vamos treinar - Herança em Java

1. Implemente uma classe Bicicleta para representar uma bicicleta. Toda bicicleta tem uma velocidade (atributo velocidade) e uma marcha (atributo marcha). Além disto, a bicicleta pode: acelerar (método acelerar), frear (método frear) e apresentar o seu estado atual (método imprimirEstados). Em sua construção a classe deve iniciar na marcha 0 (zero) e com velocidade 0 (zero). Implemente uma segunda classe como sendo a classe principal do sistema. Ela deve ter o método main e ser responsável por criar objetos do tipo bicicletas, interagir com seus métodos e, a cada interação, imprimir da saída padrão o estado atual a bicicleta manipulada.

1. Altere a classe do exercício anterior para que ela apresente um novo atributo que representa a velocidade máxima desempenhada pela bicicleta. De forma específica:
- Inclua o atributo velocidadeMaxima, que representa o valor máximo que o atributo velocidade pode apresentar.
- O valor de velocidadeMaxima deve ser atribuído no momento em que o objeto é criado utilizando um construtor de inicialização.
- O método imprimirEstados, quando invocado, deve apresentar (na saída padrão) o valor da velocidadeMaxima que foi atribuída ao objeto, além dos valores dos outros atributos.
- Ao incrementar a velocidade, o objeto deve impedir que a velocidade da bicicleta supere a velocidadeMaxima.
