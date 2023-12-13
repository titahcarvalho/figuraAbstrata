Considere um sistema de gerenciamento de figuras geométricas que inclui círculos e retângulos. Implemente um conjunto de classes que utilize abstração para representar essas figuras. A classe base é Figura, que contém métodos abstratos para calcular a área e o perímetro.

A classe Circulo deve herdar de Figura e incluir um raio como atributo. A classe Retangulo também deve herdar de Figura e incluir comprimento e largura como atributos.

A classe principal, chamada GerenciadorFiguras, deve criar instâncias de círculos e retângulos, armazená-las em um vetor e calcular a área total e o perímetro total de todas as figuras no vetor.

Lembre-se de implementar a sobreposição do método toString() para cada classe.

Observação:

Considere que as fórmulas para área e perímetro de um círculo são π * raio^2 e 2 * π * raio, respectivamente.
As fórmulas para área e perímetro de um retângulo são comprimento * largura e 2 * (comprimento + largura), respectivamente.