
## Getting Started

# Delete connector
curl -X DELETE {url}/connector/{connector_name}

curl -X DELETE http://192.168.1.16:8083/connectors/location-sync-destination

curl -X DELETE http://localhost:8083/connectors/media-sync-destination

curl -X DELETE http://localhost:8083/connectors/kidssy-provider-page-connector


curl -i -X POST -H "Accept:application/json" -H  "Content-Type:application/json" http://localhost:8083/connectors/ -d @mysql-sink-postgres.json


curl -i -X POST -H "Accept:application/json" -H  "Content-Type:application/json" http://localhost:8083/connectors/ -d @location-sync-destination.json



bin/kafka-topics.sh --list --zookeeper zookeeper:2181

bin/kafka-console-consumer.sh --bootstrap-server kafka:9092 --topic oganizer_page --from-beginning


GRANT RELOAD ON *.* TO 'mysqluser'@'192.168.1.16';
