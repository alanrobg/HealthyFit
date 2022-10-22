<?php
/**
 * Obtiene todas las metas de la base de datos
 */

require 'Registro.php';

if ($_SERVER['REQUEST_METHOD'] == 'GET') {

    // Manejar petición GET
    $registros = Registro::getAll();

    if ($registros) {

        $datos["estado: "] = 1;
        $datos["Datos de Usuario: "] = $registros;

        print json_encode($datos);
    } else {
        print json_encode(array(
            "estado" => 2,
            "mensaje" => "Ha ocurrido un error"
        ));
    }
}