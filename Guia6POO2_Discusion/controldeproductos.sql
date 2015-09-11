-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-09-2015 a las 06:42:27
-- Versión del servidor: 5.6.17
-- Versión de PHP: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `controldeproductos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categorias`
--

CREATE TABLE IF NOT EXISTS `categorias` (
  `Idcategoria` varchar(10) NOT NULL,
  `Nombrecategoria` varchar(60) NOT NULL,
  PRIMARY KEY (`Idcategoria`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `categorias`
--

INSERT INTO `categorias` (`Idcategoria`, `Nombrecategoria`) VALUES
('2', 'Limpieza Personal'),
('23424234', 'vERDURAS'),
('7', 'Mascotas'),
('asdasdas', 'Frutas');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE IF NOT EXISTS `producto` (
  `Idproducto` varchar(10) NOT NULL,
  `Nombreproducto` varchar(60) NOT NULL,
  `Precio` double NOT NULL,
  `Idproveedor` varchar(10) NOT NULL,
  `Idcategoria` varchar(10) NOT NULL,
  `Existencias` float NOT NULL,
  PRIMARY KEY (`Idproducto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`Idproducto`, `Nombreproducto`, `Precio`, `Idproveedor`, `Idcategoria`, `Existencias`) VALUES
('1', 'asdasd', 45, '213123', '7', 0),
('123', 'dasdas', 12, '213123', '2', 12),
('2', 'sadasda', 45, '213123', '2', 0),
('3', 'Fresas', 0.12, '213123', 'asdasdas', 50),
('fdsfsd', 'dsfsdf', 14, '213123', '2', 0),
('sadasdsa', 'sadasdas', 10.2, '213123', '2', 10),
('ssadasd', 'dasdasdad', 124, '213123', '2', 12);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE IF NOT EXISTS `proveedor` (
  `Idproveedor` varchar(10) NOT NULL,
  `Nombreproveedor` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`Idproveedor`, `Nombreproveedor`) VALUES
('213123', 'Rexona');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
