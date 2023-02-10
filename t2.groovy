pipelineJob("git") {        
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
        stringParam {
            name('ENVI')
            defaultValue('')
            description('')
            trim(false)
        }}
}
