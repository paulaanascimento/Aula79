# Recipe Radar
<div align="justify">
Esta aplicação foi projetada para simplificar a busca por receitas, permitindo que os usuários insiram os ingredientes que
possuem e retornando sugestões de pratos que podem ser preparados com base nesses ingredientes.

## Requisitos de Negócios
  ### 1. Entrada de Ingredientes
  - O usuário deve inserir uma lista com os ingredientes que possuem em casa, separados por vírguals.
  ### 2. Busca de Receitas
  - A aplicação filtra a lista de receitas disponíveis com base nos ingredientes fornecidos pelo usuário.
  - As receitas filtradas devem conter todos os ingredientes da lista de entrada.
  ### 3. Exibição de Resultados
  - A aplicação exibe as receitas que podem ser feitas com base nos ingredientes disponíveis.
  - Caso não haja receitas compatíveis, uma mensagem apropriada é exibida.

## Componentes
### 1. RecipesRepository
Este componente é responsável por armazenar e gerenciar as receitas disponíveis. Ele possui um método `initializeRepository()` 
que preenche a lista de receitas. Além disso, tem o método `findMatchingRecipes(recipes: List<Recipes>, availableIngredients: List<String>): List<Recipes>` que 
verifica quais receitas podem ser preparadas com os ingredientes disponíveis.

### 2. RecipeViewModel
Este componente contém a lógica de verificação. Ele possui um método `verificationRecipe(ingredients: List<String>): String` que recebe 
uma lista de ingredientes e retorna uma string contendo as receitas que podem ser feitas com esses ingredientes. Ele usa o 
repositório de receitas para realizar a busca.

### 3. RecipeView
Este componente é responsável pela interação com o usuário. Ele exibe uma mensagem solicitando que o usuário insira os 
ingredientes separados por vírgula. Em seguida, lê a entrada do usuário e chama o método de verificação para mostrar as 
receitas possíveis.

## Próximos Passos
  - Integração com a API spoonacular para uma variedade ainda maior de receitas.
  - Adicionar interface gráfica.
  - Implementação de recursos avançados como filtros de dieta, níveis de dificuldade e opções de substituição de ingredientes.
