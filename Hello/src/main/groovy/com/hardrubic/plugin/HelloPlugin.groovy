package com.hardrubic.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class HelloPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task('hello', type: HelloTask, group: 'mygroup', description: 'print hello')
    }
}