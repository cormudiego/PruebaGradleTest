pipeline{
//En que agente esto va a estar corriendo
agent any
//Que herramientas vamos a esta instalando al principo
tools{
    gradle "Gradle"
}

stages{
      stage("Tareas de limpieza"){
          steps{
              //Agarrar el repo en el que esta el codigo que necesitamos correr
              checkout scmGit(branches: [[name: 'main']],userRemoteConfigs: [[url: 'https://github.com/cormudiego/PruebaGradleTest.git']])
              //Ejecutar la tarea clean de gradle
              bat 'gradlew.bat clean'
          }
      }
      stage("Imprimir cosas"){
         steps{
             echo "Soy un Stage aparte"
         }
      }
}
}

