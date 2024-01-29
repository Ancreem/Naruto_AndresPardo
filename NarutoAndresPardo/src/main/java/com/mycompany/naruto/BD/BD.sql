drop database Naruto_AndresPardo;

create database Naruto_AndresPardo;

use Naruto_AndresPardo;

CREATE TABLE Mision(
    ID INT NOT NULL ,
    Descripcion VARCHAR(255) NOT NULL,
    Rango VARCHAR(255) NOT NULL,
    Recompensa DOUBLE NOT NULL
);
CREATE TABLE Habilidad(
    ID_Ninja INT NOT NULL ,
    Nombre VARCHAR(255) NOT NULL,
    Descripcion VARCHAR(255) NOT NULL
);
CREATE TABLE Ninja(
    ID INT NOT NULL ,
    Nombre VARCHAR(255) NOT NULL,
    Rango VARCHAR(255) NOT NULL,
    Aldea VARCHAR(255) NOT NULL
);
CREATE TABLE MisionNinja(
    ID INT NOT NULL,
    ID_Mision INT NOT NULL,
    ID_Ninja INT NOT NULL ,
    FechaInicio DATE NOT NULL,
    FechaFin DATE NULL,
    Estado VARCHAR(255) NULL
);



alter table Mision add CONSTRAINT PK_Mision_ID primary KEY(ID);
alter table Habilidad add constraint PK_Habilidad_ID primary KEY (ID_Ninja);
alter table Ninja add constraint PK_Ninja_ID primary key (ID);
alter table MisionNinja add constraint PK_Mision_ID primary key(ID);
    
ALTER TABLE
    MisionNinja 
    ADD CONSTRAINT FK_misionninja_ID FOREIGN KEY(ID_Mision) REFERENCES Mision(ID),
    ADD CONSTRAINT FK_misionninja_id_ninja FOREIGN KEY(ID_Ninja) REFERENCES Ninja(ID);
ALTER TABLE
    Habilidad ADD CONSTRAINT FK_habilidad_id_ninja FOREIGN KEY(ID_Ninja) REFERENCES Ninja(ID);