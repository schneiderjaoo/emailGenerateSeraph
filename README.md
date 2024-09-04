Projeto será focado em fazer templetes de e-mail para o envio para clientes via e-mail.

Arquitetura inicial do projeto:
 - controller: Controladores REST que expõem os endpoints da API.
 - service: Contém a lógica de negócios para o processamento e envio de e-mails.
 - repository: Interfaces para interagir com o banco de dados.
 - model: Definições das entidades e classes de modelo.
 - dto: Objetos de transferência de dados (Data Transfer Objects) usados para transportar dados entre camadas.
 - exception: Classes de exceções personalizadas para tratamento de erros.
 - config: Classes de configuração do Spring, como segurança, banco de dados, etc.
 - util: Utilitários e helpers que são usados em várias partes do projeto.

 