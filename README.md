# Projeto Animal

Este projeto é um programa Java que exibe dados de animais usando a superclasse ```Mamifero``` e suas subclasses ```Cao``` e ```Baleia```. O objetivo deste projeto é demonstrar o conceito de herança em Java e como as subclasses podem herdar atributos e métodos da superclasse.

## Como executar

Para executar este programa, você precisa ter o Java instalado em seu computador. Depois de instalar o Java, você pode compilar e executar o programa usando os seguintes comandos no terminal:

```java
javac Animais.java
java Animal
```

## Saída esperada

Quando você executar o programa, você deve ver a seguinte saída no terminal:

```
Eu sou um mamífero
Eu sou um cão
Eu tenho 4 patas
Eu posso latir
Eu sou um mamífero
Eu sou uma baleia
Eu tenho 0 patas
Eu posso cantar
```

## Explicação do código

O código deste programa consiste em três classes: ```Animal```, ```Cao``` e ```Baleia```. A classe ```Animal``` é a superclasse que define os atributos e métodos comuns a todos os mamíferos, como o número de patas e o método emitirSom. A classe Cao é uma subclasse de Animal que herda os atributos e métodos da superclasse e também define seus próprios atributos e métodos específicos, como a raça e o método latir. A classe Baleia é outra subclasse de Animal que também herda os atributos e métodos da superclasse e define seus próprios atributos e métodos específicos, como o tamanho e o método cantar.