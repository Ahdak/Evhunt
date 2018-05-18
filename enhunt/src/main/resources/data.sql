-- Remplissage Evenements
insert into sources (nom) values('Candidature sur Poste');
insert into sources (nom) values('Candidature spontannee');
insert into sources (nom,date_source) values('Forum Paris 6','22 Mai 2017');
insert into sources (nom,date_source) values('Journee Porte Ouverte SG','15 Septembre 2017');
insert into sources (nom,date_source) values('Forum Mines Paris','22 Janvier 2018');

-- Candidat 1
insert into candidat (prenom,nom,mail,mobile,titre,competences,etudes,langues,controle_valide_rh,id_source,type_contrat,metier)
values('Ahmed', 'DAMMAK','ahmed@dammak.net','00 33 6 40 95 66 65', 'Developpeur Full Stack',
	'Java SE/EE, SQL, Spring, Watson',
	'2013 - Diplome Ingénieur ENSEIRB',
	'Francais, anglais.',
	'VALIDE',3,'CDI','DEV'
	 );

insert into experiences (id_candidat,description) values(1,'Experience 1 ADK');
insert into experiences (id_candidat,description) values(1,'Experience 2 ADK');

-- Candidat 2
insert into candidat (prenom,nom,mail,mobile,titre,competences,etudes,langues,controle_valide_rh,id_source,type_contrat,metier)
values('Samir', 'LILI','samir.lili@mail.com','00 33 6 22 66 45 01', 'Developpeur Java',
	'Java SE/EE, HTML, CSS.',
	'2013 - Diplome Ingénieur ENSEEIHT',
	'Francais, anglais, espagnol',
	'EN_ATTENTE',4,'CDI','DEV'
	 );

-- Candidat 3
insert into candidat (prenom,nom,mail,mobile,titre,competences,etudes,langues,controle_valide_rh,id_source,type_contrat,metier)
values('Rafik', 'Bouguerra','rafik.bougerra@mail.com','00 33 6 22 55 67 55', 'chef de projet',
	'Java SE/EE, Spring, Kibana.',
	'2009 - Diplome Ingénieur ENSEEIHT',
	'Francais, anglais, allemand',
	'VALIDE',4,'CDI','CDP'
	 );

-- Candidat 4
insert into candidat (prenom,nom,mail,mobile,titre,competences,etudes,langues,controle_valide_rh,id_source,type_contrat,metier)
values('Meng', 'Han','mang.han@mail.com','00 33 6 23 31 40 87', 'Developpeur Java',
	'Java SE/EE, Sql, Oracle.',
	'2013 - Diplome Ingénieur Paris 6',
	'Francais, anglais, chinois',
	'VALIDE',4,'CDI','DEV'
	 );

-- Candidat 5
insert into candidat (prenom,nom,mail,mobile,titre,competences,etudes,langues,controle_valide_rh,id_source,type_contrat,metier)
values('Fabuela', 'Jiochang','fabuala.jiochang@mail.com','00 33 6 22 45 87 44', 'Developpeur Java',
	'Java SE/EE, Sql, Oracle.',
	'2013 - Diplome Ingénieur Centrale Paris',
	'Francais, anglais, Japonais',
	'VALIDE',4,'CDI','DEV'
	 );

insert into experiences (id_candidat,description) values(2,'Experience 1 Samir');
insert into experiences (id_candidat,description) values(2,'Experience 2 Samir');

--- Postes 1 Developpeur
insert into postes (nom_manager,description,titre,keywords,etat,date_poste,departement,type_contrat,metier)
values('Manager 1', 'Participer au developpement des applications de finance de marche','Developpeur JAVA Confirme','Java, Spring, Oracle','OUVERT','Janvier 2018', 'ITEC/FRM/CEQ','CDI','DEV');

-- Poste 2 BA
insert into postes (nom_manager,description,titre,keywords,etat,date_poste,departement,type_contrat,metier)
values('Manager 1', 'Analyse du Pnl et des Analyses Risk','BA Junior','Pnl, risk','OUVERT','Janvier 2018','ITEC/FRM/CEQ','CDI','BA');

--- Postes 3 Developpeur
insert into postes (nom_manager,description,titre,keywords,etat,date_poste,departement,type_contrat,metier)
values('Manager 2', 'Participer au developpement des applications Web et des Web Service','Developpeur JAVA WEB','Java, HTML, Spring','OUVERT','Janvier 2018', 'ITEC/FRM/CRE','CDD','DEV');

--- Postes 4 CDP
insert into postes (nom_manager,description,titre,keywords,etat,date_poste,departement,type_contrat,metier)
values('Manager 2', 'Gestion de projet','Chef de Projet','Java, HTML, Spring','OUVERT','Janvier 2018', 'ITEC/FRM/CRE','CDD','CDP');

-- Candidatures
insert into candidatures (id_candidat,id_poste,etat)values(1, 1,'ENTRETIEN_MANAGER');

-- Avis RH
insert into avis_rh (id_candidat,date_avis,avis,rh_name) values(1, '25 Janvier 2018','Excellent','RH 1');
insert into avis_rh (id_candidat,date_avis,avis,rh_name) values(1, '28 Janvier 2018','Très bon','RH 2');



