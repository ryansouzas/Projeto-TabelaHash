# Tabela Hash Encadeada - Alunos (Java)

Tabela hash com encadeamento (M = 11, `h(chave) = chave mod 11`), listas encadeadas implementadas manualmente.

## Equipe
- (preencher com os nomes de todos os membros, 5 a 7)

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
