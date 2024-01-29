insert into Mision (ID, Descripcion, Rango, Recompensa) values
(1, "Capturar un gato", "Genin", 10),
(2, "Escoltar alguien importante", "Chouning", 70),
(3, "Capturar a Sasuke", "Genin", 3000),
(4, "Investigar en las aguas termales", "Genin", 10),
(5, "Proteger a toda costa el hokage", "Chouning", 10000),
(6, "Escoltar alguien importante", "Chouning", 1000),
(7, "Capturar a madara", "Chouning", 10000);


insert into Ninja (ID, Nombre, Rango, Aldea) values
(1, "Gara", "Hokage", "Aldea de la arena"),
(2, "Sakura", "Chouning", "Konoha"),
(3, "Naruto", "Genin", "Konoha"),
(4, "Jiraiya", "Chouning", "Konoha"),
(5, "Obito", "Chouning", "Konoha");

insert into Habilidad (ID_Ninja, Nombre, Descripcion) values
(1, "Ataud de arena", "Encierra a su oponente en arena y lo aplasta hasta morir" ),
(2, "Nada", "No sabe hacer nada mas que decir que es muy debil y burlarse de los que no tienen papa" ),
(3, "Rasengan", "Una habilidad creada por el 4to hokage, puede mandar a volar a cualquiera y tiene gran poder" ),
(4, "Modo sabio", "Incrementa su fuerza y velocidad, un power up en habilidades y otras cosas" ),
(5, "Curacion", "Cura a sus compañeros concentrando el chakra en la palma de su mano" );

insert into MisionNinja (ID, ID_Mision, ID_Ninja, FechaInicio, FechaFin, Estado) values
(1, 7, 1, "2024-02-23", "2024-02-24", "Disponible"),
(2, 7, 2, "2024-01-23", "2024-01-25", "Completado"),
(3, 7, 3, "2024-02-23", "2024-02-26", "Disponible"),
(4, 4, 4, "2024-01-23", "2024-01-27", "Completado");