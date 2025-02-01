# Projeto de Modificador `final` em Java: Conversão de Moeda

Este projeto foi desenvolvido como parte do meu portfólio para demonstrar o uso do modificador `final` em **Programação Orientada a Objetos (POO)** com Java. O objetivo é simular uma conversão de moeda, onde o prefixo do dólar é um atributo `final` e o cálculo da conversão é feito por um método `final`.

## Descrição

O projeto consiste em uma classe `Conversao` que possui:
- Um atributo `final` chamado `prefixoDolar`, que representa o símbolo do dólar.
- Dois atributos comuns: `valorReal` (valor em reais a ser convertido) e `cotacaoDolar` (cotação atual do dólar).
- Um método `final` chamado `conversaoDolar()`, que realiza a conversão do valor em reais para dólares.

## Estrutura do Projeto

### Classe `Conversao`

- **Atributos**:
  - `final String prefixoDolar`: Símbolo do dólar (valor imutável).
  - `double valorReal`: Valor em reais a ser convertido.
  - `double cotacaoDolar`: Cotação atual do dólar.

- **Métodos**:
  - `conversaoDolar()`: Método `final` que calcula e retorna o valor convertido em dólares.
  - Construtor, getters e setters (exceto para `prefixoDolar`, que é `final`).

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/jopsantossilva2005/ModificadorFinal.git

2. Execute o projeto no arquivo ConversaoTeste

3. Digite o valor em real que deseja converter: `ex 100,00`.

4. Digite a cotação atual do dólar: `ex 6,00`.
