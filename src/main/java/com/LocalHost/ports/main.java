package com.LocalHost.ports;

public class main {
    static CheckPort check = new CheckPort();
    public static void main(String[] args) throws Exception {

        System.out.println("    __                     ____  __           __     ____             __ \n" +
                "   / /   ____  _________ _/ / / / /___  _____/ /_   / __ \\____  _____/ /_\n" +
                "  / /   / __ \\/ ___/ __ `/ / /_/ / __ \\/ ___/ __/  / /_/ / __ \\/ ___/ __/\n" +
                " / /___/ /_/ / /__/ /_/ / / __  / /_/ (__  ) /_   / ____/ /_/ / /  / /_  \n" +
                "/_____/\\____/\\___/\\__,_/_/_/ /_/\\____/____/\\__/  /_/    \\____/_/   \\__/  \n" +
                "                                                                         \n");
        System.out.println("Checking The Port...");
        check.Check();

    }
}
