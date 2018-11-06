# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 39.106.1.123 (MySQL 5.5.56-MariaDB)
# Database: happy_garden
# Generation Time: 2018-11-05 12:00:51 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table t_account
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_account`;

CREATE TABLE `t_account` (
  `account_id` varchar(32) NOT NULL COMMENT '用户id',
  `account_name` varchar(32) DEFAULT '' COMMENT '用户昵称',
  `wechat_nickname` varchar(100) DEFAULT NULL,
  `wechat_open_id` varchar(100) DEFAULT NULL COMMENT '微信openid',
  `wechat_mp_open_id` varchar(100) DEFAULT NULL COMMENT '微信openid',
  `wechat_union_id` varchar(100) DEFAULT NULL COMMENT '微信unionid',
  `wechat_header` varchar(512) DEFAULT NULL COMMENT '微信头像',
  `type` tinyint(4) DEFAULT NULL COMMENT '账户归属 0-管理端,1-小程序',
  `mobile` varchar(14) DEFAULT '' COMMENT '手机号',
  `email` varchar(32) DEFAULT NULL COMMENT '邮箱',
  `password` varchar(32) DEFAULT NULL COMMENT '密码',
  `update_time` datetime NOT NULL COMMENT '修改时间',
  `create_time` datetime NOT NULL COMMENT '新增时间',
  `is_del` tinyint(4) NOT NULL DEFAULT '0' COMMENT '删除状态：0未删除,1已删除',
  PRIMARY KEY (`account_id`),
  KEY `index_wechat_open_id` (`wechat_open_id`),
  KEY `index_wechat_mp_open_id` (`wechat_mp_open_id`),
  KEY `index_wechat_union_id` (`wechat_union_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';



# Dump of table t_apply_fertilizer_record
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_apply_fertilizer_record`;

CREATE TABLE `t_apply_fertilizer_record` (
  `record_id` varchar(32) NOT NULL DEFAULT '' COMMENT '记录ID',
  `flower_id` varchar(32) DEFAULT NULL COMMENT '植物ID',
  `base_fertilizer_id` varchar(32) DEFAULT NULL COMMENT '基础肥料ID',
  `fertilizer_quantity` varchar(64) DEFAULT NULL COMMENT '施肥重量',
  `reason` varchar(64) DEFAULT NULL COMMENT '施肥原因',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `regenerator` varchar(32) DEFAULT NULL COMMENT '修改人',
  `create_time` datetime DEFAULT NULL COMMENT '新增时间',
  `creator` varchar(32) DEFAULT NULL COMMENT '创建人',
  `is_del` tinyint(4) DEFAULT '0' COMMENT '删除状态：0未删除,1已删除',
  PRIMARY KEY (`record_id`),
  KEY `index_flower_id` (`flower_id`),
  KEY `index_fertilizer_id` (`base_fertilizer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='施肥记录';



# Dump of table t_attach
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_attach`;

CREATE TABLE `t_attach` (
  `attach_id` varchar(32) NOT NULL DEFAULT '' COMMENT '附件ID',
  `type` varchar(32) DEFAULT NULL COMMENT '类型',
  `entity_id` varchar(32) DEFAULT NULL COMMENT '文件关联id',
  `attach_key` varchar(256) DEFAULT NULL COMMENT '文件内容',
  `is_main` tinyint(4) DEFAULT '0' COMMENT '是否是主图 1-是 0-不是',
  `sequence` tinyint(4) DEFAULT '0' COMMENT '显示顺序 先->0->1->2->后',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `regenerator` varchar(32) DEFAULT NULL COMMENT '修改人',
  `create_time` datetime DEFAULT NULL COMMENT '新增时间',
  `creator` varchar(32) DEFAULT NULL COMMENT '创建人',
  `is_del` tinyint(4) DEFAULT '0' COMMENT '删除状态：0未删除,1已删除',
  PRIMARY KEY (`attach_id`),
  KEY `index_entity_type_id` (`entity_id`,`type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='附件表';



# Dump of table t_base_drug
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_base_drug`;

CREATE TABLE `t_base_drug` (
  `base_drug_id` varchar(32) NOT NULL DEFAULT '' COMMENT '药剂ID',
  `base_drug_name` varchar(64) DEFAULT NULL COMMENT '药剂名称',
  `base_drug_recipe` varchar(256) DEFAULT NULL COMMENT '药剂配方',
  `unit` varchar(32) DEFAULT NULL COMMENT '单位',
  `is_recommend` tinyint(4) DEFAULT '0' COMMENT '是否推荐 1-是 0-不是',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `regenerator` varchar(32) DEFAULT NULL COMMENT '修改人',
  `create_time` datetime DEFAULT NULL COMMENT '新增时间',
  `creator` varchar(32) DEFAULT NULL COMMENT '创建人',
  `is_del` tinyint(4) DEFAULT '0' COMMENT '删除状态：0未删除,1已删除',
  PRIMARY KEY (`base_drug_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='基础药剂表';



