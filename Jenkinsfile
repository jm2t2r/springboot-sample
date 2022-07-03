node { 
    stage('Stage 1') { 
        sh 'pwd' 
        sh 'java -version' 
    } 
    
    stage('stage 2') {
          sh 'docker version' 
     }
    
    stage('build') {
        sh "pwd"
        dir('springboot-sample') {
           sh "pwd"
        }
        sh 'chmod 755 ./mvnw' 
        sh './mvnw clean package'
     }
    
    
}
