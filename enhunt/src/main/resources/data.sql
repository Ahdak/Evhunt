-- Remplissage Evenements
insert into sources (nom) values('Candidature sur Poste');
insert into sources (nom) values('Candidature spontannee');
insert into sources (nom,date_source) values('Forum Paris 6','22 Mai 2017');
insert into sources (nom,date_source) values('Journee Porte Ouverte SG','15 Septembre 2017');
insert into sources (nom,date_source) values('Forum Mines Paris','22 Janvier 2018');

-- Candidat 1
insert into candidat (prenom,nom,mail,mobile,titre,competences,etudes,langues,controle_valide_rh,id_source)
values('Ahmed', 'DAMMAK','ahmed@dammak.net','00 33 6 40 95 66 65', 'Developpeur Full Stack',
	'Java SE/EE, SQL, Spring',
	'2013 - Diplome Ingénieur ENSEIRB',
	'FR / EN / AR',
	'VALIDE',3
	 );

insert into experiences (id_candidat,description) values(1,'Experience 1 ADK');
insert into experiences (id_candidat,description) values(1,'Experience 2 ADK');

-- Candidat 2
insert into candidat (prenom,nom,mail,mobile,titre,competences,etudes,langues,controle_valide_rh,id_source)
values('Samir', 'LILI','samir.lili@mail.com','00 33 6 22 66 45 01', 'Developpeur Java',
	'Java SE/EE, HTML, CSS.',
	'2013 - Diplome Ingénieur ENSEEIHT',
	'Francais, anglais, espagnol',
	'EN_ATTENTE',4
	 );

insert into experiences (id_candidat,description) values(2,'Experience 1 Samir');
insert into experiences (id_candidat,description) values(2,'Experience 2 Samir');

--- Postes 1 Developpeur
insert into postes (nom_manager,description,titre,keywords,etat,date_poste,departement)
values('Manager 1', 'Participer au developpement des applications de finance de marche','Developpeur JAVA Confirme','Java, Spring, Oracle','OUVERT','Janvier 2018', 'ITEC/FRM/CEQ');

-- Poste 2 BA
insert into postes (nom_manager,description,titre,keywords,etat,date_poste,departement)
values('Manager 1', 'Analyse du Pnl et des Analyses Risk','BA Junior','Pnl, risk','OUVERT','Janvier 2018','ITEC/FRM/CEQ');

--- Postes 3 Developpeur
insert into postes (nom_manager,description,titre,keywords,etat,date_poste,departement)
values('Manager 1', 'Participer au developpement des applications Web et des Web Service','Developpeur JAVA WEB','Java, HTML, Spring','OUVERT','Janvier 2018', 'ITEC/FRM/CRE');

-- Candidatures
insert into candidatures (id_candidat,id_poste,etat,type_contrat,metier)
values(1, 1,'ENTRETIEN_MANAGER','CDI','DEV');

-- Avis RH
insert into avis_rh (id_candidat,date_avis,avis,rh_name) values(1, '25 Janvier 2018','Excellent','RH 1');
insert into avis_rh (id_candidat,date_avis,avis,rh_name) values(1, '28 Janvier 2018','Très bon','RH 2');



