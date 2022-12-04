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
![image](https://refactoring.guru/images/patterns/diagrams/decorator/structure.png)



## Description générale du pattern "Visitor"
Le design pattern visitor permet de séparer les implémentations algorithmiques des classes objets. C’est-à-dire qu’en utilisant la méthode visitor, cela nous permet de pouvoir modifier/ajouter du code aux classes objets sans en modifier grandement leur contenu. Ce comportement permet donc de pouvoir travailler à plusieurs sur différentes fonctionnalités, sans gêner les équipes voisines, ni risquer des bugs de part et d’autre. C'est un comportement compliqué à mettre en oeuvre, surtout une fois que le code est déjà bien avancé. Afin de l'utiliser, il vaut mieux l'implémenter dès le départ.

## Quels problèmes peut-il résoudre ?
En utilisant une interface visitor et tout ce qu’elle génère, cela nous permet de pouvoir apporter des modifications à notre code, sans pour autant toucher au code source. Si on est dans l’incapacité de toucher au code source pour quelques raisons, on peut quand même y ajouter des fonctionnalités grâce à cette hiérarchie crée au sain de la classe visitor, qui permet de visiter chaque « étage » des classes java implémentées. Cependant, ce comportement est délaissé au vu de sa complexité de mise en œuvre mais aussi à cause de sa rareté d’utilisation.

## Par quelles solutions ?
En créant une interface visitor, dans le code, qui possède comme une fonction pour chaque étage, qui visite l’étage du code, on peut par la suite créer une classe ConcreteVisitor qui implémente l’interface visitor, et qui implémente donc les fonctions à utiliser en veillant bien à ce qu’elle soit implémentée en fonction des classes des éléments concrets. Par la suite, on veille à ce que les classes possèdent bien la fonction accept avec en paramètre un visitor, afin de pouvoir appeler les fonctions voulues, et donc de ramener les nouvelles fonctionnalités implémentées dans ConcreteVisitor.

## Comment mettre en oeuvre le Decorator pattern ?
Afin de l’implémenter, il nous faut donc tout d’abord l’interface Visitor, qui définit les méthodes qui vont être utilisées, avec en paramètre les objets concrets spécifiés (méthode double dispatch). Puis, par la suite on crée donc la méthode ConcreteVisitor, où ici on implémente les méthodes définies dans l’interface Visitor, afin de pouvoir les utiliser par la suite. Pour finir, on doit implémenter dans l’interface principale des objets la fonction accept de paramètre visitor, afin de pour avoir accès aux méthodes fraîchement implémentées dans chaque objet, qu’on pourra appeler en mettant en paramètre l’objet voulu (on mettra this).

![image](https://refactoring.guru/images/patterns/diagrams/visitor/structure-fr.png?id=41414651c6e0a43124f0485eb4169bf2)

**sources** 

https://www.jmdoudoux.fr/java/dej/chap-design-patterns.htm
https://refactoring.guru/design-patterns/decorator
https://en.wikipedia.org/wiki/Decorator_pattern
https://refactoring.guru/fr/design-patterns/visitor
https://refactoring.guru/fr/design-patterns/visitor-double-dispatch
https://fr.wikipedia.org/wiki/Visiteur_(patron_de_conception)#Définition
https://refactoring.guru/fr/design-patterns/visitor/java/example#example-0--visitor-XMLExportVisitor-java
