# App RecyclerView - Catálogo de Cães

## Sobre o Projeto
Este repositório contém o código-fonte de uma aplicação Android desenvolvida na linguagem Java. Trata-se da entrega final da atividade prática referente à disciplina de Programação para Dispositivos Móveis da Universidade Federal de Rondônia. O objetivo central deste projeto foi modificar e expandir uma implementação base de um `RecyclerView`, convertendo-a numa aplicação temática completa com navegação e carregamento remoto de imagens.

O tema escolhido para este desenvolvimento foi "Cachorro" (Catálogo de Cães), cumprindo a exigência de apresentar pelo menos 10 itens distintos armazenados estaticamente no código.

## Arquitetura e Funcionalidades
A aplicação foi estruturada em três ecrãs principais (`Activities`), cumprindo os requisitos obrigatórios estabelecidos:

1. **Ecrã Inicial (`MainActivity.java`)**: 
   * Atua como ponto de entrada da aplicação, contendo o nome e um botão para iniciar a experiência.
   * Utiliza uma `Intent` explícita para navegar em direção ao ecrã de listagem.

2. **Ecrã de Listagem (`ActivityListagem.java`)**:
   * Implementa o `RecyclerView` para apresentar o catálogo de cães de forma fluida e eficiente.
   * Utiliza as classes `Adapter` e `ViewHolder` em conjunto com um `LinearLayoutManager` para a correta disposição visual dos itens.
   * Cada item da lista apresenta a imagem, o nome da raça e uma breve descrição do cão.
   * **Interações:**
     * **Clique Simples**: Ao tocar num item, a aplicação navega para o ecrã de detalhes, passando os dados completos do cão selecionado (nome, raça, descrição e URL da imagem) através de uma `Intent`.
     * **Clique Longo**: Ao premir de forma contínua num item, este é removido da listagem. O `RecyclerView` é atualizado (`notifyItemRemoved`) e uma notificação do tipo `Toast` é apresentada para confirmar a remoção.

3. **Ecrã de Informações (`ActivityInfo.java`)**:
   * Recupera os dados submetidos pela `Intent` e exibe os detalhes completos do cão selecionado numa interface focada.

## Gestão de Imagens
Para satisfazer o requisito de carregamento de imagens remotas por URL, a aplicação integra a biblioteca de terceiros **Glide**. 
* O Glide é utilizado de forma assíncrona tanto no `Adapter` (para preencher as miniaturas no `RecyclerView`) como no ecrã de informações (para exibir a imagem em detalhe). 
* Foi solicitada e incluída no `AndroidManifest.xml` a permissão obrigatória de acesso à Internet (`android.permission.INTERNET`).

## Estrutura do Código e Modelos de Dados
A gestão de dados baseia-se na classe modelo `Cachorro.java`, que define a estrutura de informação de cada animal e implementa a interface `Serializable` para permitir o tráfego de dados entre as `Activities`[cite: 5]. O povoamento inicial dos dados (os objetos instanciados com os respetivos URLs públicos para imagens) encontra-se centralizado na classe utilitária `CachorroData.java`. 

## By Camila
