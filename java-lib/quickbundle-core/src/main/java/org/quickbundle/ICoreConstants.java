package org.quickbundle;

import java.util.HashMap;
import java.util.Map;

/**
 * 保存全局的一些常量
 * 
 * @author  
 * @version 1.0.0
 * @see 需要参见的其它类
 * @since 1.0.0
 */
public interface ICoreConstants {
    //修改创建时间和修改时间同时填的 bug modify by longsebo 2015-08-21
    //系统级定义    
    public final static String[] DESC_CREATE_DATE = new String[]{"create_date", "modify_date", "ts","create_time"};  //描述创建时间
    public final static String[] DESC_CREATE_IP = new String[]{"create_ip"};  //描述创建IP
    public final static String[] DESC_CREATE_USER_ID = new String[]{"create_user_id"};  //描述创建用户ID
    public final static String[] DESC_MODIFY_DATE = new String[]{"modify_date", "ts","modify_time"};  //描述修改时间
    public final static String DESC_MODIFY_IP = "modify_ip";  //描述修改IP
    public final static String DESC_MODIFY_USER_ID = "modify_user_id";  //描述修改用户ID

   //增加逻辑删除相关常量 add by longsebo 2015-08-21
    public final static String[] DESC_DELETE_DATE = new String[]{"delete_time", "delete_date"};  //描述删除时间
    public final static String[] DESC_DELETE_IP = new String[]{"delete_ip"};  //描述删除IP
    public final static String[] DESC_DELETE_USER_ID = new String[]{"delete_user_id"};  //描述删除用户ID
    public final static String DESC_DELETE_FLAG = "delete_flag";  //描述删除用户ID

    //数据库定义
    //数据库定义
	public static enum DatabaseProductType{
		MYSQL("MySQL"),
		POSTGRESQL("PostgreSQL"),
		ORACLE("Oracle"),
		DB2("DB2"),
		SQLSERVER("Microsoft SQL Server"),
		H2("H2"),
		HSQL("HSQL Database Engine");
		
		private String databaseProductName;
		private DatabaseProductType(String databaseProductName_) {
			this.databaseProductName = databaseProductName_;
		}
		public String getDatabaseProductName() {
			return databaseProductName;
		}
	}
	
	@SuppressWarnings("serial")
	public final static Map<String, String> DATABASE_PRODUCT_MAP = new HashMap<String, String>() {
		{
			this.put("com.mysql.jdbc.Driver", DatabaseProductType.MYSQL.getDatabaseProductName());
			this.put("org.postgresql.Driver", DatabaseProductType.POSTGRESQL.getDatabaseProductName());
			this.put("org.gjt.mm.mysql.Driver", DatabaseProductType.MYSQL.getDatabaseProductName());
			this.put("oracle.jdbc.driver.OracleDriver", DatabaseProductType.ORACLE.getDatabaseProductName());
			this.put("com.ibm.db2.jcc.DB2Driver", DatabaseProductType.DB2.getDatabaseProductName());
			this.put("net.sourceforge.jtds.jdbc.Driver", DatabaseProductType.SQLSERVER.getDatabaseProductName());
			this.put("org.h2.Driver", DatabaseProductType.H2.getDatabaseProductName());
			this.put("org.hsqldb.jdbcDriver", DatabaseProductType.HSQL.getDatabaseProductName());
		}
	};
	
	public final static String DEFAULT_DATA_SOURCE = "dataSource";
	 
    public final static String DESC_USABLE_STATUS = "usable_status";
    public final static String RM_YES = "1";  //是的定义
    public final static String RM_NO = "0";  //否的定义
    
    public final static String RM_PAGE_SIZE = "RM_PAGE_SIZE";
    public final static String RM_CURRENT_PAGE = "RM_CURRENT_PAGE";
    public final static String RM_PAGE_VO = "RM_PAGE_VO";
    public final static String RM_ORDER_STR = "RM_ORDER_STR";
    
    public static final String RM_ACTION_URI = "RM_ACTION_URI";

    //Action返回值的key
    public final static String RM_AJAX_JSON = "RM_AJAX_JSON";
    public final static String RM_AJAX_RECORD_SIZE = "RM_AJAX_RECORD_SIZE";
    public final static String RM_AJAX_SPLIT_KEY = "$";
    
    //工作流参数
    public final static String INSERT_FORM_ID = "INSERT_FORM_ID";
    public final static String WF_FORM_ID = "WF_FORM_ID";
}