# Dump of table t_base_fertilizer
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_base_fertilizer`;

CREATE TABLE `t_base_fertilizer` (
  `base_fertilizer_id` varchar(32) NOT NULL DEFAULT '' COMMENT '肥料ID',
  `base_fertilizer_name` varchar(64) DEFAULT NULL COMMENT '肥料名称',
  `base_fertilizer_recipe` varchar(256) DEFAULT NULL COMMENT '肥料配方',
  `unit` varchar(32) DEFAULT NULL COMMENT '单位',
  `is_recommend` tinyint(4) DEFAULT '0' COMMENT '是否推荐 1-是 0-不是',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `regenerator` varchar(32) DEFAULT NULL COMMENT '修改人',
  `create_time` datetime DEFAULT NULL COMMENT '新增时间',
  `creator` varchar(32) DEFAULT NULL COMMENT '创建人',
  `is_del` tinyint(4) DEFAULT '0' COMMENT '删除状态：0未删除,1已删除',
  PRIMARY KEY (`base_fertilizer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='基础肥料表';



# Dump of table t_base_flower
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_base_flower`;

CREATE TABLE `t_base_flower` (
  `base_flower_id` varchar(32) NOT NULL DEFAULT '' COMMENT '植物ID',
  `base_flower_name` varchar(64) DEFAULT NULL COMMENT '植物名称',
  `water_require` varchar(256) DEFAULT NULL COMMENT '浇水要求',
  `humidity_require` varchar(256) DEFAULT NULL COMMENT '湿度要求',
  `soil_require` varchar(256) DEFAULT NULL COMMENT '土壤要求',
  `temperature_require` varchar(256) DEFAULT NULL COMMENT '温度要求',
  `light_require` varchar(256) DEFAULT NULL COMMENT '光照要求',
  `ventilation_require` varchar(256) DEFAULT NULL COMMENT '通风要求',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `regenerator` varchar(32) DEFAULT NULL COMMENT '修改人',
  `create_time` datetime DEFAULT NULL COMMENT '新增时间',
  `creator` varchar(32) DEFAULT NULL COMMENT '创建人',
  `is_del` tinyint(4) DEFAULT '0' COMMENT '删除状态：0未删除,1已删除',
  PRIMARY KEY (`base_flower_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='基础植物表';



# Dump of table t_base_soil
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_base_soil`;

CREATE TABLE `t_base_soil` (
  `base_soil_id` varchar(32) NOT NULL DEFAULT '' COMMENT '土壤ID',
  `base_soil_name` varchar(64) DEFAULT NULL COMMENT '土壤名称',
  `base_soil_recipe` varchar(256) DEFAULT NULL COMMENT '土壤配方',
  `is_recommend` tinyint(4) DEFAULT '0' COMMENT '是否推荐 1-是 0-不是',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `regenerator` varchar(32) DEFAULT NULL COMMENT '修改人',
  `create_time` datetime DEFAULT NULL COMMENT '新增时间',
  `creator` varchar(32) DEFAULT NULL COMMENT '创建人',
  `is_del` tinyint(4) DEFAULT '0' COMMENT '删除状态：0未删除,1已删除',
  PRIMARY KEY (`base_soil_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='基础土壤表';



# Dump of table t_feedback_record
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_feedback_record`;

CREATE TABLE `t_feedback_record` (
  `feedback_id` varchar(32) NOT NULL DEFAULT '' COMMENT '反馈ID',
  `title` varchar(128) DEFAULT NULL COMMENT '标题',
  `content` varchar(256) DEFAULT NULL COMMENT '内容',
  `contact_info` varchar(128) DEFAULT NULL COMMENT '联系方式',
  `status` tinyint(4) DEFAULT '0' COMMENT '状态 0-未处理 1-处理中 2-处理完毕',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `regenerator` varchar(32) DEFAULT NULL COMMENT '修改人',
  `create_time` datetime DEFAULT NULL COMMENT '新增时间',
  `creator` varchar(32) DEFAULT NULL COMMENT '创建人',
  `is_del` tinyint(4) DEFAULT '0' COMMENT '删除状态：0未删除,1已删除',
  PRIMARY KEY (`feedback_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='反馈记录';



