package com.beitie.exception;

public class SqlExcutionException extends RuntimeException{
    public SqlExcutionException() {
    }

    public SqlExcutionException(String var1) {
        super(var1);
    }

    public SqlExcutionException(String var1, Throwable var2) {
        super(var1, var2);
    }

    public SqlExcutionException(Throwable var1) {
        super(var1);
    }

}
