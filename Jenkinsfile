node { 
    stage('Stage 1') { 
        sh 'pwd' 
        sh 'java -version' 
    } 
    
    stage('stage 2') {
          sh 'docker version' 
     }
    
    stage('build') {
          sh 'cd springboot-sapmple'
          sh 'chmod 755 ./mvnw' 
          sh './mvnw clean package'
     }
    
    
}
