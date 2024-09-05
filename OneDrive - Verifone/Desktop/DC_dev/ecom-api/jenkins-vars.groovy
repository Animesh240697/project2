// App vars
env.APP_NAME = 'ecom-api'
env.APP_CONFIG_DIR= 'app_config'
env.APP_CONFIG_FILE= 'ecom-api-ac-config.yaml'
env.DEVOPS_CONFIG_FILE='ecom-api-devops-config.yaml'
env.DEPLOY_ENV= 'dev'
env.APP_CONFIG_REPO_BRANCH= 'dev'

// SCM vars
env.SCM_CRED_ID='VCS_DEVOPS_PVT_KEY'
env.APP_CONFIG_REPO_URL='ssh://git@bitbucket.vficloud.net:7999/ac/greenbox.git'

// Helm vars
env.HELM_REPO_URL='http://artifactory-new-93bf8f5a14c88dd6.elb.eu-west-2.amazonaws.com:8082/artifactory'
env.HELM_REPO='charts.non-prod.dev.virtual'
env.HELM_REPO_CRED_ID='helm-non-prod-cred'
env.COMMON_CHART_NAME='ecom-api'
env.HELM_CHART_VERSION='1.0.2'

// K8s vars
env.KUBE_CONFIG_ID='DEV-INT-ECOM-KUBE-CONFIG'
env.NAMESPACE='ecom'

// Docker image vars
env.REG_URL = "docker-grs.artifactory.verifone.com"
env.I_REPO_CRED= 'ARTICREDCORP'
env.REG_PRTCL = "https"

// AWS vars
env.AWS_ACC_ID= '594047390826'
env.AWS_ROLE_NAME= 'Dev-EKS-Application-Deploy'
env.AWS_ROLE_SESSION_NAME= 'jenkins-app-deploy'
env.REGION= 'eu-west-2'
env.CLUSTER_NAME= 'dev-eu-west-2-verifone'