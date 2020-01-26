/*
Navicat MySQL Data Transfer

Source Server         : admin
Source Server Version : 50723
Source Host           : localhost:3306
Source Database       : ssm

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2020-01-27 00:18:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `account`
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `money` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('1', 'zhangsan', '12');
INSERT INTO `account` VALUES ('2', 'lisi', '23');
INSERT INTO `account` VALUES ('3', 'helin', '12');
INSERT INTO `account` VALUES ('4', '小宇', '12');
INSERT INTO `account` VALUES ('5', '11', '11');
INSERT INTO `account` VALUES ('6', 'helin', '12');
INSERT INTO `account` VALUES ('7', 'helin', '12');
INSERT INTO `account` VALUES ('8', '小宇', '21');
