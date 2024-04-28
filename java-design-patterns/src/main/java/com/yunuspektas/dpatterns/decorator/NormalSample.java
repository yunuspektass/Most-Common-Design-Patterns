package com.yunuspektas.dpatterns.decorator;

public class NormalSample {

    public static class Iphone11{
        public String name(){
            return "Iphone 11";
        }
        int getCameraCount(){
            return 2;
        }
    }
    public static class Iphone11Pro{
        public String name(){
            return "Iphone 11 Pro";
        }
        int getCameraCount(){
            return 3;
        }
    }
    public static class Iphone11Max{
        public String name(){
            return "Iphone 11 Pro Max";
        }
        int getCameraCount(){
            return 3;
        }
    }

}
