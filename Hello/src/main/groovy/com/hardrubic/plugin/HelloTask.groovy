package com.hardrubic.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class HelloTask extends DefaultTask {

    @TaskAction
    def say(){
        println 'hello world'
    }
}