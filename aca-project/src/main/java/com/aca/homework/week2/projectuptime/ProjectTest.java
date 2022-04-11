package com.aca.homework.week2.projectuptime;

import java.util.Scanner;

public class ProjectTest {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        Project[] projects = new Project[3];

        for (int i = 0; i < projects.length; i++) {
            projects[i] = createProject(start);
        }

        printProjects(projects);
    }



    public static Project createProject (long startTime) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the project name:");
        String projectName = scanner.nextLine();

        Project project = new Project();
        project.name = projectName;
        project.creationSeconds = ((System.currentTimeMillis() - startTime) / 1000);

        return project;
    }

    public static void printProjects(Project[] projects) {
        for (Project project : projects) {
            System.out.println(project.creationSeconds + " " + project.name);
        }
    }



}
