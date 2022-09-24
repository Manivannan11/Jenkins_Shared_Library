def call()
{
        ansibleTower(
            jobTemplate: 'Jenkins', 
            jobType: 'run', 
            throwExceptionWhenFail: false, 
            towerCredentialsId: 'Ansibletower', 
            towerLogLevel: 'false', 
            towerServer: 'Ansibletower' 
    )
}
