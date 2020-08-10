using my.bookshop as my from '../db/data-model';
using test as test from '../db/data-model-test';

service CatalogService {
    entity Empleado as projection on my.Empleado;
    entity Vaca as projection on my.Vaca
    entity Animal as projection on my.Animal
}

service EmpleadoService {
	entity Empleado as projection on test.Empleado;
}