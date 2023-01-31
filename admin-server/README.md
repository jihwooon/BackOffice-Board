## admin-server

### 개발환경 설정
> 도커가 설치되지 않았다면 설치 해줍니다.  

```shell
brew install docker
```

도커 실행 명령어는 다음과 같습니다.
```bash
docker run --name admin-board \                                                         
-v $(pwd)/db:/var/lib/mysql \
-e MYSQL_ROOT_PASSWORD=root1234 \
-e MYSQL_DATABASE=admin \
-d -p 3308:3306 mariadb:10.8.3 \
--character-set-server=utf8mb4 \
--collation-server=utf8mb4_unicode_ci
```

Docker container 접속하기
```bash
docker exec -it admin-board mariadb -u root -p
```
