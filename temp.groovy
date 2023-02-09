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
            node('Jenkins-EC2-Slave')
            cleanWs()
            stage ("Version Tag") {
              steps {
                 shell('echo hello')
                }  
                }
            ''' )
}
    }
