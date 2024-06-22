# Exemplo 2

Esse projeto além de processar uma única entrada e gerar uma resposta correspondente, leva em consideração o contexto do sistema.

## Contexto do Sistema: 
No contexto de sistemas de IA conversacional, o contexto se refere a informações adicionais fornecidas ao modelo para influenciar ou guiar suas respostas. Isso pode incluir instruções sobre o idioma, o estilo de resposta, o tom, ou informações específicas que o modelo deve considerar ao gerar uma resposta.
## Implementação no Código
O contexto é definido pela mensagem de sistema:
```java
messages.add(SystemMessage.systemMessage("Responda em español"));
```
Esta linha instrui explicitamente o modelo a responder em espanhol. Isso é essencial para garantir que as respostas estejam de acordo com as expectativas do usuário em termos de idioma.
## Importância do Contexto
- Personalização: Permite que as respostas sejam personalizadas conforme as necessidades específicas do usuário ou da aplicação.
- Consistência: Ajuda a manter consistência no comportamento do modelo ao longo de uma interação ou série de interações.
- Relevância: Garante que as respostas geradas sejam relevantes e apropriadas ao cenário ou tarefa específica em questão.
