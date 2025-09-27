def call(String image_name, String folder){
  sh "docker build -t ${image_name} ${folder}"
}



