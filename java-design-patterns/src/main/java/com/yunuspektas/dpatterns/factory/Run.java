package com.yunuspektas.dpatterns.factory;

public class Run {
    public static void main(String[] args) {
        String file = FileExporterFactory.getInstance(FileExporterFactory.FileType.EXCEl)
                .export("Test content");

        System.out.println(file);



    }
}
