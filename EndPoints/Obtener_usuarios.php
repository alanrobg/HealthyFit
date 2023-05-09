<?php
/**
 * Obtiene todas las metas de la base de datos
 */

require 'Usuarios.php';

if ($_SERVER['REQUEST_METHOD'] == 'GET') {

    // Manejar petición GET
    $usuarios = Usuarios::getById("C0001");

    if ($usuarios) {

        $datos["estado: "] = 1;
        $datos["Datos de Usuario: "] = $usuarios;

        print json_encode($datos);
    } else {
        print json_encode(array(
            "estado" => 2,
            "mensaje" => "Ha ocurrido un error"
        ));
    }
}