# Dump of table t_flower
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_flower`;

CREATE TABLE `t_flower` (
  `flower_id` varchar(32) NOT NULL DEFAULT '' COMMENT '植物ID',
  `nick_name` varchar(64) DEFAULT NULL COMMENT '昵称',
  `remark` varchar(256) DEFAULT NULL COMMENT '备注',
  `base_flower_id` varchar(32) DEFAULT NULL COMMENT '基础植物ID',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `regenerator` varchar(32) DEFAULT NULL COMMENT '修改人',
  `create_time` datetime DEFAULT NULL COMMENT '新增时间',
  `creator` varchar(32) DEFAULT NULL COMMENT '创建人',
  `is_del` tinyint(4) DEFAULT '0' COMMENT '删除状态：0未删除,1已删除',
  PRIMARY KEY (`flower_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='植物';



# Dump of table t_replace_soil_record
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_replace_soil_record`;

CREATE TABLE `t_replace_soil_record` (
  `record_id` varchar(32) NOT NULL DEFAULT '' COMMENT '记录ID',
  `flower_id` varchar(32) DEFAULT NULL COMMENT '植物ID',
  `base_soil_id` varchar(32) DEFAULT NULL COMMENT '基础土壤ID',
  `reason` varchar(64) DEFAULT NULL COMMENT '换土原因',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `regenerator` varchar(32) DEFAULT NULL COMMENT '修改人',
  `create_time` datetime DEFAULT NULL COMMENT '新增时间',
  `creator` varchar(32) DEFAULT NULL COMMENT '创建人',
  `is_del` tinyint(4) DEFAULT '0' COMMENT '删除状态：0未删除,1已删除',
  PRIMARY KEY (`record_id`),
  KEY `index_flower_id` (`flower_id`),
  KEY `index_soil_id` (`base_soil_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='换土记录';



# Dump of table t_spray_water_record
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_spray_water_record`;

CREATE TABLE `t_spray_water_record` (
  `record_id` varchar(32) NOT NULL DEFAULT '' COMMENT '记录ID',
  `flower_id` varchar(32) DEFAULT NULL COMMENT '植物ID',
  `reason` varchar(64) DEFAULT NULL COMMENT '喷水原因',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `regenerator` varchar(32) DEFAULT NULL COMMENT '修改人',
  `create_time` datetime DEFAULT NULL COMMENT '新增时间',
  `creator` varchar(32) DEFAULT NULL COMMENT '创建人',
  `is_del` tinyint(4) DEFAULT '0' COMMENT '删除状态：0未删除,1已删除',
  PRIMARY KEY (`record_id`),
  KEY `index_flower_id` (`flower_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='喷水记录';



# Dump of table t_spread_drug_record
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_spread_drug_record`;

CREATE TABLE `t_spread_drug_record` (
  `record_id` varchar(32) NOT NULL DEFAULT '' COMMENT '记录ID',
  `flower_id` varchar(32) DEFAULT NULL COMMENT '植物ID',
  `base_drug_id` varchar(32) DEFAULT NULL COMMENT '基础药剂ID',
  `drug_quantity` varchar(64) DEFAULT NULL COMMENT '药剂重量',
  `reason` varchar(64) DEFAULT NULL COMMENT '撒药原因',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `regenerator` varchar(32) DEFAULT NULL COMMENT '修改人',
  `create_time` datetime DEFAULT NULL COMMENT '新增时间',
  `creator` varchar(32) DEFAULT NULL COMMENT '创建人',
  `is_del` tinyint(4) DEFAULT '0' COMMENT '删除状态：0未删除,1已删除',
  PRIMARY KEY (`record_id`),
  KEY `index_flower_id` (`flower_id`),
  KEY `index_drug_id` (`base_drug_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='撒药记录';



# Dump of table t_watering_record
# ------------------------------------------------------------

DROP TABLE IF EXISTS `t_watering_record`;

CREATE TABLE `t_watering_record` (
  `record_id` varchar(32) NOT NULL DEFAULT '' COMMENT '记录ID',
  `flower_id` varchar(32) DEFAULT NULL COMMENT '植物ID',
  `reason` varchar(64) DEFAULT NULL COMMENT '浇水原因',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `regenerator` varchar(32) DEFAULT NULL COMMENT '修改人',
  `create_time` datetime DEFAULT NULL COMMENT '新增时间',
  `creator` varchar(32) DEFAULT NULL COMMENT '创建人',
  `is_del` tinyint(4) DEFAULT '0' COMMENT '删除状态：0未删除,1已删除',
  PRIMARY KEY (`record_id`),
  KEY `index_flower_id` (`flower_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='浇水记录';




/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
