package org.example;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "helloMaven")
public class HelloMaven extends org.apache.maven.plugin.AbstractMojo {

    @Parameter(property = "helloMaven.msg", defaultValue = "hello Maven!")
    private String msg;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info(this.msg);
    }
}
