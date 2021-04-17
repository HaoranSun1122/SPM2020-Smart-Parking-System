/*
 Navicat Premium Data Transfer

 Source Server         : myqsl
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : localhost:3306
 Source Schema         : park

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 18/12/2020 18:08:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `createDate` date NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, 'admin', 'admin', '2018-03-24');

-- ----------------------------
-- Table structure for car
-- ----------------------------
DROP TABLE IF EXISTS `car`;
CREATE TABLE `car`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `start_station` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `end_station` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `car_trips` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `num` int(0) NULL DEFAULT NULL,
  `start_time` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price` double(8, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of car
-- ----------------------------
INSERT INTO `car` VALUES (1, '北京', '上海', 'k101', 987, '2018-03-25 09:47:15', 100.00);
INSERT INTO `car` VALUES (2, '上海', '天津', 'k102', 100, '2018-03-29 10:05:13', 79.50);
INSERT INTO `car` VALUES (4, '黄山', '香港', 'k121', 40, '2018-03-25 10:45:20', 213.00);
INSERT INTO `car` VALUES (8, '北京', '香港', 'k121', 40, '2018-03-27 13:54:45', 213.00);

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_id` int(0) NULL DEFAULT NULL,
  `user_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `createDate` date NULL DEFAULT NULL,
  `admin_id` int(0) NULL DEFAULT NULL,
  `admin_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `answer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `answerDate` date NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES (5, '231312', 1, 'gaoc', '2020-10-02', 1, 'admin', '23131231', '2020-10-02');
INSERT INTO `message` VALUES (7, 'mmp', 1, 'gaoc', '2020-10-02', 1, 'admin', 'mmp', '2020-10-02');
INSERT INTO `message` VALUES (10, '爱编程', 1, 'gaoc', '2020-10-02', 1, 'admin', '牛逼', '2020-10-02');
INSERT INTO `message` VALUES (11, '能不能便宜点', 8, 'hasak', '2020-10-02', NULL, NULL, NULL, NULL);
INSERT INTO `message` VALUES (12, '天气真好', 9, '张三', '2020-10-02', 1, 'admin', '好', '2020-10-02');
INSERT INTO `message` VALUES (13, '大师傅大师傅士大夫', 10, '李四', '2020-10-02', 1, 'admin', '3333', '2020-10-02');
INSERT INTO `message` VALUES (15, '很好很好', 11, 'eric', '2020-10-02', 1, 'admin', '发发发', '2020-10-02');
INSERT INTO `message` VALUES (17, '已经付款了\r\n', 12, 'hello', '2020-10-02', NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for notice
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `title` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `createDate` date NULL DEFAULT NULL,
  `admin_id` int(0) NULL DEFAULT NULL,
  `admin_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of notice
-- ----------------------------
INSERT INTO `notice` VALUES (1, '停用通知公告', '555555', '2018-03-24', 1, 'admin');
INSERT INTO `notice` VALUES (4, '交通规则', '213123132131312312313', '2018-03-24', 1, 'admin');
INSERT INTO `notice` VALUES (7, '北京直通车', '2313123萨达萨达是 爱的阿斯顿阿斯顿阿斯顿撒大苏打收到的', '2018-03-29', 1, 'admin');
INSERT INTO `notice` VALUES (8, '高速封路', '啊实打实安德森是大神大神大大撒的啊收到阿三是', '2018-03-13', 1, 'admin');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `code` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_id` int(0) NULL DEFAULT NULL,
  `park_id` int(0) NULL DEFAULT NULL,
  `createDate` date NULL DEFAULT NULL,
  `status` int(0) NULL DEFAULT NULL,
  `total` double(255, 0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 29 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES (21, '7188de7f-386b-11e8-9125-047d7b48770f', 8, 1, '2020-10-02', 1, 80);
INSERT INTO `orders` VALUES (22, '23407dc4-386c-11e8-9125-047d7b48770f', 8, 4, '2020-10-02', 0, 170);
INSERT INTO `orders` VALUES (24, '17b89a46-386f-11e8-9125-047d7b48770f', 8, 9, '2020-10-02', 0, 70);
INSERT INTO `orders` VALUES (25, 'd43ec8d3-3879-11e8-9125-047d7b48770f', 9, 10, '2020-10-02', 1, 0);
INSERT INTO `orders` VALUES (26, '3d1203c6-389c-11e8-9125-047d7b48770f', 10, 1, '2020-10-02', 1, 0);
INSERT INTO `orders` VALUES (27, '236c2459-04ac-11eb-b234-2047472747b3', 11, 1, '2020-10-02', 1, 0);
INSERT INTO `orders` VALUES (28, 'ffb683e9-04b1-11eb-b234-2047472747b3', 12, 1, '2020-10-02', 1, 0);

-- ----------------------------
-- Table structure for park
-- ----------------------------
DROP TABLE IF EXISTS `park`;
CREATE TABLE `park`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price` double(8, 2) NULL DEFAULT NULL,
  `status` int(0) NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of park
-- ----------------------------
INSERT INTO `park` VALUES (1, '车位一', 100.00, 0);
INSERT INTO `park` VALUES (2, '车位二', 79.50, 0);
INSERT INTO `park` VALUES (4, '车位三', 213.00, 1);
INSERT INTO `park` VALUES (8, '车位四', 112.00, 1);
INSERT INTO `park` VALUES (9, '车位五', 88.00, 1);
INSERT INTO `park` VALUES (10, '车位六', 998.00, 0);
INSERT INTO `park` VALUES (11, '车位七', 100.00, 1);
INSERT INTO `park` VALUES (12, '车位八', 100.00, 0);
INSERT INTO `park` VALUES (13, '车位九', 90.00, 0);
INSERT INTO `park` VALUES (14, '车位十', 77.00, 0);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `plate_num` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stauts` int(0) NULL DEFAULT NULL,
  `createDate` date NULL DEFAULT NULL,
  `point` int(0) NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (8, 'aaa', '12345', '13199889098', '蒙K98981', 0, '2020-10-02', 420);
INSERT INTO `user` VALUES (9, '张三', '11111', '13111111111', '蒙A11020', 0, '2020-10-02', 10);
INSERT INTO `user` VALUES (10, '李四', '12345', '13111112222', '蒙A90922', 0, '2020-10-02', 10);
INSERT INTO `user` VALUES (11, 'eric', '123456', '13522224444', '湘A F0001', 0, '2020-10-02', 10);
INSERT INTO `user` VALUES (12, 'hello', '123456', '13522224444', '湘A F0002', 0, '2020-10-02', 10);

SET FOREIGN_KEY_CHECKS = 1;
