# Projeto Animal

Este projeto é um programa Java que exibe dados de animais usando a superclasse ```Mamifero``` e suas subclasses ```Cao``` e ```Baleia```. O objetivo deste projeto é demonstrar o conceito de herança em Java e como as subclasses podem herdar atributos e métodos da superclasse.

## Saída esperada

Quando você executar o programa, você deve ver a seguinte saída no terminal:

```
-----------------
Nome: Totó
Sexo: Macho
Idade: 6
Peso: 30.0
Cor do pelo: Amarelo
Raça: Vira-lata
-----------------
Estou respirando
-----------------
Estou comendo
-----------------
🐶 Au, au!
---------------------
Nome: Pérola
Sexo: Fêmea
Idade: 20
Peso: 1000.0
Cor da pele: Azul
Espécie: 
-----------------
Estou respirando
-----------------
Estou comendo
-----------------
🐋 uuh uuh
-----------------
```

## Explicação do código

O código deste programa consiste em três classes: ```Animal```, ```Cao``` e ```Baleia```. A classe ```Animal``` é a superclasse que define os atributos e métodos comuns a todos os mamíferos, como o nome e o método respirar. A classe ```Cao``` é uma subclasse de ```Animal``` que herda os atributos e métodos da superclasse e também define seus próprios atributos e métodos específicos, como a raça e o método latir. A classe ```Baleia``` é outra subclasse de ```Animal``` que também herda os atributos e métodos da superclasse e define seus próprios atributos e métodos específicos, como o ```corPele``` e o método ```cantar```.