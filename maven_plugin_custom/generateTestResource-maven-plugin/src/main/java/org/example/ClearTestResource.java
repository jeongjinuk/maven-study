package org.example;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "generateResource")
public class ClearTestResource extends org.apache.maven.plugin.AbstractMojo{

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {

    }
}
