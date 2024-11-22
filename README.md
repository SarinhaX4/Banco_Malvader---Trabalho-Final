### Banco Malvader - Sistema de Gerenciamento Bancário

Este repositório contém a implementação do sistema **Banco Malvader**, um aplicativo Java desenvolvido para gerenciar contas bancárias com interface gráfica Swing e persistência de dados em MySQL. O projeto foi criado para o Trabalho Final de Laboratório de Banco de Dados ministrada pelo docente WILLIAM ROBERTO MALVEZZI

### Funcionalidades
- **Acesso ao Sistema**: Login como funcionário ou cliente com autenticação.
- **Menu Funcionário**:  
  - Abertura e encerramento de contas (Corrente e Poupança).  
  - Consulta e alteração de dados de contas, funcionários e clientes.  
  - Cadastro de novos funcionários.  
  - Geração de relatórios financeiros com exportação para Excel.  

- **Menu Cliente**:  
  - Operações bancárias como saldo, depósito, saque, extrato e consulta de limites.  

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
 
