-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 24/03/2025 às 17:28
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `registro_atividadefisica`
--

--
-- Despejando dados para a tabela `atividade`
--

INSERT INTO `atividade` (`id`, `usuario_id`, `tipo`, `duracao`, `distancia_carga`, `data`, `intensidade`) VALUES
(123, 123, 'corrida', '30minutos', 1, '2025-03-19', 'baixa ');

--
-- Despejando dados para a tabela `historico`
--

INSERT INTO `historico` (`id`, `usuario_id`, `atividade_id`, `duracao`, `dados`, `distancia_carga`) VALUES
(123, 123, 123, '30minutos', 'Realiza corrida no dia 19/03/2025\r\n', 1);

--
-- Despejando dados para a tabela `metas`
--

INSERT INTO `metas` (`id`, `usuario_id`, `tipo`, `descricao`, `progresso`, `data`, `status`) VALUES
(123, 123, 'Pedalar ', 'Peladar por 30 minutos \r\n', 0, '2025-03-28', 'iniciando ');

--
-- Despejando dados para a tabela `notificacao`
--

INSERT INTO `notificacao` (`id`, `usuario_id`, `tipo`, `mensagem`, `lida`) VALUES
(123, 123, 'Tomar água ', 'LEMBRETE- hora de tomar água ', 0);

--
-- Despejando dados para a tabela `usuario`
--

INSERT INTO `usuario` (`id`, `nome`, `email`, `senha`, `data_nascimento`) VALUES
(123, 'Lorena ', 'lorena@gmail.com', 'lorena214', '2015-03-02');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
