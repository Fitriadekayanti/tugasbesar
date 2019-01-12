-- phpMyAdmin SQL Dump
-- version 4.6.6
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 18, 2018 at 11:52 AM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_karyawan`
--

CREATE TABLE `data_karyawan` (
  `ID` int(11) NOT NULL,
  `Nama` varchar(20) NOT NULL,
  `Tempat_Lahir` varchar(20) NOT NULL,
  `TTL` date NOT NULL,
  `Pendidikan` varchar(20) NOT NULL,
  `Status` varchar(20) NOT NULL,
  `Status_Diri` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `data_karyawan`
--

INSERT INTO `data_karyawan` (`ID`, `Nama`, `Tempat_Lahir`, `TTL`, `Pendidikan`, `Status`, `Status_Diri`) VALUES
(1, 'PBO diubah', 'Jogsdfs', '2018-11-13', 'D4', 'Kontrakan', 'Mahasiswaaaaa'),
(2, ' PBO KAMIS  ', 'Jog', '2018-11-12', 'D3', 'Kontrak', 'Mahasiswa'),
(5, ' PBO Test  ', 'Jakarta', '2018-11-19', 'S2', 'Kontrak', 'Menikah'),
(6, ' Pencarian  ', 'Cari', '2018-11-19', 'D3', 'Tetap', 'Mahasiswa');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_karyawan`
--
ALTER TABLE `data_karyawan`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `data_karyawan`
--
ALTER TABLE `data_karyawan`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
