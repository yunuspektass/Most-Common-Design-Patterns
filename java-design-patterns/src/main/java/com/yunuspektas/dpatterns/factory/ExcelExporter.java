package com.yunuspektas.dpatterns.factory;

 class ExcelExporter implements FileExporter{
    @Override
    public String export(String content) {
        return "EXCEl -> " + content;
    }
}
