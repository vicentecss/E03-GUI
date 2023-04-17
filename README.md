# Android E03: Widgets

Professor: João Eduardo Montandon


Como pré-requisito, esse exercício requer que você tenha terminado o exercício [anterior](https://github.com/COLTEC-TP/Android-E03-GUI/tree/layouts).

Caso você já tenha terminado, é necessário atualizar este branch com o código implementado. Para isso, execute o comando abaixo no diretório do projeto:

```
$ git checkout widgets      # altera para o branch do exercício
$ git merge layouts         # Atualiza o branch widgets com o conteúdo de layouts
```

## Utilizando Dialogs

Durante o preenchimento de um formulário, é uma boa prática exibir uma mensagem pedindo para que o usuário confirme o envio da mensagem, conforme esse [modelo](https://i.stack.imgur.com/wmgBG.png). No desenvolvimento de aplicativos para Android, geralmente essas mensagens de confirmação são codificadas por um `Dialog`.

Você deverá implementar uma mensagem de confirmação para o usuário utilizando a classe `AlertDialog`. O `AlertDialog` deverá ser exibido no momento em que o usuário clicar no botão para envio do comentário. 

Ainda, você deverá tratar as ambas as situações de confirmação e cancelamento do envio. Utilize `Toast` para exibir a mensagem de confirmação/cancelamento de envio do comentário.

## Internacionalização

Uma vez que seu app estiver disponível na Play Store, usuários de vários países podem baixar e utilizar seu aplicativo a qualquer momento. Por isso, o recurso de internacionalização é extremamente importante para o desenvolvimento de aplicaitvos móveis em geral.

Aplique os recursos de internacionalização nas telas de **Previsão do Tempo** e **Formulário** para que ele suporte duas línguas: português e inglês. Para isso, você precisará configurar seu projeto com arquivos `string.xml` para cada língua, e preenchê-los com os respectivos textos necessários para tradução.
