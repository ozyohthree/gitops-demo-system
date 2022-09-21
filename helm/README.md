# Helm Tutorial
```sh
# Helm commands

# Add chart repo
$ helm repo add bitnami https://charts.bitnami.com/bitnami

# Search repo
$ helm search repo bitnami

# Install example
$ helm repo update   
# helm install <release-name> <chart>
$ helm install nginx bitnami/nginx

# check pods 
$ oc get pods

# print list of helm installs
$ helm list

# create route on the webconsole

# uninstall 
$ helm unistall nginx

# Create a Chart
$ helm create <chart name>

# Templating
$ helm template <chart name>

```
# Deploy System App


1. create a dev environment/project/namespace
```
$ oc new-project dev
```

2. Deploy
```sh
$ helm install system-app helm/deploy --set metadata.namespace=dev
```

3. check pods
```sh
$ oc get pods -w
```

4. check helm installations
```sh
$ helm list
```

5. Check deployment on webconsole

6. Update limit and do upgrade
```sh
$ helm upgrade -i system-app helm/deploy --set metadata.namespace=dev
```

7. Break deployment with bad image and upgrade repeat 6 above

8. Validate on webconsole its broken and Rollback to REVISION 1 either on Webconsole or 
```sh
$ helm list
$ helm rollback system-app 1
```

## Deploy to Performance Testing (PT) environment uses HPA
9. Create environment (if needed)
```sh
$ oc new-project pt
```

10. Deploy to PT
```sh
$ helm install system-app helm/deploy -f helm/deploy/values-pt.yaml --set metadata.namespace=pt
```

11. Validate deployment on Terminal or Console

12. Undeploy 
```sh
$ helm uninstall system-app
```












```
