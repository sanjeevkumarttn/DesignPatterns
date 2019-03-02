package com.DesignPatterns;

public class Question1 {
    public static void main(String[] args) {

        System.out.println(DBConnection.getInstance());
        System.out.println(DBConnection.getInstance());
    }
}


class DBConnection {

    private static DBConnection OracleConnection;
    private int portNumber;
    private String database;

    private DBConnection(int portNumber, String database) {
        this.portNumber = portNumber;
        this.database = database;
    }

    static DBConnection getInstance() {
        if (OracleConnection == null)
            OracleConnection = new DBConnection(8080, "Oracle");
        return OracleConnection;
    }

    @Override
    public String toString() {
        return "DBConnection{" +
                "portNumber=" + portNumber +
                ", database='" + database + '\'' +
                '}';
    }
}
