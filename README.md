Nesse projeto estou consumindo três apis:

1. Advice Slip

É uma API que te retorna um conselho. 

2. Fun Translations API
É uma API que traduz um texto para uma outra linguagem. Essa linguagem pode ser Minions ou Dothraki de Game of Thrones entre várias outras.

3. The Rick and Morty API
Várias coisas legais de Rick and Morty.

Sabemos que existem muitas formas para se consumir uma API e utilizei o padrão adapter para centralizar apenas uma maneira de fazer esse consumo no meu sistema. Com isso caso eu queira alterar para utilizar uma nova biblioteca etc seria apenas fazer a alteração no adaptador.