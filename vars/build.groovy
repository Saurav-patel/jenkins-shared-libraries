def call(String image_name,String tag_name ,String folder){
  sh "docker build -t ${image_name}:${tag_name} ${folder}"
}



