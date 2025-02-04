# contactDirectory
 rest api kullanılarak rehber uygulaması çalıştırmak
 postman için uygulama kullanımı
 ----------------------------------
main path "/rest/api/contact-directory"

bir kişi eklemek için: 
    POST methodu ile beraber http://localhost:8080/rest/api/contact-directory/save

tüm rehberi çekmek için: 
    GET methodu ile beraber http://localhost:8080/rest/api/contact-directory/list

bir kişiyi id'si ile veritabanından çekmek için:
    GET methodu ile beraber http://localhost:8080/rest/api/contact-directory/list/{id}

bir kişiyi id'si ile veritabanından silmek için:
    DELETE methodu ile beraber http://localhost:8080/rest/api/contact-directory/delete/{id}

bir kişiyi güncellemek için:
    POST methodu ile beraber   http://localhost:8080/rest/api/contact-directory/update/{id}



MySQL bağlantısı için src/main/resources/application.properties içerisindeki sql bağlantı kodları
spring.application.name=spring-data-jpa-contact

## MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/mysqli
spring.datasource.username=root
spring.datasource.password=1234

# create and drop table, good for testing, production set to none or comment it
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
