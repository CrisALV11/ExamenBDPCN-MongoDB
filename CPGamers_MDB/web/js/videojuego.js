function registrarVideojuego()
{
    var videojuego = new Object(); 
    var nombre = $("#txtNombre").val();
    var plataforma = $("#txtPlataforma").val();
    var marca = $("#txtMarca").val();
    var clasificacion = $("#txtClasificacion").val();
    var tipo = $("#txtTipo").val();
    var annioEstreno = $("#txtAnnioE").val();
    
    videojuego = {"nombre": nombre, "plataforma": plataforma, "marca": marca, "clasificacion": clasificacion, "tipo": tipo, "annioEstreno": annioEstreno};

    var data = {"videojuego": JSON.stringify(videojuego)};

    $.ajax(
            {
                "url": "api/videojuego/insertarRegistro",
                "type": "GET",
                "async": true,
                "data": data
            }).done(
            function (data)
            {
                if (data.result != null)
                {
                    Swal.fire({
                        icon: 'success',
                        title: '¡Éxito!',
                        text: "Se realizó la inserción correctamente",
                        showConfirmButton: false,
                        timer: 2500
                    });
                    limpiarFormulario();
                } 
                else if (data.error != null)
                {
                    Swal.fire({
                        icon: 'error',
                        title: 'Algo salio mal',
                        text: data.error,
                        showConfirmButton: false,
                        timer: 2500
                    });
                }
            }
    );
}

function limpiarFormulario()
{
    document.getElementById("txtNombre").value = "";
    document.getElementById("txtPlataforma").value = "";
    document.getElementById("txtMarca").value = "";
    document.getElementById("txtClasificacion").value = "";
    document.getElementById("txtTipo").value = "";
    document.getElementById("txtAnnioE").value = "";
}