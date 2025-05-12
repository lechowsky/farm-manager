START DB

1. ```console 
    docker run -p3306:3306 --name mysql -v ~/mysql-data:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=root123 -d mysql/mysql-server
    ```
2. ```commandline
    docker exec -it mysql mysql -u root -proot123
    ```
3. ```commandline
   CREATE USER 'appuser'@'%' IDENTIFIED BY 'password';
   GRANT ALL PRIVILEGES ON *.* TO 'appuser'@'%';
   FLUSH PRIVILEGES;
   create database myfarm
   ```