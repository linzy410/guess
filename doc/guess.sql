# --------------------------------------------------------
# Host:                         127.0.0.1
# Database:                     guess
# Server version:               5.5.3-m3-community
# Server OS:                    Win32
# HeidiSQL version:             5.0.0.3272
# Date/time:                    2013-02-03 22:33:41
# --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

# Dumping structure for table guess.Game
CREATE TABLE IF NOT EXISTS `Game` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `userIds` varchar(500) NOT NULL,
  `normalWord` varchar(20) NOT NULL,
  `specialWord` varchar(20) NOT NULL,
  `state` tinyint(4) NOT NULL COMMENT '0=未开始  10=已开始 20=已结束',
  `description` varchar(500) NOT NULL,
  `createTime` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='游戏';

# Dumping data for table guess.Game: 0 rows
/*!40000 ALTER TABLE `Game` DISABLE KEYS */;
/*!40000 ALTER TABLE `Game` ENABLE KEYS */;


# Dumping structure for table guess.SessionUser
CREATE TABLE IF NOT EXISTS `SessionUser` (
  `userId` int(10) NOT NULL,
  `time` varchar(20) NOT NULL COMMENT '时间 ',
  UNIQUE KEY `userId` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

# Dumping data for table guess.SessionUser: 8 rows
/*!40000 ALTER TABLE `SessionUser` DISABLE KEYS */;
/*!40000 ALTER TABLE `SessionUser` ENABLE KEYS */;


# Dumping structure for table guess.User
CREATE TABLE IF NOT EXISTS `User` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL COMMENT '名字',
  `headImg` varchar(200) NOT NULL COMMENT '头像',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

# Dumping data for table guess.User: 9 rows
/*!40000 ALTER TABLE `User` DISABLE KEYS */;
INSERT INTO `User` (`id`, `name`, `headImg`) VALUES (1, '1', '1.jpg'), (2, '2', '2.jpg'), (3, '3', '3.jpg'), (4, '4', '4.jpg'), (5, '5', '5.jpg'), (6, '6', '6.jpg'), (7, '7', '7.jpg'), (8, '8', '8.jpg'), (9, '9', '9.jpg');
/*!40000 ALTER TABLE `User` ENABLE KEYS */;


# Dumping structure for table guess.Words
CREATE TABLE IF NOT EXISTS `Words` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `normalWord` varchar(20) NOT NULL COMMENT '正常词',
  `specialWord` varchar(20) NOT NULL COMMENT '特殊词',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=utf8 COMMENT='词库';

# Dumping data for table guess.Words: 0 rows
/*!40000 ALTER TABLE `Words` DISABLE KEYS */;
INSERT INTO `Words` (`id`, `normalWord`, `specialWord`) VALUES (1, '玫瑰', '月季'), (2, '董永', '许仙'), (3, '若曦', '晴川'), (4, '谢娜', '李湘'), (5, '孟非', '乐嘉'), (6, '牛奶', '豆浆'), (7, '保安', '保镖'), (8, '白菜', '生菜'), (9, '辣椒', '芥末'), (10, '金庸', '古龙'), (11, '赵敏', '黄蓉'), (12, '海豚', '海狮'), (13, '水盆', '水桶'), (14, '唇膏', '口红'), (15, '森马', '以纯'), (16, '烤肉', '涮肉'), (17, '气泡', '水泡'), (18, '纸巾', '手帕'), (19, '杭州', '苏州'), (20, '香港', '台湾'), (21, '首尔', '东京'), (22, '橙子', '橘子'), (23, '葡萄', '提子'), (24, '太监', '人妖'), (25, '蝴蝶', '蜜蜂'), (26, '小品', '话剧'), (27, '裸婚', '闪婚'), (28, '新年', '跨年'), (29, '吉他', '琵琶'), (30, '公交', '地铁'), (31, '剩女', '御姐'), (32, '童话', '神话'), (33, '作家', '编剧'), (34, '警察', '捕快'), (35, '结婚', '订婚'), (36, '奖牌', '金牌'), (37, '孟飞', '乐嘉'), (38, '那英', '韩红'), (39, '面包', '蛋糕'), (40, '作文', '论文'), (41, '油条', '麻花'), (42, '壁纸', '贴画'), (43, '枕头', '抱枕'), (44, '手机', '座机'), (45, '同学', '同桌'), (46, '婚纱', '喜服'), (47, '老佛爷', '老天爷'), (48, '魔术师', '魔法师'), (49, '鸭舌帽', '遮阳帽'), (50, '双胞胎', '龙凤胎'), (51, '情人节', '光棍节'), (52, '丑小鸭', '灰姑娘'), (53, '富二代', '高富帅'), (54, '生活费', '零花钱'), (55, '麦克风', '扩音器'), (56, '郭德纲', '周立波'), (57, '图书馆', '图书店'), (58, '男朋友', '前男友'), (59, '洗衣粉', '皂角粉'), (60, '牛肉干', '猪肉脯'), (61, '泡泡糖', '棒棒糖'), (62, '小沈阳', '宋小宝'), (63, '土豆粉', '酸辣粉'), (64, '蜘蛛侠', '蝙蝠侠'), (65, '口香糖', '木糖醇'), (66, '酸菜鱼', '水煮鱼'), (67, '小笼包', '灌汤包'), (68, '薰衣草', '满天星'), (69, '张韶涵', '王心凌'), (70, '刘诗诗', '刘亦菲'), (71, '甄嬛传', '红楼梦'), (72, '甄子丹', '李连杰'), (73, '包青天', '狄仁杰'), (74, '大白兔', '金丝猴'), (75, '果粒橙', '鲜橙多'), (76, '沐浴露', '沐浴盐'), (77, '洗发露', '护发素'), (78, '自行车', '电动车'), (79, '班主任', '辅导员'), (80, '过山车', '碰碰车'), (81, '铁观音', '碧螺春'), (82, '十面埋伏', '四面楚歌'), (83, '成吉思汗', '努尔哈赤'), (84, '谢娜张杰', '邓超孙俪'), (85, '福尔摩斯', '工藤新一'), (86, '贵妃醉酒', '黛玉葬花'), (87, '流星花园', '花样男子'), (88, '神雕侠侣', '天龙八部'), (89, '天天向上', '非诚勿扰'), (90, '勇往直前', '全力以赴'), (91, '鱼香肉丝', '四喜丸子'), (92, '麻婆豆腐', '皮蛋豆腐'), (93, '语无伦次', '词不达意'), (94, '鼠目寸光', '井底之蛙'), (95, '近视眼镜', '隐形眼镜'), (96, '美人心计', '倾世皇妃'), (97, '夏家三千金', '爱情睡醒了'), (98, '降龙十八掌', '九阴白骨爪'), (99, '红烧牛肉面', '香辣牛肉面'), (100, '江南style', '最炫民族风'), (101, '梁山伯与祝英台', '罗密欧与朱丽叶');
/*!40000 ALTER TABLE `Words` ENABLE KEYS */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
