def runAnsibleJobs(jobs)
{
    def ansible_job = ansibleTower(
        jobTemplate: 'Jenkins', 
        jobType: 'run', 
        throwExceptionWhenFail: false, 
        towerCredentialsId: 'Ansibletower', 
        towerLogLevel: 'false', 
        towerServer: 'Ansibletower' 
    )
}