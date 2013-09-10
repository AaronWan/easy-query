package org.codeanywhere.easyQuery.test;

import static com.mysema.query.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.mysema.query.types.Path;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.DateTimePath;
import com.mysema.query.types.path.NumberPath;
import com.mysema.query.types.path.StringPath;

/**
 * QFileVersion is a Querydsl query type for QFileVersion
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QFileVersion extends com.mysema.query.sql.RelationalPathBase<QFileVersion> {

    private static final long                                  serialVersionUID = -1105901109;

    public static final QFileVersion                           fileVersion      = new QFileVersion(
                                                                                        "file_version");

    public final DateTimePath<java.sql.Timestamp>              gmtCreated       = createDateTime(
                                                                                        "gmt_created",
                                                                                        java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp>              gmtModified      = createDateTime(
                                                                                        "gmt_modified",
                                                                                        java.sql.Timestamp.class);

    public final NumberPath<Integer>                           id               = createNumber(
                                                                                        "id",
                                                                                        Integer.class);

    public final StringPath                                    keyName          = createString("key_name");

    public final StringPath                                    version          = createString("version");

    public final com.mysema.query.sql.PrimaryKey<QFileVersion> primary          = createPrimaryKey(id);

    public QFileVersion(String variable) {
        super(QFileVersion.class, forVariable(variable), "null", "file_version");
    }

    @SuppressWarnings("all")
    public QFileVersion(Path<? extends QFileVersion> path) {
        super((Class) path.getType(), path.getMetadata(), "null", "file_version");
    }

    public QFileVersion(PathMetadata<?> metadata) {
        super(QFileVersion.class, metadata, "null", "file_version");
    }

}
