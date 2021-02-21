DROP
DATABASE IF EXISTS testennadb;
CREATE
DATABASE testennadb;

GRANT ALL PRIVILEGES ON *.* TO
'root'@'localhost' WITH GRANT OPTION;

DROP
USER 'testennadbadmin'@'localhost';
CREATE
USER 'testennadbadmin'@'localhost' identified by 'testennadbadmin';
GRANT ALL PRIVILEGES ON testennadb.* TO
'testennadbadmin'@'localhost' WITH GRANT OPTION;

use
testennadb;

CREATE TABLE `dummytable`
(
    `pid`          int          NOT NULL AUTO_INCREMENT,
    `dummytableId` varchar(100) NOT NULL,
    `mandatorId`   varchar(100) NOT NULL,
    `info`         varchar(100),
    `intValue`     bigint,
    `dateValue`    datetime,
    `booleanValue` char(1),
    `version`      int          NOT NULL,
    PRIMARY KEY (`pid`)
);
