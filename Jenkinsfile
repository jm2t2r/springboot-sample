node { 
    stage('Stage 1') { 
        sh 'pwd' 
        sh 'java -version' 
    } 
    
    stage('stage 2') {
          sh 'docker version' 
     }
    
    stage('build') {
        sh 'pwd'
        dir('springboot-sample') {
           sh 'pwd'
           sh 'chmod 755 ./mvnw' 
           sh './mvnw clean package'
            
        }
        sh 'pwd'
       
     }
    
     stage('dockerizing') {
        sh 'pwd'
        dir('springboot-sample') {
           sh 'pwd'
           sh 'docker build -t jm2t2r/springboot-sample:dev .' 
        }
        sh 'pwd'
       
     }
    
      stage('image push') {
        sh 'pwd'
        dir('springboot-sample') {
           sh 'pwd'
           sh 'docker push jm2t2r/springboot-sample:dev ' 
        }
        sh 'pwd'
       
     }
    
     stage('deploy to k8s') {
        sh 'pwd'
        sh 'kubectl delete -f /home/linux/yaml/springboot-sample.yaml'
        sh 'kubectl apply -f /home/linux/yaml/springboot-sample.yaml'
     }
    
    
}
