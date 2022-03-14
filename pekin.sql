create database pekin;


	create table menu(
	id_menu SERIAL PRIMARY KEY not null,
	foto text not null,
	nombre varchar(45) not null,
	descripcion varchar (45) not null,
	precio double not null
	);

	create table detalle_producto()
		id_detalleProducto SERIAL PRIMARY KEY not null,
		id_menu int not null,
		cantidad int not null,
		total_pago double not null,
		CONSTRAINT id_menu
      FOREIGN KEY(id_menu) 
	  REFERENCES menu(id_menu)
	);

create table ubicacion_entrega(
	id_ubicacion SERIAL PRIMARY KEY not null,
	ubicacion varchar(25) not null,
	localidad varchar (30) not null,
	calle varchar(45) not null,
	referencia varchar (50) not null,
	fecha date not null,
	hora varchar (20) not null	
);

create table orden_cliente(
	id_orden SERIAL PRIMARY KEY not null,
	nombre varchar (45) not null,
	id_ubicacion int not null,
	id_detalleProducto int not null,
	CONSTRAINT id_ubicacion
      FOREIGN KEY(id_ubicacion) 
	  REFERENCES menu(id_ubicacion),
	  CONSTRAINT id_detalleProducto
      FOREIGN KEY(id_detalleProducto) 
	  REFERENCES menu(id_detalleProducto)
);
