# ng-jee-spring-parking

L'application principale se trouve à la racine de l'arborescence du projet. Cette application est réalisée avec le framework Sring et le langage JEE. Elle fournie les web services qui interroge les "open data" des parkings en utilisant l'URL : https://data.nantesmetropole.fr/api/records/1.0/search/?dataset=244400404_parkings-publics-nantes-disponibilites&q=&facet=grp_nom&facet=grp_statut

Le lancement de cette application dans un serveur Apache se fait via Spring Boot.

L'IHM d'affichage des disponibilité des parkings est réalisée avec le framework Angular. Cette application est disponible dans le sous-répertoire du projet "parking-ui". Le principe de cette application est d'interroger les web services pour obtenir les informations de disponibilité des parkings et ensuite les afficher à l'utilisateur.

Enjoy, ;)
