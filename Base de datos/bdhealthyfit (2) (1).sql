-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-10-2022 a las 07:02:29
-- Versión del servidor: 8.0.28
-- Versión de PHP: 8.0.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdhealthyfit`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registro`
--

CREATE TABLE `registro` (
  `cod_registro` char(5) NOT NULL,
  `cod_usuario` char(5) NOT NULL,
  `fecha` datetime NOT NULL,
  `talla` double(3,2) NOT NULL,
  `peso` double(5,2) NOT NULL,
  `imc` double(5,2) NOT NULL,
  `recomendacion` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `registro`
--

INSERT INTO `registro` (`cod_registro`, `cod_usuario`, `fecha`, `talla`, `peso`, `imc`, `recomendacion`) VALUES
('R0001', 'C0001', '2022-01-10 01:22:30', 1.65, 78.00, 28.70, 'Recuerda hacer ejercicio regularmente para salir del sobrepeso.¡No te rindas, tú puedes!'),
('R0002', 'C0005', '2022-10-20 08:10:00', 1.65, 105.40, 38.70, 'Mantener un peso ideal para la salud es recomendable. Recuerde tomar 2 litros de agua al día para llegar a ese peso ideal.'),
('R0003', 'C0007', '2022-10-03 07:00:00', 1.56, 78.80, 32.40, 'Presenta obesidad. Es recomendable que baje de peso para evitar enfermedades crónicas relacionadas a este. Para ello consuma menos carbohidratos y más proteína'),
('R0004', 'C0004', '2022-09-22 08:30:00', 1.57, 42.50, 17.20, 'Presenta un bajo peso. Coma alimentos ricos en nutrientes y prube batidos de frutas o verduras para ganar peso de manera saludable. '),
('R0005', 'C0007', '2022-10-21 10:30:00', 1.56, 77.90, 32.40, 'Se le considera una persona obesa, trate de hacer algún ejercicio con ello bajará grasa.  ¡Recuerde que todo esfuerzo tiene su recompensa!'),
('R0006', 'C0006', '2022-08-04 20:10:00', 1.86, 130.00, 37.60, 'Presenta obesidad. Sustituya sus antojos dulces como chocolates y postres por frutas dulces tales como la sandía, pera, plátano,etc. ¡Delicioso y nutritivo!');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `cod_usuario` char(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `email` varchar(50) NOT NULL,
  `contraseña` varchar(50) NOT NULL,
  `nombre` varchar(150) NOT NULL,
  `edad` int NOT NULL,
  `sexo` varchar(9) NOT NULL,
  `objetivo` double(5,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`cod_usuario`, `email`, `contraseña`, `nombre`, `edad`, `sexo`, `objetivo`) VALUES
('C0001', 'marianalopez@gmail.com', 'soyml123', 'Mariana Lopez', 24, 'Femenino', 60.00),
('C0002', 'm.lilianaz@hotmail.com', '12345671', 'Liliana Marquez', 48, 'Femenino', 89.50),
('C0003', 'yosoyalan@gmail.com', 'a1l1a1n', 'Alan Aguilar', 34, 'Masculino', 76.00),
('C0004', 'kate_2003@gmail.com', 'k293938', 'Kate Castillo', 19, 'Femenino', 48.00),
('C0005', 'gozdieguito@hotmail.com', 'hu1o2nm1', 'Diego Gomez', 41, 'Masculino', 80.00),
('C0006', 'sickandtired@gmail.com', 'tttt11', 'Patricio Perez', 22, 'Masculino', 68.50),
('C0007', 'car_men_med@gmail.com', 'carmen7892', 'Carmen Medina', 56, 'Femenino', 65.50);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `registro`
--
ALTER TABLE `registro`
  ADD PRIMARY KEY (`cod_registro`),
  ADD UNIQUE KEY `cod_registro` (`cod_registro`),
  ADD UNIQUE KEY `cod_registro_2` (`cod_registro`),
  ADD KEY `cod_registro_3` (`cod_registro`),
  ADD KEY `cod_usuario` (`cod_usuario`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`cod_usuario`),
  ADD UNIQUE KEY `cod_usuario` (`cod_usuario`),
  ADD KEY `cod_usuario_2` (`cod_usuario`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `registro`
--
ALTER TABLE `registro`
  ADD CONSTRAINT `registro_ibfk_1` FOREIGN KEY (`cod_usuario`) REFERENCES `usuario` (`cod_usuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
