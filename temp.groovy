pipelineJob("${FolderName}/AVHANA-internal-jobs/git-release") {        


definition {
        cpsFlowDefinition {
            sandbox(true)
            script('''

agent any
{
    cleanWs()    
    stage ("Version Tag") {
        
    }
  steps{
    shell('echo $PWD')
  }
}'''