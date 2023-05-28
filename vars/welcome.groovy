def test(name){
  echo "Hey ${name}"
  git credentialsId: 'Testing-devops', url: 'https://github.com/yaswant24/devopstechstack.git'
  sh "ls"
}
