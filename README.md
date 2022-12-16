# kafkaApp
It’s very easy if you brew installer with Kafka on Mac.


We must open 6 terminals to install kafka, start zookeeper, start kafka, create kafka topics, consumer and producer.

1.	$brew install kafka
2.	$ zookeeper-server-start /usr/local/etc/kafka/zookeeper.properties
3.	$ kafka-server-start /usr/local/etc/kafka/server.properties
4.	$ kafka-topics --bootstrap-server localhost:9092 --topic <topic-name> --create --partitions 1 --replication-factor 1
5.  $ kafka-console-consumer --bootstrap-server localhost:9092 --topic localTopic --from-beginning
6.  $ kafka-console-producer --broker-list localhost:9092 --topic localTopic

