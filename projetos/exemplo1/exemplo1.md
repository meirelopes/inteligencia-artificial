# Exemplo 1

## Descrição da Funcionalidade 

O código fornecido é um exemplo de como integrar a biblioteca Langchain com a API do OpenAI para gerar respostas automatizadas baseadas em entradas de texto. Abaixo está uma explicação detalhada das funcionalidades e do fluxo do código:

- Obtenção da Chave API 
O código obtém a chave da API do OpenAI a partir das variáveis de ambiente do sistema. Isso é essencial para autenticar as solicitações feitas à API do OpenAI. 
```java
String apiKey = System.getenv("OPENAI_API_KEY");
```

- Configuração do Modelo de Chat:
Aqui, o código configura um modelo de chat usando a classe OpenAiChatModel da biblioteca Langchain. Utiliza um padrão de projeto builder para definir os parâmetros necessários: apiKey(apiKey): Define a chave da API para autenticação. modelName("gpt-3.5-turbo"): Especifica o nome do modelo a ser usado, neste caso, "gpt-3.5-turbo". temperature(0.7): Define a temperatura do modelo, que controla a aleatoriedade das respostas. Valores mais baixos resultam em respostas mais determinísticas, enquanto valores mais altos aumentam a criatividade das respostas. 

```java
OpenAiChatModel model = new OpenAiChatModel.OpenAiChatModelBuilder()
                                           .apiKey(apiKey)
                                           .modelName("gpt-3.5-turbo")
                                           .temperature(0.7)
                                           .build();
```

- Geração da Resposta:
O método generate do modelo é chamado com a pergunta recebida no objeto chatRequest. A resposta gerada pelo modelo é então retornada como uma String. 

```java
return model.generate(chatRequest.question()); 
```

## Fluxo do Método
- 1. Recepção da Solicitação:

O método getResponse recebe um objeto do tipo ChatRequest, que contém a pergunta a ser respondida.
- 2. Configuração do Modelo:

Configura um modelo de chat utilizando a chave da API e os parâmetros definidos (nome do modelo e temperatura).
- 3. Geração e Retorno da Resposta:

Chama o método generate do modelo para gerar uma resposta baseada na pergunta do chatRequest.
A resposta gerada é retornada como saída do método getResponse.
