package org.codeanywhere.easyQuery.test;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import com.mysema.query.sql.MySQLTemplates;
import com.mysema.query.sql.SQLQuery;
import com.mysema.query.sql.SQLTemplates;
import com.mysema.query.sql.codegen.MetaDataExporter;

public class TestQuerydsl {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Class.forName("org.gjt.mm.mysql.Driver").newInstance();
        String url = "jdbc:mysql://10.249.192.156:3306/cloud_eye?user=root&password=root&useUnicode=true&characterEncoding=8859_1";
        Connection conn = DriverManager.getConnection(url);
        QFileVersion qfv = QFileVersion.fileVersion;

        SQLTemplates dialect = new MySQLTemplates(); // SQL-dialect
        SQLQuery query = new SQLQuery(conn, dialect);
        List<String> keyNames = query.from(qfv).where(qfv.keyName.like("hello")).list(qfv.keyName);
        for (String key : keyNames) {
            System.out.println(key);
        }
    }

    void genCode(Connection conn) throws Exception {
        MetaDataExporter exporter = new MetaDataExporter();
        exporter.setPackageName("org.codeanywhere.test");
        exporter.setTargetFolder(new File("target/generated-sources/java"));
        exporter.export(conn.getMetaData());
    }

}
