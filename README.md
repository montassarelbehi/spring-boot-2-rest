# spring-boot-2-rest

This is a sample project to expose rest endpoints using Spring Boot 2.0.1 .

REST endpoints:

UtilisateurController:

[GET]   @:port/utilisateur//login/{login}/{password}  takes a login & password couple   returns an Utilisateur

[POST]  @:port/utilisateur/upsert/                    takes an Utilisateur body.


ProduitController:

[POST]    @:port/produit/upsert/get/produit             takes a Produit                   returns a Produit

[POST]    @:port/produit/upsert/get/id                  takes a Produit                   returns the Produit Id

[GET]     @:port/produit/quantity/{type}/{stockId}      takes a type and stockId          returns a list of Produit

[GET]     @:port/produit/by/{productId}

[GET]     @:port/produit/all

[GET]     @:port/produit/all/{type}

[DELETE]  @:port/produit/by/{productId}

[DELETE]  @:port/produit/all



