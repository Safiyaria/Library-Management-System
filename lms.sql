-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 14, 2021 at 02:20 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `lms`
--

-- --------------------------------------------------------

--
-- Table structure for table `issuedbooks`
--

CREATE TABLE `issuedbooks` (
  `Book_ID` varchar(50) NOT NULL,
  `Student_ID` varchar(50) NOT NULL,
  `Issue_Date` varchar(50) NOT NULL,
  `Due_Date` varchar(50) NOT NULL,
  `Return_Book` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `issuedbooks`
--

INSERT INTO `issuedbooks` (`Book_ID`, `Student_ID`, `Issue_Date`, `Due_Date`, `Return_Book`) VALUES
('2', '190', '21-02-2011', '28-02-2021', 'YES'),
('2', '190', '13-06-2021', '20-06-2021', 'YES'),
('2', '195', '03-23-2021', '10-23-2021', 'NO'),
('3', '195', '05-09-2021', '19-09-2021', 'NO'),
('4', '167', '24-51-2021', '31-51-2021', 'YES');

-- --------------------------------------------------------

--
-- Table structure for table `newbook`
--

CREATE TABLE `newbook` (
  `BookId` varchar(50) NOT NULL,
  `BookName` varchar(50) NOT NULL,
  `Writer` varchar(50) NOT NULL,
  `Price` varchar(50) NOT NULL,
  `PublishingYear` varchar(50) NOT NULL,
  `BookType` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `newbook`
--

INSERT INTO `newbook` (`BookId`, `BookName`, `Writer`, `Price`, `PublishingYear`, `BookType`) VALUES
('1', 'integration', 'bk.paul', '400', '1999', 'Mathematics'),
('2', 'simple mechanics', 'abraham asif', '700', '2007', 'IPE&ME'),
('3', 'chemistry II', 'bk goswami', '690', '2019', 'Chemistry'),
('4', 'chemistry IV', 'bk dasgupta', '750', '2011', 'Chemistry');

-- --------------------------------------------------------

--
-- Table structure for table `studentinfo`
--

CREATE TABLE `studentinfo` (
  `studentID` varchar(50) NOT NULL,
  `studentName` varchar(50) NOT NULL,
  `fatherName` varchar(50) NOT NULL,
  `motherName` varchar(50) NOT NULL,
  `emailID` varchar(50) NOT NULL,
  `phoneNumber` varchar(50) NOT NULL,
  `department` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `studentinfo`
--

INSERT INTO `studentinfo` (`studentID`, `studentName`, `fatherName`, `motherName`, `emailID`, `phoneNumber`, `department`) VALUES
('167', 'tfk', 'jfk', 'afk', 'lfk@ptk.com', '019888823', 'CSE'),
('190', 'asif khan', 'hamim khan', 'salina begum', 'asifkhan@gamil.com', '0188776622', 'CSE'),
('195', 'abudullah', 'mr.hosain', 'mrs.hosain', 'abcd@yahoo.com', '0197722772', 'ARCH');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `newbook`
--
ALTER TABLE `newbook`
  ADD PRIMARY KEY (`BookId`);

--
-- Indexes for table `studentinfo`
--
ALTER TABLE `studentinfo`
  ADD PRIMARY KEY (`studentID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
