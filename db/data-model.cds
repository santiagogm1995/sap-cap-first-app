namespace my.bookshop;

entity Empleado {
  key DNI : String;
  nombre : String;
  apellido : String;
  edad : Integer;
  altura : Double;
}

entity Animal {
  key nombre: String;
  alimento : String;
  typo : String;
}

entity Vaca {
  key parent : Association to one Animal;
  pelaje : String;
}


