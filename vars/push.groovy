def call(String image_name,String tag){
  
  withCredentials([usernamePassword(credentialsId: "dockerhub-cred",
                usernameVariable: "Docker_username",
                passwordVariable: "Docker_pass")]){
    sh """ docker login -u $Docker_username -p $Docker_pass
          docker tag ${image_name}:${tag} $Docker_username/${image_name}:${tag}
           docker push $Docker_username/${image_name}:${tag} """
  }
}
    







 
