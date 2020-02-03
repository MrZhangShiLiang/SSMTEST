/*
Navicat MySQL Data Transfer

Source Server         : local-mysql
Source Server Version : 50723
Source Host           : localhost:3306
Source Database       : csblog

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2020-02-03 16:40:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_blackip
-- ----------------------------
DROP TABLE IF EXISTS `t_blackip`;
CREATE TABLE `t_blackip` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vid` int(11) NOT NULL,
  `ip` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `city` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `browserType` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `platformType` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for t_blog
-- ----------------------------
DROP TABLE IF EXISTS `t_blog`;
CREATE TABLE `t_blog` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增',
  `title` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '博客标题',
  `introduction` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '博客简介/摘要',
  `keyword` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `images` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '封面缩略图等',
  `content` longtext COLLATE utf8_unicode_ci COMMENT '博客内容',
  `clickNum` int(11) DEFAULT '0' COMMENT '点击量',
  `commentNum` int(11) DEFAULT '0' COMMENT '评论量',
  `agreeNum` int(11) DEFAULT '0' COMMENT '点赞量',
  `isTop` int(2) DEFAULT '0' COMMENT '1置顶，0普通',
  `isRecommend` int(2) DEFAULT '0' COMMENT '博主推荐,1为推荐，0为普通',
  `updateTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `addTime` datetime DEFAULT NULL,
  `status` int(2) DEFAULT '-1' COMMENT '-1为草稿，1为正文，2为回收站',
  `type_id` int(11) DEFAULT '0' COMMENT '类别',
  PRIMARY KEY (`id`),
  KEY `blogType` (`type_id`),
  CONSTRAINT `blogType` FOREIGN KEY (`type_id`) REFERENCES `t_blogtype` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=103 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for t_bloger
-- ----------------------------
DROP TABLE IF EXISTS `t_bloger`;
CREATE TABLE `t_bloger` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '密码',
  `email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '博主邮箱',
  `permission` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for t_blogtype
-- ----------------------------
DROP TABLE IF EXISTS `t_blogtype`;
CREATE TABLE `t_blogtype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `typeName` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '类别名称',
  `num` int(11) NOT NULL DEFAULT '0' COMMENT '该类别下的数量',
  `addTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for t_links
-- ----------------------------
DROP TABLE IF EXISTS `t_links`;
CREATE TABLE `t_links` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `link` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `clickNum` int(11) DEFAULT '0',
  `sort` int(11) DEFAULT '0' COMMENT '排序字段',
  `status` int(11) DEFAULT '1' COMMENT '1为上架，-1为下架',
  `addTime` datetime NOT NULL,
  `isApply` int(11) DEFAULT '-1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for t_log
-- ----------------------------
DROP TABLE IF EXISTS `t_log`;
CREATE TABLE `t_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userType` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ip` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `description` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `param` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `addTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3473 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for t_resource
-- ----------------------------
DROP TABLE IF EXISTS `t_resource`;
CREATE TABLE `t_resource` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '标题',
  `content` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '内容',
  `link` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '链接',
  `password` varchar(255) COLLATE utf8_unicode_ci DEFAULT '0' COMMENT '密码',
  `addTime` datetime DEFAULT NULL COMMENT '增加时间',
  `status` int(2) DEFAULT '1' COMMENT '审核',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for t_visit
-- ----------------------------
DROP TABLE IF EXISTS `t_visit`;
CREATE TABLE `t_visit` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ip` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `userAgent` varchar(625) COLLATE utf8_unicode_ci DEFAULT NULL,
  `city` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `url` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `browserType` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '浏览器',
  `platformType` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT 'OS',
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8740 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
