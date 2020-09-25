# RabbitMQ
* 가장 먼저 rabbitmq 부터 설치하고 실행
* 도커가 가장 간편하므로, 아래처럼 docker-compose 를 작성
    ```dockerfile
    version: '3'
    
    services:
      rabbitmq:
        image: rabbitmq:management
        ports:
          - "5672:5672"
          - "15672:15672"
    ```
* 실행
    ```shell script
    # start
    docker-compose -f rabbitmq-compose.yml up
    # end
    docker-compose -f rabbitmq-compose.yml down
    ```
* 특별한 설정이 없으면 아래처럼 프로토콜이 생성
    * amqp : 5672
    * clustering : 25672
    * http : 15672
    * http/prometheus : 15692
    
# Consumer
* RabbitConfiguration : 기본 설정
* RabbitMessage : 주고 받을 객체
* RabbitMessageListener : 수신 서비스
    * 큐 이름으로 리슨을 하면서 RabbitMessage 객체로 받는다.
    * rabbitmq 자체의 Message 또는 다른 객체가 필요하다면 큐 이름으로 분리하는 것이 좋음.
* application.yml : 기본포트와 연결할 rabbitmq 정보