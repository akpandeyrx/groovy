pipelineJob("Testing") {        
    logRotator {
        daysToKeep(20)
        numToKeep(20)
    }
    parameters {
        stringParam {
            name('REPO_URL')
            defaultValue('')
            description('')
            trim(false)
        }
    }
    definition {
        cpsFlowDefinition {
            sandbox(true)
            script('''
           pipeline{
    agent any
    
     stages {
        stage ("Build 1")  {
        steps {
        build job: "$GIT_RELEASE_PATH", parameters: [
                string(name: 'REPO_URL', value: "${REPO_URL}"),
                
         sh   'printenv'  
         sh "echo $REPO_URL"
        }
        }
}
}
            ''' )
}
    }
}
