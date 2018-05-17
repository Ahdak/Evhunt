create table candidat
(
   id integer not null AUTO_INCREMENT,
   prenom varchar(255) not null,
   nom varchar(255) not null,
   mail varchar(255) not null,
   mobile varchar(255) not null,
   titre varchar(255) not null,
   competences varchar(255) not null,
   etudes varchar(255) not null,
   langues varchar(255) not null,
   controle_valide_rh varchar(255) not null,
   id_source varchar(255) not null,
   primary key(id)
   --foreign key (id_source) references sources(id)
);

create table experiences
(
   id integer not null AUTO_INCREMENT,
   id_candidat int not null,
   description varchar(255) not null,
   primary key(id)
);

create table sources
(
   id integer not null AUTO_INCREMENT,
   nom varchar(255) not null,
   date_source varchar(255),
   primary key(id)
);

create table postes
(
   id integer not null AUTO_INCREMENT,
   nom_manager varchar(255) not null,
   description varchar(255) not null,
   titre varchar(255) not null,
   keywords varchar(255) not null,
   etat varchar(255) not null,
   date_poste varchar(255),
   departement varchar(255),
   primary key(id)
);

create table candidatures
(
   id integer not null AUTO_INCREMENT,
   id_candidat int not null,
   id_poste int not null, 
   etat varchar(255) not null,
   type_contrat varchar(255) not null,
   metier varchar(255) not null,
   primary key(id)
);

create table avis_rh
(
   id integer not null AUTO_INCREMENT,
   id_candidat int not null,
   date_avis varchar(255) not null,
   avis varchar(255) not null,
   rh_name varchar(255) not null,
   primary key(id)
);