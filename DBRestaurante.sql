create database DBRestaurante;
use DBRestaurante;

create table areas(
	idarea int not null auto_increment,
    descripcion varchar(45) not null,
    primary key pk_idarea (idarea)
);

create table cocinero(
	idcocinero int not null auto_increment,
    nombre varchar(45) not null,
    apellido varchar(45) not null,
    especialidad varchar(45) not null,
    primary key pk_idcocinero (idcocinero)
);

create table plato(
	idplato int not null auto_increment,
    descripcion varchar(45) not null,
    primary key pk_idplato (idplato)
);

create table cliente(
	idcliente int not null auto_increment,
    nombre varchar(45) not null,
    apellido varchar(45) not null,
    dpi varchar(45) not null,
    primary key pk_idcliente (idcliente)
);

create table mesero(
	idmesero int not null auto_increment,
    nombre varchar(45) not null,
    apellido varchar(45) not null,
    dpi varchar(45) not null,
    primary key pk_idmesero (idmesero)
);

create table mesa(
	idmesa int not null auto_increment,
    descripcion varchar(45) not null,
    numcomensales varchar(45) not null,
    idarea int not null,
    primary key pk_idmesa (idmesa),
    foreign key mesa(idarea) references areas(idarea)
);

create table factura(
	idfactura int not null auto_increment,
    fecha date not null,
    idcliente int not null,
    idmesero int not null,
    idmesa int not null,
    primary key pk_idfactura (idfactura),
    foreign key factura_cliente(idcliente) references cliente(idcliente),
    foreign key factur_mesero(idmesero) references mesero(idmesero),
    foreign key factura_mesa(idmesa) references mesa(idmesa)
);

create table detallefactura(
	iddetallefac int not null auto_increment,
    idfactura int not null,
    idplato int not null,
    idcocinero int not null,
    cantidad int not null,
    precion double not null,
    total double as (precion * cantidad),
    primary key pk_iddetalleFac (iddetallefac),
    foreign key detalledfactura_factura(idfactura) references factura(idfactura),
    foreign key detalleFactura_plato(idplato) references plato(idplato),
	foreign key detalleFactura_cocinero(idcocinero) references cocinero(idcocinero)
);

