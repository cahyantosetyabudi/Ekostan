-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1:3307
-- Generation Time: 10 Jan 2017 pada 11.31
-- Versi Server: 10.1.16-MariaDB
-- PHP Version: 7.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ekostan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `kamar`
--

CREATE TABLE `kamar` (
  `no_kamar` varchar(5) NOT NULL,
  `harga` varchar(10) NOT NULL,
  `status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `kamar`
--

INSERT INTO `kamar` (`no_kamar`, `harga`, `status`) VALUES
('12345', '5000', 'Kosong'),
('12346', '1000', 'Kosong');

-- --------------------------------------------------------

--
-- Struktur dari tabel `penyewa`
--

CREATE TABLE `penyewa` (
  `id_penyewa` int(20) NOT NULL,
  `nama_penyewa` varchar(30) NOT NULL,
  `jenis_kelamin` varchar(6) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `no_telp` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `penyewa`
--

INSERT INTO `penyewa` (`id_penyewa`, `nama_penyewa`, `jenis_kelamin`, `alamat`, `no_telp`) VALUES
(1, 'Budi', 'Pria', 'Cimahi', '080989999'),
(2, 'Danu', 'Pria', 'Bandung', '09423432'),
(3, 'Arif', 'Pria', 'Pasteur', '053453523'),
(4, 'Nio', 'Pria', 'SUCI', '05345347');

-- --------------------------------------------------------

--
-- Struktur dari tabel `penyewaan`
--

CREATE TABLE `penyewaan` (
  `no_transaksi` varchar(8) NOT NULL,
  `id_penyewa` int(11) NOT NULL,
  `nama_penyewa` varchar(30) NOT NULL,
  `no_kamar` varchar(5) NOT NULL,
  `tanggal_sewa` date NOT NULL,
  `total_bayar` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id` int(3) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id`, `username`, `password`) VALUES
(1, 'admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kamar`
--
ALTER TABLE `kamar`
  ADD PRIMARY KEY (`no_kamar`);

--
-- Indexes for table `penyewa`
--
ALTER TABLE `penyewa`
  ADD PRIMARY KEY (`id_penyewa`);

--
-- Indexes for table `penyewaan`
--
ALTER TABLE `penyewaan`
  ADD PRIMARY KEY (`no_transaksi`),
  ADD KEY `id_penyewa` (`id_penyewa`),
  ADD KEY `no_kamar` (`no_kamar`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `penyewaan`
--
ALTER TABLE `penyewaan`
  ADD CONSTRAINT `fk_penyewaan_kamar` FOREIGN KEY (`no_kamar`) REFERENCES `kamar` (`no_kamar`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_penyewaan_penyewa` FOREIGN KEY (`id_penyewa`) REFERENCES `penyewa` (`id_penyewa`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
