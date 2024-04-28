package com.yunuspektas.dpatterns.singleton;

import com.yunuspektas.dpatterns.factory.FileExporterFactory;

public class Run {
    public static void main(String[] args) {
        EagerInitializationSingleton.getInstance().singletonTest();

        StaticBlockSingleton.getStaticBlockSingleton().singletonTest();

        LazySingleton.getLazySingleton().singletonTest();

        ThreadSafeSingleton.getThreadSafeSingleton().singletonTest();

   BillPughSingleton.getInstance().singletonTest();


    FileExporterFactory.getInstance(FileExporterFactory.FileType.PDF).export("Deneme");
    }
}
