# Projeto de Controle de Produtos em Java
Este projeto implementa um sistema de controle de produtos em Java, conforme o diagrama de classes apresentado na Figura 1.

# Classes Implementadas
Classe Produto
Variáveis de Instância: id, valor, descrição
Variável de Classe: quantidade (quantidade de produtos criados)
Métodos:
Construtor que recebe descrição e valor
Método de classe getQuantidade() que retorna o número de produtos criados até o momento
Método toString() que retorna os dados do produto
Classe Perecivel
Variáveis de Instância: validade (representada por dia, mês e ano)
Herança: Herda os atributos e métodos da classe Produto
Métodos:
Construtor que recebe descrição, valor e data de validade
Método estaVencido() que retorna se o produto está vencido ou não
Método aplicaDesconto(double porcentagem) que aplica o desconto ao preço
Método toString() que retorna informações do produto perecível
Classe TestaProduto (Classe principal)
Apresenta um menu para o usuário com as seguintes opções:
1- Criar produto
2- Criar produto perecível
3- Sair
Para a Opção 1:
Solicita que o usuário entre com os dados de cadastro do produto
Cria o objeto
Imprime os dados do objeto na tela
Para a Opção 2:
Solicita que o usuário entre com os dados de cadastro do produto perecível
Cria o objeto
Imprime os dados do objeto na tela
Verifica se o produto está vencido
Aplica um desconto de 15% ao produto
Imprime os dados do objeto na tela
Para a Opção 3, encerra o programa.
Como Utilizar
Faça o download do código fonte.
Abra o projeto em seu ambiente de desenvolvimento Java.
Execute a classe TestaProduto para iniciar o programa.
Siga as instruções apresentadas no menu para interagir com o sistema.
Contribuindo
Sinta-se à vontade para contribuir para este projeto. Se encontrar problemas ou tiver sugestões de melhorias, por favor, crie uma issue ou envie um pull request.
