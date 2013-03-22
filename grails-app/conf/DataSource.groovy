dataSource {
    pooled = true
    driverClassName = "org.h2.Driver"
    username = "sa"
    password = ""
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
    development {
        dataSource {
            pooling = true
            dbCreate = "update"
            url = "jdbc:mysql://192.168.1.250/ens_dev"
            driverClassName = "com.mysql.jdbc.Driver"
            username = "ens"
            password = "ens"
            //dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
            //url = "jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
        }
    }
    test {
        dataSource {
            pooling = true
            dbCreate = "update"
            url = "jdbc:mysql://192.168.1.250/ens_test"
            driverClassName = "com.mysql.jdbc.Driver"
            username = "ens"
            password = "ens"
            //dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
            //url = "jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
        }
    }
    production {
        dataSource {
            pooling = true
            dbCreate = "update"
            url = "jdbc:mysql://192.168.1.250/ens_prod"
            driverClassName = "com.mysql.jdbc.Driver"
            username = "ens"
            password = "ens"
            //dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
            //url = "jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
            properties {
               maxActive = -1
               minEvictableIdleTimeMillis=1800000
               timeBetweenEvictionRunsMillis=1800000
               numTestsPerEvictionRun=3
               testOnBorrow=true
               testWhileIdle=true
               testOnReturn=true
               validationQuery="SELECT 1"
            }
        }
    }
}
