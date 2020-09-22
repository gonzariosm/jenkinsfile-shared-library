def call(env) {
    return "pipelineFor" + "${env.APP}" + "${env.BRANCH_NAME}".capitalize() 
}