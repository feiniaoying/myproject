/*
 Navicat Premium Data Transfer

 Source Server         : 本地连接
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost:3306
 Source Schema         : student

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 29/03/2018 00:56:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_student
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student`  (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `sex` bit(1) NOT NULL DEFAULT b'1' COMMENT '0：女   1：男  （默认男）',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `photo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_student
-- ----------------------------
INSERT INTO `t_student` VALUES (1, '小明同学', b'1', '中国台湾', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1519961861685&di=6a3f63209b56caad91f236b7c2cc6dd2&imgtype=0&src=http%3A%2F%2Fimg5.duitang.com%2Fuploads%2Fitem%2F201411%2F08%2F20141108195140_Ltnin.jpeg');
INSERT INTO `t_student` VALUES (2, '王同学', b'0', '中国钓鱼岛', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1519961835967&di=47d6279fbe81236684c3e3a19ac65b23&imgtype=0&src=http%3A%2F%2Fimg5.duitang.com%2Fuploads%2Fitem%2F201505%2F09%2F20150509231341_iKmn5.thumb.700_0.jpeg');
INSERT INTO `t_student` VALUES (3, '陈同学', b'0', '中国钓鱼岛', NULL);

SET FOREIGN_KEY_CHECKS = 1;
