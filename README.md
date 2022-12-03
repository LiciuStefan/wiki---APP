# wiki - Design Pattern

Un Design Pattern (motif de conception) est une technique permettant de solutionner des problèmes courants. 

Il existe plusieurs types de Design Pattern :
  - Modèle de création
  - Modèle de structuration
  - modèle de comportement 
 
Nous allons traiter des Patterns Décorateur ainsi que Visiteur

## Description générale du pattern "Decorator"
Le Décorateur est un modèle de structuration qui permet d'ajouter des fonctions à un objet en étant moins "rigide" que l'héritage. Il n'est pas possible d'hériter si la classe est déclarée final, l'héritage nécessite la création de plusieurs classes ce qui peut être chronophage et énergivore. Les ajouts de fonctionnalités sont donc dynamiques et non plus statiques. Ce qui comporte l'avantage de pouvoir ajouter autant de fonctionnalités que souhaité et au fur et à mesure que l'on se rend compte de leur nécessité dans le développement, sans pour autant toucher au code de l'objet. Ainsi il reste aisé de combiner différentes fonctionnalités.

## Quels problèmes peut-il résoudre ?
Si on utilise l’héritage, il est nécessaire de définir autant de classes filles que de fonctionnalités, ce qui n’est pas efficace car le nombre de classes peut devenir trop grand. De plus l'héritage n’est pas toujours possible, par exemple si une classe est déclarée finale. En utilisant l’héritage, on ajoute des fonctionnalités de façon statique (à la compilation) 

## Par quelles solutions ?
Le modèle de conception décorateur nous permet de définir un ensemble de classes possédant une base commune, mais proposant des variantes, sans utiliser l’héritage.
Le principe du motif de conception décorateur est d’utiliser la composition: le décorateur contient un objet décoré. Ainsi on peut utiliser plusieurs classes de décoration pour instancier un objet plutôt que de créer une classe à part qui contiendrait du code redondant redondante. De cette manière on respecte le single-responsibility principle et on factorise le code.

## Comment mettre en oeuvre le Decorator pattern ?
Le décorateur dépend de deux entités:
le décoré: interface ou classe qui définit les fonctionnalités de base
le décorateur: classe enrichie qui contient les fonctionnalités de base plus celles ajoutées
Le décorateur encapsule le décoré dont l’instance est fournie dans les paramètres d’un constructeur. 

Pour implémenter le decorator pattern il suffit de créer un interface définissant les méthodes de notre objet, puis une classe objet qui implémente cette dernière. Ensuite il faudra coder la classe abstraite Décorateur qui implémente l’interface également mais de manière générique. Il ne reste plus qu’à étendre celle-ci avec autant de décorateurs concrets modifiant le comportement des méthodes que nécessaire, c'est-à-dire un pour chaque responsabilité/fonctionnalité. 


![image](https://user-images.githubusercontent.com/92160495/205003693-4cbfe6aa-d4a3-4ee3-90c6-b3c6a26d90f4.png)

**sources** 
https://www.jmdoudoux.fr/java/dej/chap-design-patterns.htm

## Description générale du pattern "Visitor"


## Quels problèmes peut-il résoudre ?
