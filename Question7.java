package com.DesignPatterns;

import java.util.ArrayList;
import java.util.List;

//Component
interface Directory {
    void showDirectoryDetails();
}

//Leaf
class Developer implements Directory {
    private String name;
    private String favoriteLanguage;

    Developer(String name, String favoriteLanguage) {
        this.name = name;
        this.favoriteLanguage = favoriteLanguage;
    }

    @Override
    public void showDirectoryDetails() {
        System.out.println("Developer{" +
                "name='" + name + '\'' +
                ", favoriteLanguage='" + favoriteLanguage + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", favoriteLanguage='" + favoriteLanguage + '\'' +
                '}';
    }
}

//leaf
class Manager implements Directory {

    private String name;
    private String type;

    Manager(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void showDirectoryDetails() {
        System.out.println("Manager{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

//Composite
class DeveloperDirectory implements Directory {

    List<Directory> developerDirectory = new ArrayList<>();

    @Override
    public void showDirectoryDetails() {
        System.out.println("Developer Directory");
        developerDirectory.forEach(Directory::showDirectoryDetails);
    }
}

//Composite
class ManagerDirectory implements Directory {

    List<Directory> managerDirectory = new ArrayList<>();

    @Override
    public void showDirectoryDetails() {
        System.out.println("Manager Directory");
        managerDirectory.forEach(Directory::showDirectoryDetails);
    }
}

//Composite

class CompanyDirectory implements Directory {

    List<Directory> companyDirectory = new ArrayList<>();

    @Override
    public void showDirectoryDetails() {
        companyDirectory.forEach(Directory::showDirectoryDetails);
    }
}


public class Question7 {

    public static void main(String[] args) {

        Developer developer1 = new Developer("John", "Java");
        Developer developer2 = new Developer("Sam", "C#");

        Manager manager1 = new Manager("Devin", "Associate");
        Manager manager2 = new Manager("James", "Senior");

        DeveloperDirectory developerDirectory = new DeveloperDirectory();
        developerDirectory.developerDirectory.add(developer1);
        developerDirectory.developerDirectory.add(developer2);

        ManagerDirectory managerDirectory = new ManagerDirectory();
        managerDirectory.managerDirectory.add(manager1);
        managerDirectory.managerDirectory.add(manager2);

        CompanyDirectory companyDirectory = new CompanyDirectory();
        companyDirectory.companyDirectory.add(developerDirectory);
        companyDirectory.companyDirectory.add(managerDirectory);

        companyDirectory.showDirectoryDetails();
    }
}
