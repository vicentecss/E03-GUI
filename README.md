# Android E03: Layouts & Adapters
 
Professor: João Eduardo Montandon
 
## Lista de Locais

Implemente uma tela que apresente uma lista de locais recomendados para visitação no formato de lista, conforme este [exemplo](https://cdn.dribbble.com/users/137816/screenshots/3065985/material-design-listivew.png). 
Cada elemento da sua lista deverá mostrar as seguintes informações:

* Nome do local
* Descrição do local
* Foto do local
* Distância
* Avaliação

Para facilitar sua tarefa de desenvolvimento, o projeto contido neste exercício possui os arquivos [`Place.java`](app/src/main/java/br/ufmg/coltec/tp/e03_adapters/Place.java), representando a classe Java responsável por manipular um determinado local; e [`list_item_place.xml`](app/src/main/res/layout/list_item_place.xml), representando o arquivo da descrição de um item na `ListView`.
   
Sua tarefa nesse exercício é implementar o código restante para que a lista seja renderizada corretamente. Para isso se faz necessário implementar o Adapter, e a tela de listagem. 

## Externelizando os estilos

Crie um arquivo chamado `styles.xml` que contenha a declaração dos estilos utilizados pelos componentes presentes no arquivo `list_item_place.xml`.