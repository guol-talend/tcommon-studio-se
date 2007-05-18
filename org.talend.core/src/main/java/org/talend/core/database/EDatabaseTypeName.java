// ============================================================================
//
// Talend Community Edition
//
// Copyright (C) 2006-2007 Talend - www.talend.com
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
//
// ============================================================================
package org.talend.core.database;

/**
 * qzhang class global comment. Detailled comment <br/>
 * 
 */
public enum EDatabaseTypeName {
    MYSQL("MySQL", "MySQL", new Boolean(false), "MYSQL"),
    PSQL("PostgreSQL", "PostgreSQL", new Boolean(true), "POSTGRESQL"),
    ORACLEFORSID("Oracle", "Oracle with SID", new Boolean(true), "ORACLE"),
    ORACLESN("Oracle with service name", "Oracle with service name", new Boolean(true), "ORACLE"),
    GODBC("Generic ODBC", "Generic ODBC", new Boolean(false), "MSODBC"),
    MSODBC("Microsoft SQL (Odbc driver)", "Microsoft SQL Server (Odbc driver)", new Boolean(false), "MSODBC"),
    IBMDB2("IBM DB2", "IBM DB2", new Boolean(false), "IBMDB2"),
    SYBASEASE("SybaseASE", "Sybase ASE", new Boolean(false), "MYSQL"),
    // this Sybase IQ not used.
    SYBASEIQ("Sybase IQ", "Sybase IQ", new Boolean(false), "MYSQL"),
    MSSQL("MSSQL", "Microsoft SQL Server", new Boolean(false), "MYSQL"),
    // this don't use in Branch 2.0
    INGRES("Ingres", "Ingres", new Boolean(false), "MYSQL");

    // displayName is used in Java code.
    private String displayName;

    private Boolean isNeedSchema;

    // dbType is used in compnonent XML file.
    private String dbType;

    // product used for the mappings.
    private String product;

    public String getDisplayName() {
        return this.displayName;
    }

    public Boolean isNeedSchema() {
        return this.isNeedSchema;
    }

    public String getXmlName() {
        return this.dbType;
    }

    public String getProduct() {
        return this.product;
    }

    EDatabaseTypeName(String dbType, String displayName, Boolean isNeedSchema, String product) {
        this.displayName = displayName;
        this.isNeedSchema = isNeedSchema;
        this.dbType = dbType;
        this.product = product;
    }

    // public static String getDisplayNameFromDbType(String dbType) {
    // for (EDatabaseTypeName typename : EDatabaseTypeName.values()) {
    // if (typename.getXmlName().equals(dbType)) {
    // return typename.getDisplayName();
    // }
    // }
    // return dbType;
    // }
    //
    // public static Boolean isNeedSchemaFromDbType(String dbType) {
    // for (EDatabaseTypeName typename : EDatabaseTypeName.values()) {
    // if (typename.getDisplayName().equals(dbType)) {
    // return typename.getIsNeedSchema();
    // }
    // }
    // return new Boolean(false);
    // }
    //
    // public static Boolean isNeedSchema(String dbType) {
    // for (EDatabaseTypeName typename : EDatabaseTypeName.values()) {
    // if (typename.getXmlName().equals(dbType)) {
    // return typename.getIsNeedSchema();
    // }
    // }
    // return new Boolean(false);
    // }
    //
    // public static String getProductMappingId(String dbms) {
    // for (EDatabaseTypeName typename : EDatabaseTypeName.values()) {
    // if (typename.getDisplayName().equals(dbms)) {
    // return typename.getProduct();
    // }
    // }
    // return MYSQL.product;
    // }

    public static EDatabaseTypeName getTypeFromDbType(String dbType) {
        for (EDatabaseTypeName typename : EDatabaseTypeName.values()) {
            if (typename.getXmlName().equals(dbType)) {
                return typename;
            }
        }
        return MYSQL;
    }
    
    public static EDatabaseTypeName getTypeFromDisplayName(String displayName) {
        for (EDatabaseTypeName typename : EDatabaseTypeName.values()) {
            if (typename.getDisplayName().equals(displayName)) {
                return typename;
            }
        }
        return MYSQL;
    }
}
