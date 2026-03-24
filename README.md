## Exercício 1 – Sistema de Animais

Crie um sistema com as classes:

- `Animal`
- `Cachorro`
- `Gato`
- `Vaca`
- `Cavalo`

Requisitos:

- A classe `Animal` deve possuir no mínimo 3 atributos privados.
- Todas as classes devem ter construtores.
- Crie o método `emitirSom()`.
- Cada classe filha deve sobrescrever esse método.
- Na classe `Main`, crie objetos e teste o polimorfismo usando uma referência do tipo `Animal`.

---

## Exercício 2 – Sistema de Veículos

Crie um sistema com as classes:

- `Veiculo`
- `Carro`
- `Moto`
- `Bicicleta`
- `Onibus`

Requisitos:

- A classe `Veiculo` deve ter atributos como marca, modelo e ano.
- Todas as classes devem possuir construtores.
- Crie o método `mover()`.
- Cada veículo deve implementar esse método de forma diferente.
- Teste o polimorfismo no `Main`.

---

## Exercício 3 – Funcionários de Empresa

Crie um sistema com as classes:

- `Funcionario`
- `Gerente`
- `Vendedor`
- `Programador`
- `Designer`

Requisitos:

- Todos devem possuir atributos privados.
- Todas as classes devem ter construtores.
- Crie o método `trabalhar()`.
- Cada cargo deve ter uma implementação diferente.
- Crie também um método `calcularBonus()` e sobrescreva nas subclasses.

---

## Exercício 4 – Sistema Bancário

Crie um sistema com as classes:

- `ContaBancaria`
- `ContaCorrente`
- `ContaPoupanca`
- `ContaSalario`
- `Cliente`

Requisitos:

- Cada conta deve possuir construtor.
- Utilize atributos privados como número, saldo e titular.
- Crie métodos `depositar()`, `sacar()` e `consultarSaldo()`.
- Cada tipo de conta deve ter comportamento diferente para saque ou rendimento.
- Use polimorfismo no teste.

---

## Exercício 5 – Sistema Escolar

Crie um sistema com as classes:

- `Pessoa`
- `Aluno`
- `Professor`
- `Coordenador`
- `Turma`

Requisitos:

- Todas as classes com construtores.
- Atributos privados e encapsulados.
- Crie métodos como `apresentar()`, `calcularMedia()` ou `trabalhar()`.
- Professor e coordenador podem sobrescrever um método comum da classe `Pessoa`.

---

## Exercício 6 – Sistema de Produtos

Crie um sistema com as classes:

- `Produto`
- `Livro`
- `Eletronico`
- `Roupa`
- `Alimento`

Requisitos:

- Todas as classes devem possuir construtores.
- Crie atributos privados como nome, preço e quantidade.
- Crie o método `calcularPrecoFinal()`.
- Cada tipo de produto deve aplicar uma regra própria.

---

## Exercício 7 – Sistema de Formas Geométricas

Crie um sistema com as classes:

- `Forma`
- `Quadrado`
- `Retangulo`
- `Circulo`
- `Triangulo`

Requisitos:

- Todas as classes devem possuir construtores.
- Crie atributos privados.
- Crie o método `calcularArea()`.
- Cada forma deve sobrescrever esse método.
- Teste os objetos em um vetor ou `ArrayList`.

---

## Exercício 8 – Sistema de Pagamentos

Crie um sistema com as classes:

- `Pagamento`
- `CartaoCredito`
- `Pix`
- `Boleto`
- `Dinheiro`

Requisitos:

- Todas as classes com construtores.
- Atributos privados como valor, data e descrição.
- Crie o método `processarPagamento()`.
- Cada classe deve exibir uma forma diferente de pagamento.
