# ViaCep Spring Boot Project

## Descrição

Este é um projeto Spring Boot que utiliza a API ViaCep para buscar informações de endereço com base no CEP fornecido. O usuário insere o CEP em um formulário HTML, e os detalhes do endereço são preenchidos automaticamente nos campos apropriados usando jQuery e a API ViaCep.

## Funcionalidades

- Consulta de endereço usando o CEP.
- Formulário HTML para inserção e exibição de dados de endereço.
- Salvamento dos dados de endereço em um banco de dados H2.
- Interface responsiva e estilizada com CSS.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.1.5
- Spring Data JPA
- Spring Boot DevTools
- Thymeleaf
- jQuery
- API ViaCep
- HTML/CSS
- Banco de Dados H2

## Estrutura do Projeto

- **Entity**: Contém a classe `ViaCepData`, que representa os dados do endereço.
- **Controller**: Contém a classe `ViaCepController`, que gerencia as requisições HTTP.
- **Repository**: Contém a interface `ViaCepRepository` para interação com o banco de dados.
- **Templates**: Contém o arquivo `form.html` para o formulário de entrada.
- **Static**: Contém arquivos estáticos, como CSS e imagens.


### Pré-requisitos

- JDK 17
- Maven


## Acesse o formulário de endereço em [http://localhost:8080/form](http://localhost:8080/form).

## Uso

- Insira um CEP no campo "CEP" do formulário.
- Os campos de endereço serão preenchidos automaticamente usando a API ViaCep.
- Clique no botão "Enviar" para salvar os dados no banco de dados.

## Dependências

O projeto utiliza as seguintes dependências, conforme especificado no `pom.xml`:

- **Spring Boot Starter Thymeleaf**: Para renderizar páginas HTML.
- **Spring Boot Starter Web**: Para construir aplicativos web, incluindo RESTful.
- **Spring Boot Starter Data JPA**: Para facilitar o acesso aos dados.
- **H2 Database**: Banco de dados em memória para desenvolvimento e testes.
- **Spring Boot DevTools**: Para facilitar o desenvolvimento com auto-restart.
- **Lombok**: Para reduzir a verbosidade do código Java.
- **Spring Boot Starter Test**: Para testar o aplicativo Spring Boot.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.

