package com.modernjava.javaimprovments;

public class MultiLineTextBlockExample {
    public static void main(String[] args) {
        String str1 = """
                Hello World
                Using
                text blocks !""";

        System.out.println("str1 = " + str1);

        String phrase = """
                {
                employee : "Mike",
                employeeId : 10001
                employeeType : FT
                }
                """;
        System.out.println("phrase = " + phrase);

        String html = """
                <html>
                    <body>
                    <p>"Java, Programming"</p>
                    </body>
                </html>
                """;
        System.out.println("html = " + html);

        String str2 = str1.concat("This is my first text block");
        System.out.println("str2 = " + str2);
    }
}
