# GameExplorer

- Projeto criando utilizando Java, onde a partir de endpoints é possivel listar jogos com suas respectivas informações como nome, foto da capa, ano, data, plataforma, descrição longa e curta e até mudar a posição dos jogos na listagem.

## Tecnologias utilizadas

- Java
- Spring
- Api Rest
- Banco H2
- Banco postgres + PgAdmin
- Docker
- Maven
- Git
- Railway (Para hospedar o projeto na nuvem)

## Conceitos utilizados para densenvolvimento

- Sistemas web e recursos
- Cliente/servidor, HTTP, JSON
- Padrão Rest para API web
- Estruturação de projeto Spring Rest
- Entidades e ORM
- Database seeding
- Padrão camadas
- Controller, service, repository
- Padrão DTO
- Relacionamentos N-N
- Classe de associação, embedded id
- Consultas SQL no Spring Data JPA
- Projections
- Perfil de desenvolvimento, testes e produção
- Processo de deploy com CI/CD
- Configuração de CORS

## Modelo de domínio GameExplorer
![GameExplorer-model](https://github.com/Joaopredondo/GameExplorer/assets/81270910/207e5a34-75a0-4a03-bcb6-4b4876f051f3)

## Endpoints criados (Disponíveis tambem via collection no arquivo do projeto)
- GET: http://localhost:8080/games (Lista os jogos)
- GET: http://localhost:8080/lists/1/games (Lista os jogos de determinada categoria)
- GET: http://localhost:8080/games/6 (Traz um jogo com um id específico) 
- GET: http://localhost:8080/lists (Mostra todas as categorias)
- POST: http://localhost:8080/lists/2/replacement -> Body: {"sourceIndex": 1 -> (Valor atual), "destinationIndex": 3 -> (Valor de destino)} (Altera a posição de determinado jogo na lista)

## Link do projeto na nuvem
- https://gameexplorer-production.up.railway.app/games
