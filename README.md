# Demo integração MongoDB

API REST em Spring Boot com MongoDB.

CRUD de Estudante, Curso e Professor.

## Como rodar

1. Subir o MongoDB na porta 27017 (banco `escola`)
2. Rodar o projeto no IntelliJ
3. A API fica em `http://localhost:8080`

## Endpoints

Estudantes:
- POST /estudantes
- GET /estudantes
- GET /estudantes/{id}
- PUT /estudantes/{id}
- DELETE /estudantes/{id}

Cursos:
- POST /cursos
- GET /cursos
- GET /cursos/{id}
- PUT /cursos/{id}
- DELETE /cursos/{id}

Professores:
- POST /professores
- GET /professores
- GET /professores/{id}
- PUT /professores/{id}
- DELETE /professores/{id}

## Exemplo de cadastro (estudante)

```json
{
  "id": "1",
  "nome": "João da Silva",
  "idade": 30,
  "email": "joao.silva@email.com"
}
```
