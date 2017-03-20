
Utilizando springboot no projeto, aprendi que a tecnologia do springboot veio para facilitar muito o inicio de um projeto como este de desenvolver API restfull. 

A ideia era utilizar JPA para gerar as tabelas para o banco de dados mysql com base nas entidades criadas, 
porem nesta semana de pesquisa e tirando duvidas com o Willian para este projeto utilizei a tecnologia H2 para armazenamento de dados.
Para acessar as tabelas do banco basta acessar: 
http://localhost:8082/

utilizando o Postman, podemos testar a inserção de dados via Json:

Url: http://localhost:8080/peoplePersons
dados: {"fullName" : "Jhonatan Soal","cpf":"25448862603","birthDate":"1982-04-25T02:00:00.000+0000"}
