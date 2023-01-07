# Spring Boot Flyway 執行Migration
> 注意此範例 主要以 <b>Spring</b>運行 flyway

## 使用規則:
<ul>
<li>src/main/respources 目錄建立 資料夾放 migration 資源檔案</li>
<li><p><strong>預設</strong>DDL檔案命名規則 V1_3__add_table.sql
    <ol>
    <li>開頭版本一條底線( _ )</li>
    <li>兩條底線( __ )後接著英文描述.sql</li>
    </ol>
</li>
</ul>

## 運行方式

### Step1: pom.xml 添加 dependencies 
```
pom.xml

    #透過 java 運行 flyway
	<dependency>
		<groupId>org.flywaydb</groupId>
		<artifactId>flyway-core</artifactId>
	</dependency>
	<dependency>
		<groupId>org.flywaydb</groupId>
		<artifactId>flyway-mysql</artifactId>
	</dependency>

	# 注意 jdbc 版本照實際連線 mysql 版本為主
	<dependency>
		<groupId>mysql</groupId>
		<artifactId>mysql-connector-java</artifactId>
		<version>8.0.30</version>
	</dependency>

    # 安裝 spring data 才會在應用程式運行時 執行 flyway 
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-data-jpa</artifactId>
	</dependency>
```

### mvn Run flyway
<ul>
<li>檢視 migration 版本: mvn flyway:info</li>
<li>執行 migrate: mvn flyway:migrate</li>
</ul>

```
可選參數
-Dflyway.configFiles=設定檔位置
```
參考連結: 
<br>
1. [Spring 官方教學](https://www.baeldung.com/spring-boot-flyway-repair)
2. [Tericcabrel Blog](https://blog.tericcabrel.com/handle-database-migrations-in-a-springboot-application-with-flyway/)
3. [Flyway 常見配置](https://cloud.tencent.com/developer/article/1399841)
4. [SpringData](https://blog.csdn.net/qq_33439525/article/details/105271088)
