# Tabela Hash Encadeada 

Tabela hash com encadeamento (M = 11, `h(chave) = chave mod 11`), listas encadeadas implementadas manualmente.

## Equipe
- Ryan de Souza Sebadelhe, Daniel da Costa Dias, Enzo Morais Lucena, Erick Mauricio Soares Almeida,Nelson Francisco Suassuna Neto, Lucas Andrade Velozo Andriola

## Compilar e executar
```bash
mkdir -p out
javac -d out src/*.java
java -cp out Main
```

## Exemplo
Inserindo as matrículas 11, 22 e 33 (todas colidem na posição 0):
```
[0] -> (11, Ana, 20) -> (22, Bia, 19) -> (33, Caio, 21) -> null
[1] -> null
```
