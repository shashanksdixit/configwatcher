# How to run
Clone the repo.
Compile and create docker image.
Upload image to your repo.

## Compile and create the docker image
```
mvn clean install -DskipTests
docker build -t logconfig .
docker tag logconfig <your_repo>/logconfig
docker push <your_repo>/logconfig
```

## Modify kubernetes files
Modify deployment files replacing your image from your repository. The kubernetes files are in kube folders. There are three folders. You can use any one. The only difference is configmap has more or less parameters.
The watcher has 2 mins refresh wait period. You can modify it to less than this. 

```
name: SPRING_CLOUD_KUBERNETES_CONFIGURATION_WATCHER_REFRESHDELAY
              value: "120000"
```

## Deploy watcher and create kubernetes objects
```
kubectl apply -f kube2/
```

## Test
Check the custom property by calling api
```
curl -X GET http://localhost:8080/api/config
Output : Current value of 'my.custom.property' is: <Value>
```
Change the value of my.custom.property in ConfigMap.yaml and 
```
kubectl apply -f kube2/0_configmap.yaml
```
[wait for refresh period - 2 mins or check the logs of watcher, wait till it calls /actuator/refresh
```
curl -X GET http://localhost:8080/api/config
Output : Current value of 'my.custom.property' is: <TheNewValue>
```




