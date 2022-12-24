package org.example;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Mojo(name = "generateResource")
public class GenerateTestResource extends org.apache.maven.plugin.AbstractMojo{

    @Parameter(property = "path", defaultValue = "\\src\\test\\resources")
    private String path;

    @Parameter(property = "fileName", defaultValue = "test.txt")
    private String fileName;

    @Parameter(property = "testText")
    private String testText;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        Path projectPath = Paths.get("");
        StringBuilder stringBuilder = new StringBuilder(projectPath.toAbsolutePath().toAbsolutePath().toString())
                .append(path);
        File f1 = new File(stringBuilder.toString());
        File f2 = new File(stringBuilder.toString(), fileName);
        getLog().info(stringBuilder.toString());
        try {
            if (!f1.exists()){
                f1.mkdir();
            }
            f2.createNewFile();
            Files.write(Path.of(stringBuilder.append(File.separator).append(fileName).toString()), testText.getBytes());
        } catch (IOException e) {
            throw new MojoFailureException(e.getMessage(), e.getCause());
        }
    }

}
