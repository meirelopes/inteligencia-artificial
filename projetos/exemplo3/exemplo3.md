# Exemplo 3

O projeto configura um assistente de chat usando um modelo de linguagem e um provedor de memória que mantém até 10 mensagens. 
Isso permite que o assistente mantenha um histórico limitado das mensagens na conversa.

## Parâmetros:

- @MemoryId: anotação que indica que o parâmetro memoryId é utilizado para identificar a memória do chat associada a esta conversa.
Este ID ajuda a manter o contexto e histórico da conversa.

- @UserMessage: anotação que indica que o parâmetro userMessage é a mensagem do usuário que precisa de uma resposta.
Ajuda a distinguir a mensagem do usuário de outros tipos de mensagens ou dados.

## Método chat
Um método que faz parte da interface Assistent e é destinado a processar uma mensagem do usuário e gerar uma resposta.

```java
String chat(@MemoryId int memoryId, @UserMessage String userMessage);
```
## Parâmetros:

- @MemoryId int memoryId: Um identificador para a memória do chat. Este ID é usado para acessar o histórico da conversa e manter o contexto.
- @UserMessage String userMessage: A mensagem enviada pelo usuário que precisa de uma resposta.
Retorno:

## Funcionalidade
- A anotação @SystemMessage define claramente como o assistente deve se comportar. Isso é crucial para garantir uma experiência de usuário consistente e apropriada.
- Manutenção do Contexto: O uso de @MemoryId garante que cada interação pode ser contextualizada dentro de uma sessão específica, permitindo respostas mais relevantes e coerentes.
- Estrutura Clara: A interface Assistent com suas anotações oferece uma estrutura clara para a interação entre o usuário e o assistente, facilitando a implementação e manutenção.
## Propósito
- Manter o Contexto: O userId é usado para identificar a sessão de chat específica de um usuário. Com isso, o assistente pode acessar e lembrar o histórico das mensagens trocadas com aquele usuário específico, permitindo respostas mais contextuais e coerentes.
- Segregação de Sessões: Cada usuário tem um userId único (ou memoryId), o que significa que as mensagens e o contexto da conversa são armazenados separadamente para cada usuário. Isso evita que as informações de uma conversa interfiram em outra.
