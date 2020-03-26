package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

public class App
{
    public static void main( String[] args )
    {
        Path myPom = Paths.get("pom.xml");

        System.out.println(myPom.toAbsolutePath());

        //practise1(myPom);

        //practise2();

        try {
            quiz3();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void practise1(Path myPath)
    {
        try (Stream<String> lines = Files.lines(myPath))
        {
            lines.forEach(System.out::println);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void practise2()
    {
        try (Stream<Path> myPaths = Files.list(Paths.get(".")))
        {
            myPaths.forEach(System.out::println);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void quiz3() throws IOException {
        Path p1 = Paths.get("peter");
        Path p2 = Paths.get("peter2");

        Files.move(p1, p2);
    }
}
