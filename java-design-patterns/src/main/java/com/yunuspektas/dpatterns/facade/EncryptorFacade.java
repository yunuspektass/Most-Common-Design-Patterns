package com.yunuspektas.dpatterns.facade;

public class EncryptorFacade {
    String text = "Content";
    private AESEncryptor aesEncryptor = new AESEncryptor();
    private MD5Encryptor md5Encryptor = new MD5Encryptor();
    private SHAEncryptor shaEncryptor = new SHAEncryptor();

    public void encrypt(String text, EncType encType) {
        switch (encType) {
            case AES -> aesEncryptor.encrypt(text);
            case MD5 -> md5Encryptor.encrypt(text, "KEY");
            case SHA -> shaEncryptor.encrypt(text, "KEY", true);
            default -> throw new IllegalArgumentException(encType.toString());
        }
    }

    public enum EncType {
        SHA,
        MD5,
        AES;
    }
}
