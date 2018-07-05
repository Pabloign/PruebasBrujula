var nombreExpreg = new RegExp("^[a-z A-Z]{1,10}$");
var apellidosExpreg = new RegExp("^[a-z A-Z]{1,20}$");
var telefonoExpreg = new RegExp("^[0-9]{0,9}$");
var emailExpreg = new RegExp("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,4}$");
 
function validar() {
    var texto = "El formulario se ha rellenado correctamente";
    var nombre = document.getElementById('nombre').value;
    //alert(nombre);
    if (!nombreExpreg.test(nombre)) {
        texto = "El formulario no cumple alguna de las restricciones";
    }
    var apellidos = document.getElementById('apellidos').value;
    //alert(apellidos);
    if (!apellidosExpreg.test(apellidos)){
        texto = "El formulario no cumple alguna de las restricciones";
    }
    var telefono = document.getElementById('telefono').value;
    //alert(telefono);
    if (!telefonoExpreg.test(telefono)){
        texto = "El formulario no cumple alguna de las restricciones";
    }
    var email = document.getElementById('email').value;
    //alert(email);
    //texto = expreg.test(nombre) ? "El formulario se ha rellenado correctamente" : "El formulario no cumple alguna de las restricciones";
    
    if (!emailExpreg.test(email)){
        texto = "El formulario no cumple alguna de las restricciones";
    }

    document.getElementsByTagName("footer")[0].innerText = texto;
    return false;
}