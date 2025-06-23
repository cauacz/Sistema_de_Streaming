Screenmatch
-------------------------------------------------------------------------
Aplicação que simula um sistema de organização de filmes e séries, com funcionalidades como:
- Cadastro de títulos
- Cálculo de tempo total de duração
- Sistema de recomendação com base em classificação
- Consumo de API (OMDb) para buscar dados de filmes online

Este projeto foi desenvolvido com foco em aprendizagem de:
- Orientação a Objetos em Java
- Manipulação de arquivos JSON
- Consumo de APIs HTTP com HttpClient
- Tratamento de exceções

Tecnologias e ferramentas
- Java 17+
- IntelliJ IDEA (recomendado)
- API OMDb (http://www.omdbapi.com)

Como executar
- Clone o repositório ou extraia os arquivos.
- Abra no IntelliJ IDEA ou outra IDE Java.
- Execute a classe:
    - Main.java para testes iniciais
    - PrincipalComBusca.java para interação com a API OMDb

Exemplo de entrada:
Digite um filme para busca:
Matrix

Exemplo de saída:
{
  "Title": "The Matrix",
  "Year": "1999",
  ...
}

📂 Estrutura do projeto

screenmatch/
├── src/
│   ├── br/com/alura/screenmatch/
│   │   ├── modelos/               # Classes de domínio (Filme, Serie, Titulo)
│   │   ├── calculos/               # Cálculos de tempo e recomendações
│   │   ├── excecao/               # Exceções personalizadas
│   │   └── principal/             # Ponto de entrada e classes utilitárias
├── filmes.json
├── filmes.txt

📄 Principais classes
- Titulo (classe base)
Representa um título genérico (filme ou série), com nome, ano, duração, classificação, etc.

- Filme e Serie
Estendem Titulo com propriedades específicas para cada tipo.

- CalculadoraTempo
Soma a duração de todos os títulos adicionados.

- FiltroRecomendacao
Filtra títulos com base em sua classificação para recomendação.

- PrincipalComBusca
Solicita entrada do usuário, faz requisição à API OMDb e exibe dados do filme.

🔐 Observações
- É possível usar arquivos .json e .txt para persistir dados.
- A classe ErroDeConversaoDeAnoException trata casos onde o ano retornado da API está mal formatado.

✉️ Licença
Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

Desenvolvido com fins educacionais ✨