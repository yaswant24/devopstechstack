def test(name){
  echo "Hey ${name}"
  git credentialsId: 'Testing-devops', url: 'https://github.com/Devops-Techstack/git-demo.git'
  sh "ls"
}
