package com.yunuspektas.dpatterns.facade;

import static java.lang.System.*;

class SHAEncryptor {
    public void encrypt(String text, String key, boolean type) {
        if (type)
            out.println("<SHA>" + text + key + "</SHA>");
        else
            out.println("<SHA>" + key + text + "</SHA>");


    }
}
