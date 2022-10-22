<?php

/**
 * Representa el la estructura de las metas
 * almacenadas en la base de datos
 */
require 'Database.php';

class Registro
{
    function __construct()
    {
    }

    /**
     * Retorna en la fila especificada de la tabla 'meta'
     *
     * @param $idMeta Identificador del registro
     * @return array Datos del registro
     */
    public static function getAll()
    {
        $consulta = "SELECT * FROM registro";
        try {
            // Preparar sentencia
            $comando = Database::getInstance()->getDb()->prepare($consulta);
            // Ejecutar sentencia preparada
            $comando->execute();

            return $comando->fetchAll(PDO::FETCH_ASSOC);

        } catch (PDOException $e) {
            return false;
        }
    }

    /**
     * Obtiene los campos de una meta con un identificador
     * determinado
     *
     * @param $idMeta Identificador de la meta
     * @return mixed
     */
    public static function getById($Id)
    {
        // Consulta de la meta
        $consulta = "SELECT cod_usuario,
                            fecha,
                            talla,
                            peso,
                            imc,
                            recomendacion,                      
                            WHERE cod_registro = ?";

        try {
            // Preparar sentencia
            $comando = Database::getInstance()->getDb()->prepare($consulta);
            // Ejecutar sentencia preparada
            $comando->execute(array($Id));
            // Capturar primera fila del resultado
            $row = $comando->fetch(PDO::FETCH_ASSOC);
            return $row;

        } catch (PDOException $e) {
            // Aquí puedes clasificar el error dependiendo de la excepción
            // para presentarlo en la respuesta Json
            return -1;
        }
    }

    /**
     * Actualiza un registro de la bases de datos basado
     * en los nuevos valores relacionados con un identificador
     *
     */
    public static function update(
        $cod_reg,
        $cod_us,
        $fecha,
        $talla,
        $peso,
        $imc,
        $recomendacion
    )
    {
        // Creando consulta UPDATE
        $consulta = "UPDATE registro" .
            " SET fecha=?, talla=?, peso=?, imc=?, recomendacion=?" .
            "WHERE Id=?";

        // Preparar la sentencia
        $cmd = Database::getInstance()->getDb()->prepare($consulta);

        // Relacionar y ejecutar la sentencia
        $cmd->execute(array($fecha, $talla, $peso, $imc, $recomendacion));

        return $cmd;
    }

    /**
     * Insertar una nueva meta
     *
     * @param $titulo      titulo del nuevo registro
     * @param $descripcion descripción del nuevo registro
     * @param $fechaLim    fecha limite del nuevo registro
     * @param $categoria   categoria del nuevo registro
     * @param $prioridad   prioridad del nuevo registro
     * @return PDOStatement
     */
    public static function insert(
        $cod_reg,
        $cod_us,
        $fecha,
        $talla,
        $peso,
        $imc,
        $recomendacion
    )
    {
        // Sentencia INSERT
        $comando = "INSERT INTO usuario ( " .
            " fecha," .
            " talla," .
            " peso," .
            " imc," .
            " recomendacion)" .
            " VALUES($fecha,$talla,$peso,$imc,$recomendacion )";

        // Preparar la sentencia
        $sentencia = Database::getInstance()->getDb()->prepare($comando);

        return $sentencia->execute(
            array(
                $fecha,
                $talla,
                $peso,
                $imc,
                $recomendacion
            )
        );

    }

    /**
     * Eliminar el registro con el identificador especificado
     *
     * @param $idMeta identificador de la meta
     * @return bool Respuesta de la eliminación
     */
    public static function delete($Id)
    {
        // Sentencia DELETE
        $comando = "DELETE FROM registro WHERE cod_registro =?";

        // Preparar la sentencia
        $sentencia = Database::getInstance()->getDb()->prepare($comando);

        return $sentencia->execute(array($Id));
    }
}

?>