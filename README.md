# BudgetMaster
Application SpringBoot avec une architecture hexagonale. 
C'est un projet expérimentale, dans le but d'acquérir des connaissances (design pattern, clean code, nouvelles fonctionalitées java, librairie, framework, ...)

# To-do list

## Api-user :
- [X] End Point "registration" => ajouter un contrôle sur l'existance de l'adresse mail.
- [ ] End Point "registration" => ajouter une validation de l'objet domain avec java validation. Intégrer la solution directement dans le builder.
- [ ] End Point "registration" => faire évoluter la validation de l'objet en utilisant des groupes personalisés
- [ ] Modulariser l'application (séparation des dépendances) => 1 module "user" parents du module "domain" et du module "infrastructure"
- [ ] Créer un end point pour récupérer l'utilisateur par son id
- [ ] Créer un end point pour modifier les données d'un utilisateur
- [ ] Ajouter des tests unitaires
- [ ] Ajouter des tests d'architectures
- [ ] Ajouter des tests d'intégration

## Application :
- [ ] ajouter une api-authentification (gestion de la sécurité avec spring-security)
