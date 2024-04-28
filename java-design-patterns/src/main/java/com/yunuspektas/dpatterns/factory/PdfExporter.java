package com.yunuspektas.dpatterns.factory;

 class PdfExporter implements  FileExporter{
    @Override
    public String export(String content) {
        return "PDF -> " + content;
    }
}
