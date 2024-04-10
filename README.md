# Loja Livros Projeto Fullstack

**loja de livros usando Java / Springboot / thymeleaf / bootstrap / fontawesome - CRUD**

**Relatório sobre o Controlador de Livros da Aplicação Web usando Spring Boot e Thymeleaf**

**Objetivo:**
O objetivo deste relatório é fornecer uma visão geral do controlador de livros desenvolvido para uma aplicação web usando Spring Boot e Thymeleaf. O controlador é responsável por gerenciar as requisições relacionadas aos livros, incluindo operações como registro, listagem, edição e exclusão de livros, bem como a manipulação da lista de livros do usuário.

**Detalhes do Código:**
1. **Injeção de Dependências:**
   - O controlador faz uso da anotação `@Autowired` para injetar instâncias dos serviços `BookService` e `MyBookListService`, permitindo o acesso aos métodos desses serviços.

2. **Mapeamento de Requisições:**
   - O controlador é mapeado com a anotação `@Controller` e possui um mapeamento de requisições raiz `@RequestMapping("/")`, que redireciona para a página inicial.
   - Existem diversos métodos mapeados com as anotações `@GetMapping` e `@PostMapping` para lidar com diferentes tipos de requisições HTTP.

3. **Funcionalidades Principais:**
   - **Registro de Livros:**
     - O método `bookRegister()` mapeia a requisição para a página de registro de livros.
     - O método `addBook()` é mapeado para a rota `/save` e é responsável por salvar um novo livro no banco de dados.

   - **Listagem de Livros Disponíveis:**
     - O método `getAllBook()` mapeia a requisição para listar todos os livros disponíveis.
     - Ele retorna uma `ModelAndView` contendo a lista de livros, que será exibida na página `bookList.html`.

   - **Listagem dos Livros do Usuário:**
     - O método `getMyBooks()` mapeia a requisição para listar os livros pertencentes ao usuário.
     - Ele adiciona a lista de livros do usuário ao modelo para ser exibida na página `myBooks.html`.

   - **Adicionar Livro à Lista do Usuário:**
     - O método `getMyList()` mapeia a requisição para adicionar um livro à lista do usuário.
     - Ele recebe o ID do livro como parâmetro, busca as informações do livro e as salva na lista de livros do usuário.

   - **Editar e Excluir Livros:**
     - Os métodos `editBook()` e `deleteBook()` são responsáveis por lidar com as operações de edição e exclusão de livros, respectivamente.
     - Eles recebem o ID do livro como parâmetro, realizam a operação correspondente e redirecionam o usuário para a página apropriada.

**Conclusão:**
O controlador de livros implementado demonstra o uso eficaz do Spring Boot e Thymeleaf para criar uma aplicação web interativa de gerenciamento de livros. Ele fornece funcionalidades completas para registro, listagem, edição e exclusão de livros, bem como a manipulação da lista de livros do usuário. O código é organizado e segue as melhores práticas de desenvolvimento web com Spring Boot.
