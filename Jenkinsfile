node { 
    stage('Stage 1') { 
        sh 'pwd' 
        sh 'java -version' 
    } 
    
    stage('stage 2') {
          sh 'docker version' 
     }
    
     stage('Clone repository') {
          sh 'git clone https://github.com/jm2t2r/springboot-sample.git' 
     }
    
     stage('build') {
          sh 'chmod 755 mvnw' 
          sh './mvnw clean package'
     }
    
    
}
