# Autorizacoes

Autorizacoes é um sistema de controle de autorizações de procedimentos médicos para um plano de saúde, que possibilita o cadastro e a verificação se determinada autorização está cadastrada.


## Criação do Banco de Dados

Deve ser executado o script abaixo para a criação do banco de dados, antes da execução da aplicação:

psql -d autorizacaodb -a -f /AutorizacoesProcedimentos/database/creation/create-db.sql

## Execução

No terminal:

docker login
docker build -t qualirede/autorizacoes .
docker run -p 8080:8080 -t qualirede/autorizacoes