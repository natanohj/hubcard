Utilizei o site: http://www.setupmyproject.com/ para configurar o seu setup

Utilizei a IDE Eclipse para criar o projeto. Na criação do projeto foi utilizado Maven

O Maven vai fazer o build de sua solução. Ele utiliza muito o conceito de convenção sobre configuração.
Logo, utilizando a estrutura padrão não será necessário configurar várias coisas que você configuraria utilizando o ant
como o diretório de fontes.


Utilizando spring boot no projeto, aprendi que a tecnologia do springboot veio para facilitar o desenvolvimento de micro serviços JAVA.

O Spring Boot é construído em cima do Spring Framework.

************************ fonte : https://www.infoq.com/br/articles/boot-microservices **************
Muito do Spring Boot foi construído pensado na produtividade do desenvolvedor, tornando conceitos como RESTful HTTP e ambientes de execução de aplicações Web embarcados fáceis de conectar e usar
*****************************************************************************************************

A ideia era utilizar JPA para gerar as tabelas para o banco de dados mysql com base nas entidades criadas, 
porem nesta semana de pesquisa e tirando duvidas com o Willian para este projeto utilizei a tecnologia H2 para armazenamento de dados.
Para acessar as tabelas do banco basta acessar: 
http://localhost:8082/

utilizando o Postman, podemos testar a inserção de dados via Json:

Url: http://localhost:8080/peoplePersons
dados: {"fullName" : "Jhonatan Soal","cpf":"25448862603","birthDate":"1982-04-25T02:00:00.000+0000"}
