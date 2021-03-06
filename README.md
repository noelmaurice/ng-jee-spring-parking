# ng-jee-spring-parking

# Introduction

Ce projet est un projet pédagogique. En règle générale, par souci de discrétion et de respect pour les employeurs, les projets professionnels ne sont pas disponibles sur ce repository.

# Copie d'écrans de l'application 

## Affichage des parkings et de leur disponibilité :

<img src="doc/demo/parkings.png" />

## Affichage du détail d'un parking

<img src="doc/demo/parkings.png" />


## Partie back-end

L'application principale se trouve à la racine de l'arborescence du projet. Cette application est réalisée avec le framework Sring et le langage JEE. 

Elle fournie les web services qui interrogent les "open data" de la métropole de Nantes pour ces parkings en utilisant l'URL : https://data.nantesmetropole.fr/api/records/1.0/search/?dataset=244400404_parkings-publics-nantes-disponibilites&q=&facet=grp_nom&facet=grp_statut

Le lancement de cette application dans un serveur Apache se fait via Spring Boot. 

## Partie front-end

L'IHM d'affichage des disponibilités des parkings est réalisée avec le framework Angular. Cette application est disponible dans le sous-répertoire du projet "parking-ui". 

Le principe de cette application est d'interroger les web services de l'application principale pour obtenir les informations de disponibilité des parkings en temps réel, et ensuite de les afficher à l'utilisateur.

**Enjoy ;)**
