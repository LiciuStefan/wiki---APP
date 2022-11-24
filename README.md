# wiki--- Design Pattern

Un Design Pattern (motif de conception) est une technique permettant de solutionner des problèmes courants. 

Il existe plusieurs types de Design Pattern :
  - Modèle de création
  - Modèle de structuration
  - modèle de comportement 
 
Nous allons traiter les Patterns Décorateur ainsi que Visiteur

## Description générale du pattern "Decorator"
Le Décorateur est un modele de structuration qui permet d'ajouter des fonctions à un objet en étant moins "rigide" que l'héritage.
Il n'est pas possible d'hériter si la classe est déclarée _final_, l'héritage nécéssite la création de plusieurs classes ce qui peut être chronophage et energivore. Les ajouts de fonctionalités sont donc dynamique et non plus statique. Ce qui comporte l'avantage de pouvoir ajouter autant de fonctionnalités que souhaité et au fur et à mesure que l'on se rend compte de leur nécessité dans le dévellopement, sans pour autant toucher au code de l'objet. Ainsi il reste aisé de combiner différentes fonctionnalités.

### Quels problèmes peut il résoudre ?
### Par quelle solutions ?

## Comment mettre en oeuvre le Decorator pattern ?


En [programmation orientée objet](https://fr.wikipedia.org/wiki/Programmation_orient%C3%A9e_objet), le modèle de décorateur est un modèle de conception qui permet d'ajouter un comportement à un objet individuel, de manière dynamique, sans affecter le comportement des autres objets de la même classe. Le modèle de décorateur est souvent utile pour adhérer au principe de responsabilité unique, car il permet de diviser la fonctionnalité entre les classes avec des domaines de préoccupation uniques ainsi qu'au principe open-closed, en permettant à la fonctionnalité d'une classe d'être prolongé sans être modifié. L'utilisation du décorateur peut être plus efficace que la sous-classification, car le comportement d'un objet peut être augmenté sans définir un objet entièrement nouveau.



**sources** 
https://www.jmdoudoux.fr/java/dej/chap-design-patterns.htm
