-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 02, 2022 at 01:35 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `qldoanvat`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `PASSWORD` varchar(50) NOT NULL,
  `NAME` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `username`, `PASSWORD`, `NAME`) VALUES
(1, 'hieple', '123456', 'Le Van Hiep'),
(2, 'admin', '123456', 'VanHiep'),
(3, 'admin123', '123456', 'Le Van Hiep');

-- --------------------------------------------------------

--
-- Table structure for table `boardnew`
--

CREATE TABLE `boardnew` (
  `id` int(11) NOT NULL,
  `title` varchar(200) COLLATE utf16_bin NOT NULL,
  `content` varchar(4000) COLLATE utf16_bin NOT NULL,
  `image_link` varchar(4000) COLLATE utf16_bin NOT NULL,
  `author` varchar(50) COLLATE utf16_bin NOT NULL,
  `created` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf16 COLLATE=utf16_bin;

--
-- Dumping data for table `boardnew`
--

INSERT INTO `boardnew` (`id`, `title`, `content`, `image_link`, `author`, `created`) VALUES
(1, 'Tin Hot', 'Hot girl bán bánh tráng trộn siêu ngon, khiến các chàng điêu đứng', 'blog_5.jpg', 'Nguyan Van A', '2022-10-02'),
(4, 'Tin Hot', 'Trà sữa đang là món đồ uống yêu thích của giới trẻ hiện nay ', 'blog_4.jpg', 'Nguyan Van A', '2022-10-02'),
(3, 'Tin Mới ', 'Ông chủ của hàng đồ ăn vặt khiến các nàng mê mệt với nhan sắc chuẩn men', 'blog_6.jpg', 'Nguyan Van A', '2022-10-02');

-- --------------------------------------------------------

--
-- Table structure for table `catalog`
--

CREATE TABLE `catalog` (
  `id` int(11) NOT NULL,
  `name` varchar(50) COLLATE utf16_bin NOT NULL,
  `parent_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_bin;

--
-- Dumping data for table `catalog`
--

INSERT INTO `catalog` (`id`, `name`, `parent_id`) VALUES
(1, 'Trà Sữa', 1),
(2, 'Bánh Tráng', 1),
(3, 'Cá Viên Các Loại', 1),
(4, 'Gỏi Cuốn & Gỏi Đu Đủ', 1),
(5, 'Sản Phẩm Mới', NULL),
(6, 'Sản Phẩm Bán Chạy', 1),
(7, 'Sản Phẩm Giảm Gía', 1),
(13, 'Bắp Các Loại', 1),
(15, 'Sinh Tố', 1),
(16, 'Bột Chiên', 1);

-- --------------------------------------------------------

--
-- Table structure for table `ordered`
--

CREATE TABLE `ordered` (
  `id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `transaction_id` int(11) NOT NULL,
  `qty` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_bin;

--
-- Dumping data for table `ordered`
--

INSERT INTO `ordered` (`id`, `product_id`, `transaction_id`, `qty`) VALUES
(11, 3, 8, 2),
(12, 9, 8, 2),
(17, 3, 10, 10000),
(18, 3, 11, 1),
(19, 5, 11, 2),
(20, 29, 12, 2);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `catalog_id` int(11) NOT NULL,
  `name` varchar(50) COLLATE utf16_bin NOT NULL,
  `price` varchar(20) COLLATE utf16_bin NOT NULL,
  `status` int(11) NOT NULL,
  `description` varchar(4000) COLLATE utf16_bin NOT NULL,
  `content` varchar(4000) COLLATE utf16_bin NOT NULL,
  `discount` int(11) DEFAULT NULL,
  `image_link` varchar(4000) COLLATE utf16_bin NOT NULL,
  `created` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_bin;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `catalog_id`, `name`, `price`, `status`, `description`, `content`, `discount`, `image_link`, `created`) VALUES
(3, 1, 'Trà Sữa Macha', '35.000', 1, 'Trà sữa Matcha làm tại nhà', 'Ngon', 0, 'trasua_mattra.jpg', '2022-09-26'),
(5, 2, 'Bánh Tráng Trộn', '25.000', 1, 'Ngon', 'Ngon', 0, 'banhtrangtron.jpg', '2022-10-02'),
(6, 3, 'Cá Viên Chiên', '100.000', 1, 'Ngon', 'Ngon', 0, 'cavien.jpg', '2022-10-02'),
(7, 4, 'Gỏi Cuốn ', '5000', 1, 'Ngon', 'Ngon', 0, 'goicuon.jpg', '2022-10-02'),
(9, 5, 'Gỏi Khô Bò', '25.000', 1, 'Ngon', 'Ngon', 0, 'goi-kho-bo-den.jpg', '2022-10-02'),
(11, 6, 'Trà Sữa Đường Đen', '25.000', 1, 'Ngon', 'Ngon', 0, 'trasua_1.jpg', '2022-10-02'),
(12, 7, 'Compo Cá Viên', '150.000', 1, 'Ngon', 'Ngon', 20, 'compo.jpg', '2022-10-02'),
(13, 1, 'Trà Sữa Truyền Thống', '35.000', 1, 'Ngon', 'Ngon', 0, 'tra-sua-truyen-thong.jpg', '2022-10-02'),
(14, 1, 'Trà sữa Phúc Bồn Tử ', '35.000', 1, 'Ngon', 'Ngon', 0, 'trasua2.jpg', '2022-10-02'),
(15, 5, 'Súp Cua', '25.000', 1, 'Ngon ', 'Ngon', 0, 'supcua.jpg', '2022-10-03'),
(16, 5, 'Há Cảo', '30.000', 1, 'Ngon', 'Ngon', 0, 'ha-cao-hap.jpg', '2022-10-03'),
(17, 5, 'Bánh Mì Nướng', '15.000', 1, 'Ngon', 'Ngon', 0, 'banhminuong.jpg', '2022-10-03'),
(18, 1, 'Trà Sữa Thái', '35.000', 1, 'Ngon', 'Ngon', 0, 'trasuathai.jpg', '2022-10-03'),
(19, 2, 'Bánh Tráng Cuốn', '25.000', 1, 'Ngon', 'Ngon', 0, 'banh-trang-cuon.jpg', '2022-10-03'),
(20, 4, 'Gỏi đu đủ tôm', '25.000', 1, 'Ngon', 'Ngon', 0, 'goidudu.jpg', '2022-10-03'),
(21, 6, 'Bánh Tráng Trộn', '25.000', 1, 'Ngon', 'Ngon', 0, 'banhtrangtron.jpg', '2022-10-03'),
(22, 6, 'Bánh Tráng Cuốn', '25.000', 1, 'Ngon', 'Ngon', 0, 'banh-trang-cuon.jpg', '2022-10-03'),
(24, 13, 'Bắp nướng', '15.000', 1, 'Ngon', 'Ngon', 0, 'bap-nuong-mo-hanh-1.jpg', '2022-10-25'),
(27, 15, 'Sinh Tố Dừa', '25.000', 1, 'Ngon', 'Ngon', 0, 'sinhtodua.jpg', '2022-11-03'),
(28, 13, 'Bắp Xào', '25.000', 1, 'Ngon', 'Ngon', 0, 'bapxao.jpg', '2022-11-03'),
(29, 16, 'Bột Chiên', '35000', 1, 'Ngon', 'Bột chiên ngon mê ly', 5, 'bot-chien.jpg', '2022-12-02');

-- --------------------------------------------------------

--
-- Table structure for table `review`
--

CREATE TABLE `review` (
  `id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `name` varchar(50) COLLATE utf16_bin NOT NULL,
  `email` varchar(50) COLLATE utf16_bin NOT NULL,
  `content` varchar(4000) COLLATE utf16_bin NOT NULL,
  `created` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_bin;

--
-- Dumping data for table `review`
--

INSERT INTO `review` (`id`, `product_id`, `name`, `email`, `content`, `created`) VALUES
(1, 3, 'PinPoy', 'pinpoy@gmail.com', 'Ngon', '2022-09-26'),
(3, 3, 'Hieep', 'lehiep4325@gmail.com', 'Tuyệt Vời ', '2022-10-19'),
(4, 7, 'BenSha', 'lehiep4325@gmail.com', 'Gỏi cuốn tuyệt vời ', '2022-10-25'),
(5, 3, 'Pen', 'Pen@gmail.com', 'Ngon quá\r\n', '2022-11-03'),
(6, 29, 'Le Van Hiep', 'lehiep4325@gmail.com', 'Ngon quớ', '2022-12-02');

-- --------------------------------------------------------

--
-- Table structure for table `transactions`
--

CREATE TABLE `transactions` (
  `id` int(11) NOT NULL,
  `user_session` varchar(50) COLLATE utf16_bin NOT NULL,
  `user_name` varchar(50) COLLATE utf16_bin NOT NULL,
  `user_mail` varchar(50) COLLATE utf16_bin NOT NULL,
  `user_phone` varchar(20) COLLATE utf16_bin NOT NULL,
  `address` varchar(300) COLLATE utf16_bin NOT NULL,
  `message` varchar(4000) COLLATE utf16_bin NOT NULL,
  `amount` varchar(20) COLLATE utf16_bin NOT NULL,
  `payment` varchar(30) COLLATE utf16_bin NOT NULL,
  `status` varchar(30) COLLATE utf16_bin DEFAULT NULL,
  `created` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_bin;

--
-- Dumping data for table `transactions`
--

INSERT INTO `transactions` (`id`, `user_session`, `user_name`, `user_mail`, `user_phone`, `address`, `message`, `amount`, `payment`, `status`, `created`) VALUES
(8, 'pinpoy', 'Hiep PinPoy', 'hiep@gmail.com', '0123654', 'Cao Lỗ, Q4', 'Ngon', '120.000', '0', NULL, '2022-10-25'),
(10, 'penkiu', 'aaa', 'lehiep@gmail.com', '0131313', 'Q8', 'ckecknvc', '350000.000', '0', 'Đã thanh toán', '2022-11-02'),
(11, 'penkiu', 'Le Van Hiep', 'Pen@gmail.com', '0123654', 'Cao Lỗ, Quận 8', 'Nhanh ', '85.000', '0', NULL, '2022-11-03'),
(12, 'penkiu789', 'Le Van Hiep', 'lehiep4325@gmail.com', '0123654', 'Cao Lo', 'giao nhanh', '66500.000', '0', 'Đã thanh toán', '2022-12-02');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `name` varchar(50) COLLATE utf16_bin NOT NULL,
  `email` varchar(50) COLLATE utf16_bin NOT NULL,
  `phone` varchar(20) COLLATE utf16_bin NOT NULL,
  `username` varchar(50) COLLATE utf16_bin NOT NULL,
  `password` varchar(50) COLLATE utf16_bin NOT NULL,
  `created` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_bin;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `name`, `email`, `phone`, `username`, `password`, `created`) VALUES
(2, 'hiep', 'pinpoy@gmail.com', '0123654', 'penkiu', '123456', '2022-09-26'),
(6, 'LeVanHiep', 'lehiep4325@gmail.com', '0123654', 'penkiu789', '123456', '2022-12-02');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `boardnew`
--
ALTER TABLE `boardnew`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `catalog`
--
ALTER TABLE `catalog`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `ordered`
--
ALTER TABLE `ordered`
  ADD PRIMARY KEY (`id`),
  ADD KEY `product_id` (`product_id`),
  ADD KEY `transaction_id` (`transaction_id`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`),
  ADD KEY `catalog_id` (`catalog_id`);

--
-- Indexes for table `review`
--
ALTER TABLE `review`
  ADD PRIMARY KEY (`id`),
  ADD KEY `product_id` (`product_id`);

--
-- Indexes for table `transactions`
--
ALTER TABLE `transactions`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `boardnew`
--
ALTER TABLE `boardnew`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `catalog`
--
ALTER TABLE `catalog`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `ordered`
--
ALTER TABLE `ordered`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT for table `review`
--
ALTER TABLE `review`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `transactions`
--
ALTER TABLE `transactions`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `ordered`
--
ALTER TABLE `ordered`
  ADD CONSTRAINT `ordered_ibfk_1` FOREIGN KEY (`transaction_id`) REFERENCES `transactions` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ordered_ibfk_2` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `product`
--
ALTER TABLE `product`
  ADD CONSTRAINT `product_ibfk_1` FOREIGN KEY (`catalog_id`) REFERENCES `catalog` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `review`
--
ALTER TABLE `review`
  ADD CONSTRAINT `review_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
