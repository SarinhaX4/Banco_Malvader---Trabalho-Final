### Banco Malvader - Sistema de Gerenciamento Bancário

Este repositório contém a implementação do sistema **Banco Malvader**, um aplicativo Java desenvolvido para gerenciar contas bancárias com interface gráfica Swing e persistência de dados em MySQL. O projeto foi criado para o Trabalho Final de Laboratório de Banco de Dados ministrada pelo docente WILLIAM ROBERTO MALVEZZI

### Funcionalidades
Aqui está a revisão e ampliação da descrição, incluindo informações sobre geração de relatórios e outras funcionalidades mencionadas no seu documento:

---

### Banco Malvader - Sistema de Gerenciamento Bancário  
**Descrição:**  
Este repositório contém a implementação do sistema **Banco Malvader**, um aplicativo desenvolvido em **Java** com **interface gráfica Swing** e **persistência de dados MySQL**. O sistema é um trabalho acadêmico focado em **Programação Orientada a Objetos (POO)**, gerenciamento de contas bancárias e integração com banco de dados.

---

### Funcionalidades
#### Acesso ao Sistema
- Login inicial com autenticação para **Funcionários** ou **Clientes**.  
- **Menu Principal**: Permite navegação entre menus de acordo com o perfil de usuário.  

#### Menu Funcionário
- **Gerenciamento de Contas**:
  - **Abertura de Conta**: Criação de contas Corrente ou Poupança, com inserção de dados como CPF, nome, endereço, saldo inicial, limite (no caso de conta corrente), entre outros.
  - **Encerramento de Conta**: Busca por número da conta e confirmação de encerramento mediante senha de administrador.
  
- **Consulta de Dados**:
  - **Consultar Contas**: Exibe informações detalhadas como saldo, limite, e data de vencimento (se aplicável).
  - **Consultar Funcionários**: Mostra dados como código, cargo, CPF e informações de contato.
  - **Consultar Clientes**: Lista dados pessoais como CPF, telefone e endereço.

- **Alteração de Dados**:
  - Alteração de dados de contas (limites e datas de vencimento), clientes (telefone e endereço) e funcionários (cargo e informações de contato).

- **Cadastro de Funcionários**:
  - Inserção de novos funcionários com senha de administrador.

- **Geração de Relatórios**:
  - Criação de relatórios detalhados sobre movimentações financeiras do banco.  
  - Relatórios podem ser exportados para **Excel** para análise externa.  

#### Menu Cliente
- **Operações Bancárias**:
  - **Consulta de Saldo**: Exibição do saldo atual (após autenticação).
  - **Depósito e Saque**: Operações simples de movimentação financeira com validação de saldo disponível para saque.
  - **Extrato**: Exibição de histórico de movimentações com opção de exportação para **Excel**.
  - **Consulta de Limite**: Verificação do limite disponível (apenas contas correntes).  

#### Outras Funcionalidades
- **Encerrar Programa**: Opção de sair do sistema com segurança.  

### Estrutura do Projeto
O projeto está organizado em pacotes para facilitar a manutenção e compreensão do código:
- **`dao`**: Acesso ao banco de dados (Data Access Objects).  
- **`model`**: Classes que representam as entidades do sistema.  
- **`view`**: Interfaces gráficas criadas com Swing.  
- **`controller`**: Lógica de negócios que conecta o modelo à interface.  
- **`util`**: Classes auxiliares, como conexão com banco de dados.

---

### Requisitos
- **Linguagem:** Java 8+  
- **Banco de Dados:** MySQL 5.7+  
- **Bibliotecas:**  
  - Driver JDBC MySQL (`mysql-connector-java`)  
 
