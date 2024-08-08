# RestaurantOwners

## Sistema de CRM para restaurantes

Este repositório contém a documentação e os detalhes gerais do projeto.

Tecnologias:

Java, Web

Figma:

https://www.figma.com/design/8dtOZKWDdyo2Hi5kPIGP2b/RestaurntOwner?node-id=0-1&m=dev&t=xpOqamRP1Bd8XlXB-1





# Estrutura do Sistema

## Classes

### Colaborador
- `id`: Long
- `nome`: String
- `cpf`: String
- `senha`: String

### Atendente (extends Colaborador)
- `FazerPedido()`
- `VerPedido()`

### Caixa (extends Colaborador)
- `VerPedido()`
- `ReceberPagamento()`

### Cozinha (extends Colaborador)
- `VerPedido()`
- `AlterarStatusPedido()`

### Administrativo (extends Colaborador)
- `FazerPedido()`
- `EditarPedido()`
- `RemoverPedido()`
- `VerPedido()`
- `AdicionarColaborador()`
- `EditarColaborador()`
- `RemoverColaborador()`
- `VerColaborador()`
- `AdicionarItemMenu()`
- `EditarItemMenu()`
- `RemoverItemMenu()`
- `VerItemMenu()`

## ItemMenu
- `id`: Long
- `item`: String
- `tipo`: String
- `preco`: double
- `descricao`: String
- `disponivel`: boolean

## Pedido
- `id`: Long
- `comanda`: int
- `observação`: String
- `@ManyToOne ItemMenu itemMenu`
