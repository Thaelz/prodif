create table universites (
	iduniv decimal,
	adr varchar(50),

	PRIMARY KEY(iduniv)
);

create table dptinfo (
	iddpt decimal,
	adr varchar(50),
	iduniv decimal,

	PRIMARY KEY(iddpt),
	FOREIGN KEY (iduniv) REFERENCES universites(iduniv)
);	

